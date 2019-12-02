import org.antlr.v4.runtime.Token;
import java.util.ArrayList;
import java.util.List;

public class LexerErrorHandler {
    ArrayList<String> errorCheck(List<Token> tokens) {
        ArrayList<String> errors = new ArrayList<String>();
        for (int i = 0; i < tokens.size() - 1; ++i) {
            switch (tokens.get(i).getType()) {
                // caso seja um erro de id começando com dígito
                case JMMParserLexer.ID_STARTSWITHDIGIT_ERROR:
                    errors.add("ID cannot start with digits" + tokens.get(i).getText() + " in line " + tokens.get(i).getLine() + " " + tokens.get(i).getCharPositionInLine());
                    break;
                // caso seja um erro no operador
                case JMMParserLexer.MULTIOPERATOR_ERROR:
                    errors.add ("Didn't understand what the operator " + tokens.get(i).getText() + " was meant to be in line " + tokens.get(i).getLine() + " " + tokens.get(i).getCharPositionInLine());
                    break;
                // caso seja um erro de numero comecando com 0
                case JMMParserLexer.INT_STARTSWITHZERO_ERROR:
                    errors.add("Num error in " + tokens.get(i).getText() + " in line " + tokens.get(i).getLine() + " " + tokens.get(i).getCharPositionInLine());
                    break;
                // caso seja um caracter desconhecido
                case JMMParserLexer.UNKNOWN_CHARACTER_ERROR:
                    errors.add("Could not recognize " + tokens.get(i).getText() + " in line " + tokens.get(i).getLine() + " " + tokens.get(i).getCharPositionInLine());
                    break;
                // caso não haja nenhum erro
                default:
                    continue;
            }
        }
        return (errors);

    }
}



