import org.antlr.v4.runtime.Token;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;


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

    String errorCheck(List<Token> token) {
        int idNumero = 1;
        int idId = 55;

        for (int i = 0; i < token.size() - 1; ++i) {
            Token token1 = token.get(i);
            Token token2 = token.get(i + 1);
            if((token1.getType() == idNumero) && (token2.getType() == idId)){
                System.out.println(token1.getText());

                if((token1.getStopIndex() - token2.getStartIndex() > -2) && (token1.getLine() == token2.getLine())){
                    return ("Error in line " + token1.getLine() + " in " + token1.getStartIndex());
                }
            }
        }
        return ("Compiled with succes");
    }

}



