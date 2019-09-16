import java.util.Hashtable;
import java.util.Set;

public class TabelaDeSimbolos {
    private Hashtable tabela;

    public TabelaDeSimbolos(){
        this.tabela = new Hashtable();
    }

    public void inserir(String lexema, String tipo, int linha, int coluna){
        /*
            Cria uma nova "LinhaDeTabelaDeSimbolos", se "lexema" ainda não estiver em "tabela",
            com os parâmetros recebidos e a adiciona à "tabela", cada entrada é da
            seguinte forma <chave, valor> = <lexema, entrada_correspondente>
         */
        LinhaDeTabelaDeSimbolos novaLinha = null;
        if(!tabela.containsKey(lexema))
            novaLinha = new LinhaDeTabelaDeSimbolos(lexema, tipo, linha, coluna);
            tabela.put(lexema, novaLinha);
    }

    public LinhaDeTabelaDeSimbolos getLinha(String lexema){
        /*
            Retorna a linha da tabela de símbolos correspondente a "lexema", se existir,
            senão, retorna "null"
         */
        if(tabela.containsKey(lexema))
            return (LinhaDeTabelaDeSimbolos) tabela.get(lexema);
        else
            return null;
    }

    @Override
    public String toString(){
        Set<String> chaves = tabela.keySet();
        String strTabela = "";
        strTabela += "Chave/índice\t" + "Lexema\t" + "Tipo\t" + "Linha\t" + "Coluna\n";
        for (String chave : chaves){
            LinhaDeTabelaDeSimbolos linha = (LinhaDeTabelaDeSimbolos) tabela.get(chave);
            strTabela += linha.getLexema() + "\t" + linha.getLexema() + "\t" +
                    linha.getTipo() + "\t" + linha.getLinha() + "\t" + linha.getColuna() + "\n";
        }
        return strTabela;
    }

    //Apenas para testes
    public static void main(String args[]){
        TabelaDeSimbolos ts1 = new TabelaDeSimbolos();
        ts1.inserir("valor1", "int", 5, 12);
        ts1.inserir("valor2", "int", 12, 7);
        ts1.inserir("valor3", "float", 15, 10);
        ts1.inserir("valor4", "int", 23, 32);
        ts1.inserir("valor5", "String", 24, 42);
        ts1.inserir("valor6", "int", 25, 2);

        System.out.println(ts1);
    }
}
