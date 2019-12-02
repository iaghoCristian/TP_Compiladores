import org.antlr.v4.runtime.ParserRuleContext;

public class MeuListener extends JMMParserBaseListener {
    @Override
    public void enterClassBody(JMMParserParser.ClassBodyContext ctx) {
        super.enterClassBody(ctx);
        System.out.println('{');
    }
}
