import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import java.io.IOException;
import java.util.List;

public class main {
    public static void main( String[] args ) throws IOException {
        int idNum = 47;
        int idID = 46;
        // Transforma o arquivo em um charstream
        String fileName = "./Files/teste.txt";
        CharStream charstream = CharStreams.fromFileName(fileName);

        // Gera uma lista de tokens com base no scanner
        Scanner scanner = new Scanner(charstream);
        CommonTokenStream commontokenstream = new CommonTokenStream(scanner);
        commontokenstream.fill();
        List<Token> tokens = commontokenstream.getTokens();

        // para teste imprime os tokens
        for (int i =0; i < tokens.size(); ++i){
          //  System.out.println(tokens.get(i));
        }
        TabelaDeSimbolos table = new TabelaDeSimbolos();


        auxiliar auxi2 = new auxiliar();
        System.out.println(auxi2.errorCheck(tokens));
       //insere os tokens na tabela de simbolos

        for (int i =0; i < tokens.size(); ++i) {
            if (tokens.get(i).getType() == idID ){
                table.inserir(tokens.get(i).getText(), 0, tokens.get(i).getLine(), tokens.get(i).getStartIndex());
            }
        }
        System.out.println(table);
    }

}
