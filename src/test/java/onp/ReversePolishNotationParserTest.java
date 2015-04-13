package onp;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

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

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();


    @Test(expected=IllegalArgumentException.class)
    public void testIllegalArgumentIfUnsupported() throws Exception {
        reversePolishNotationParser.calculateExpressionValue("2 3 test");
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("Unsupported Operation");
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

    @Test
    public void testAbsolute() throws Exception {
        assertEquals(reversePolishNotationParser.calculateExpressionValue("2 1 /"), 2);
    }

    @Test
    public void testMixedExpression() throws Exception {
        assertEquals(reversePolishNotationParser.calculateExpressionValue("12 2 3 4 * 10 5 / + * +"), 40);
    }
}

