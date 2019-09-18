import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main( String[] args ) throws IOException {
        int idID = 49;
        // Transforma o arquivo em um charstream
        String fileName = "./Files/teste.txt";
        CharStream charstream = CharStreams.fromFileName(fileName);

        // Gera uma lista de tokens com base no scanner
        Scanner scanner = new Scanner(charstream);
        CommonTokenStream commontokenstream = new CommonTokenStream(scanner);
        commontokenstream.fill();
        List<Token> tokens = commontokenstream.getTokens();

//        // imprime os tokens
//        for (int i =0; i < tokens.size(); ++i){
//            System.out.println(tokens.get(i));
//        }

        //
        TabelaDeSimbolos table = new TabelaDeSimbolos();
        auxiliar aux= new auxiliar();
        ArrayList<String> errors = aux.errorCheck(tokens);
       //se não existirem erros exibe a tabela de simbolos
        if(errors.isEmpty()) {
            System.out.println("Compiled with succes");
            for (int i =0; i < tokens.size(); ++i) {
                if (tokens.get(i).getType() == idID ){
                    table.inserir(tokens.get(i).getText(), 0, tokens.get(i).getLine(), tokens.get(i).getStartIndex());
                }
            }
            System.out.println(table);
        }
        // caso contrário exibe os erros
        else{

            for (int i = 0; i < errors.size(); ++i){
                System.out.println(errors.get(i));
            }
        }
    }

}
