package mypkg;
import static org.junit.Assert.*;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import junit.framework.TestCase;
import org.junit.Test;
/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    @Test
    public void addtest()
        {
        Calculator calculator = new Calculator ();
        assertEquals( 2, calculator.add(1,1));
        assertEquals( -2, calculator.add(-1,-1));
        assertEquals( 0, calculator.add(0,0)); 
        }
    @Test
    public void multiplytest(){
        Calculator calculator = new Calculator ();
        assertEquals( 1, calculator.multiply(1,1));
        assertEquals( 1, calculator.multiply(-1,-1));
        assertEquals( 0, calculator.multiply(0,1));
        assertEquals( 0, calculator.multiply(0,0));
        assertEquals( -1, calculator.multiply(1,-1));
    }
    @Test
    public void substracttest(){
        Calculator calculator = new Calculator ();
        assertEquals( 1, calculator.subtract(2,1));
        assertEquals( -1, calculator.subtract(1,2));
        assertEquals( 1, calculator.subtract(-1,-2));
        assertEquals( -1, calculator.subtract(-2,-1));
        assertEquals( 0, calculator.subtract(0,0));
    }

}
