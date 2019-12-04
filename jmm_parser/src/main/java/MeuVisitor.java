import org.antlr.v4.runtime.tree.ErrorNode;

public class MeuVisitor extends JMMParserBaseVisitor {
    private boolean hasError = false;

    @Override
    public Object visitErrorNode(ErrorNode node) {
        this.hasError = true;
        return super.visitErrorNode(node);
    }

    public boolean hasError(){
        return this.hasError;
    }
}
