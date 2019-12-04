import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main( String[] args ) throws IOException {

        // ANÁLISE LÉXICA

        int idID = JMMParserLexer.ID;
        // Transforma o arquivo em um charstream
        String fileName = "./Files/series_com_erros.jmm";
        CharStream charstream = CharStreams.fromFileName(fileName);

        // Gera uma lista de tokens com base no lexer
        JMMParserLexer lexer = new JMMParserLexer(charstream);
        CommonTokenStream commontokenstream = new CommonTokenStream(lexer);
        commontokenstream.fill();
        List<Token> tokens = commontokenstream.getTokens();

//        // imprime os tokens
 //       for (int i =0; i < tokens.size(); ++i){
  //          System.out.println(tokens.get(i));
   //     }

        //
        TabelaDeSimbolos table = new TabelaDeSimbolos();
        LexerErrorHandler lexerErrorHandler = new LexerErrorHandler();

        // Encontra os erros léxicos, se existirem
        ArrayList<String> lexicalErrors = lexerErrorHandler.errorCheck(tokens);


        // ANÁLISE SINTÁTICA
        JMMParserParser parser = new JMMParserParser(commontokenstream);
        JMMParserParser.CompilationUnitContext tree = parser.compilationUnit();
        // System.out.println(tree.toStringTree());
        MeuVisitor visitor = new MeuVisitor();
        visitor.visit(tree);

        //se não existirem erros, exibe a tabela de símbolos
        if(lexicalErrors.isEmpty() && !visitor.hasError()) {
            System.out.println("Synctactic parsing completed with success");
            for (int i = 0; i < tokens.size(); ++i) {
                if (tokens.get(i).getType() == idID ) {
                    String idType = "__";
                    if(i > 0 && (tokens.get(i-1).getType() == lexer.BOOL || tokens.get(i-1).getType() == lexer.INT
                    || tokens.get(i-1).getType() == lexer.CHAR)){
                        idType = tokens.get(i-1).getText();
                    }
                    table.inserir(tokens.get(i).getText(), idType, tokens.get(i).getLine(), tokens.get(i).getCharPositionInLine());
                }
            }
            System.out.println(table);
        }
        // caso contrário exibe os erros léxicos, lembrando que os erros sintáticos serão exibidos automaticamente
        // caso existam
        else{
            for (int i = 0; i < lexicalErrors.size(); ++i){
                System.out.println(lexicalErrors.get(i));
            }
        }
    }

}
