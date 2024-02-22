import expr.Parser;
import expr.ParserException;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;

public class ExpressionTest {

    @Test
    public void easy()   {
        Assert.assertEquals(5, parse("5"), 0.001);
        Assert.assertEquals(10, parse("5 + 5"), 0.001);
        Assert.assertEquals(35, parse("5 * 5 + 10"), 0.001);
        Assert.assertEquals(1.5, parse("15 / 10"), 0.001);
        Assert.assertEquals(8, parse("2 + 3 * 2"), 0.001);
    }

    @Test
    public void hard() {
       Assert.assertEquals(150, parse("((150))"),0.001);
       Assert.assertEquals(30, parse("(5 + 5) * 3"),0.001);
       Assert.assertEquals(11, parse("(1 + 2) / 3 + 10"),0.001);
       Assert.assertEquals(70, parse("150 / 2 - 5"),0.001);
    }

    @Test
    public void rubbish() {
        Assert.assertEquals(7.5, parse(" (  5 +   10 ) / 2 "),0.001);
        Assert.assertEquals(50, parse(" ( ((90 - 10)) + 20 ) / 2 "),0.001);
        Assert.assertEquals(738, parse("((1+1+1+1+1+1)) * 123"),0.001);
        Assert.assertEquals(1000, parse("200 * 50 - 9000"),0.001);
    }



    private double parse(final String source)  {
        final Parser parser;
        try {
            parser = new Parser(new ByteArrayInputStream((source + " ").getBytes()));
            return parser.parse().val;
        } catch (final ParserException e) {
            throw new RuntimeException("Not excepted");
        }
    }

}
