import org.antlr.v4.runtime.Token;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Classe de auxilio a Main
public class auxiliar {
    String readFile(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append("\n");
                line = br.readLine();
            }
            sb.append("\u001a");
            return sb.toString();
        } finally {
            br.close();
        }
    }

    //verifica erros no código

    ArrayList<String> errorCheck(List<Token> token) {
        int idError = 1;
        int opErro = 2;
        int realError = 3;
        int geralError = 56;
        ArrayList<String> errors = new ArrayList<String>();
        for (int i = 0; i < token.size() - 1; ++i) {
            switch (token.get(i).getType()) {
                //caso seja um erro no ID
                case 1:
                    errors.add("Could not recognize " + token.get(i).getText() + " in line " + token.get(i).getLine() + " " + token.get(i).getCharPositionInLine());
                    break;
                // caso seja um erro no operador
                case 2:
                    errors.add ("Didnt understand what the operator " + token.get(i).getText() + " was meant to be in line " + token.get(i).getLine() + " " + token.get(i).getCharPositionInLine());
                    break;
                // caso seja um erro de numero comecando com 0
                case 3:
                    errors.add("Num error in " + token.get(i).getText() + " in line " + token.get(i).getLine() + " " + token.get(i).getCharPositionInLine());
                    break;
                // caso seja um caracter n conhecido
                case 56:
                    errors.add("Could not recognize " + token.get(i).getText() + " in line " + token.get(i).getLine() + " " + token.get(i).getCharPositionInLine());
                    break;
                // caso não tenha nenhum erro
                default:
                    continue;
            }
        }
        return (errors);

    }
}



