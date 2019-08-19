package learntoprogramming.kalkulator;

import android.os.AsyncTask;

import org.junit.Test;

import static org.junit.Assert.*;

public class CarryOutEquationsTest {


    //TESTS FOR TWO-VALUES EXPRESSIONS
    @Test
    public void expressionConverterAddTwoValuesTest() {

        CarryOutEquations equations = new CarryOutEquations("2.4+3.7");
        assertEquals(6.1, equations.convert(), 0);
    }

    @Test
    public void expressionConverterSubtractTwoValuesTest() {
        CarryOutEquations equations = new CarryOutEquations("7.62 - 0.62");
        assertEquals(7.0, equations.convert(), 0);
    }

    @Test
    public void expressionConverterMultiplyTwoValuesTest() {
        CarryOutEquations equations = new CarryOutEquations("11*12");
        assertEquals(132, equations.convert(), 0);
    }

    @Test
    public void expressionConverterDivideTwoValuesTest() {
        CarryOutEquations equations = new CarryOutEquations("81/27");
        assertEquals(3.0, equations.convert(), 0);
    }

    //TESTS FOR COMPLEX EXPRESSI0N
    @Test
    public void expressionConverterSubtractThenAddTest() {
        CarryOutEquations equations = new CarryOutEquations("5-5+5");
        assertEquals(5.0, equations.convert(), 0);
    }

    @Test
    public void expressionConverterSubtractTwoTimesTest() {
        CarryOutEquations equations = new CarryOutEquations("7-3-5");
        assertEquals(-1.0, equations.convert(), 0);
    }

    @Test
    public void expressionConverterMultiplyThenAddTest() {
        CarryOutEquations equations = new CarryOutEquations("3*4+5");
        assertEquals(17.0, equations.convert(), 0);
    }

    @Test
    public void expressionConverterSubtractThenMultiplyTest() {
        CarryOutEquations equations = new CarryOutEquations("16-8/2");
        assertEquals(12, equations.convert(), 0);
    }

    @Test
    public void expressionConverterMultiplyTwoTimesTest() {
        CarryOutEquations equations = new CarryOutEquations("2*3*4");
        assertEquals(24, equations.convert(), 0);
    }

    @Test
    public void expressionConverterDivideThenAddTest() {
        CarryOutEquations equations = new CarryOutEquations("21/3+3");
        assertEquals(10.0, equations.convert(), 0);
    }

    @Test
    public void expressionConverterSubtractThenDivideTest() {
        CarryOutEquations equations = new CarryOutEquations("30-25/5");
        assertEquals(25.0, equations.convert(), 0);
    }
}