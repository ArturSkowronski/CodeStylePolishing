package onp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by arturskowronski on 13/04/15.
 */
public class ReversePolishNotationParserTest {

    ReversePolishNotationParser reversePolishNotationParser;

    @Before
    public void doBeforeTests(){
        reversePolishNotationParser = new ReversePolishNotationParserImpl();
    }

    @Test
    public void testAddition() throws Exception {
        assertEquals(reversePolishNotationParser.calculateExpressionValue("2 2 +"), 4);
        assertEquals(reversePolishNotationParser.calculateExpressionValue("2 3 +"), 5);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testNull() throws Exception {
        reversePolishNotationParser.calculateExpressionValue(null);
    }

    @Test
    public void testSubtraction() throws Exception {
        assertEquals(reversePolishNotationParser.calculateExpressionValue("2 1 -"), 1);
    }

    @Test
    public void testMultiplication() throws Exception {
        assertEquals(reversePolishNotationParser.calculateExpressionValue("2 1 *"), 2);
    }

    @Test
    public void testDivision() throws Exception {
        assertEquals(reversePolishNotationParser.calculateExpressionValue("2 1 /"), 2);
    }
}
