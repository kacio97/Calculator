package learntoprogramming.kalkulator;

import org.junit.Test;
import org.junit.matchers.JUnitMatchers;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.regex.Matcher;

import static org.junit.Assert.*;

public class StringToValueConverterTest {
/*
    private StringToValueConverter stringToValueConverter;

    @Test
    public void adderConvertTest() {

        stringToValueConverter = new StringToValueConverter();

        String expression = "4.2+3.6+1-2";

        BigDecimal bigDecimal = new BigDecimal(6.8).setScale(2, RoundingMode.UP);
        assertEquals(bigDecimal, stringToValueConverter.convert(expression));


    }

    @Test
    public void addTwoValuesTest() {
        stringToValueConverter = new StringToValueConverter();

        String expression = "1.2+7.7";
        BigDecimal bigDecimal = new BigDecimal(8.9).setScale(2, RoundingMode.UP);
        assertEquals(bigDecimal, stringToValueConverter.convert(expression));
    }


    @Test
    public void subtractTwoValuesTest() {

        stringToValueConverter = new StringToValueConverter();

        String expression = "4.3-4.2";
        BigDecimal bigDecimal = new BigDecimal(0.1).setScale(2, RoundingMode.UP);
        assertEquals(bigDecimal, stringToValueConverter.convert(expression));
    }


    @Test
    public void multiplyTwoValuesTest() {

        stringToValueConverter = new StringToValueConverter();

        String expression = "5*4";
        BigDecimal bigDecimal = new BigDecimal(20.0).setScale(2, RoundingMode.UP);
        assertEquals(bigDecimal, stringToValueConverter.convert(expression));
    }


    @Test
    public void divideTwoValuesTest() {

        stringToValueConverter = new StringToValueConverter();

        String expression = "18/2";
        BigDecimal bigDecimal = new BigDecimal(9.0).setScale(2, RoundingMode.UP);
        assertEquals(bigDecimal, stringToValueConverter.convert(expression));
    }


    @Test
    public void addTwoTimesValuesTest() {

        stringToValueConverter = new StringToValueConverter();

        String expression = "1.2+7.7+0.1";
        BigDecimal bigDecimal = new BigDecimal(9.0).setScale(2, RoundingMode.UP);
        assertEquals(bigDecimal, stringToValueConverter.convert(expression));
    }


    @Test
    public void divideTwoTimesValuesTest() {

        stringToValueConverter = new StringToValueConverter();

        String expression = "12.1-1.1-4";
        BigDecimal bigDecimal = new BigDecimal(7.0).setScale(2, RoundingMode.UP);
        assertEquals(bigDecimal, stringToValueConverter.convert(expression));
    }


    @Test
    public void multiplyTwoTimesValuesTest() {

        stringToValueConverter = new StringToValueConverter();

        String expression = "2*3";
        BigDecimal bigDecimal = new BigDecimal(6).setScale(2, RoundingMode.UP);
        assertEquals(bigDecimal, stringToValueConverter.convert(expression));
    }


    @Test
    public void divideTwoTimesValues() {

        stringToValueConverter = new StringToValueConverter();

        String expression = "125/5";
        BigDecimal bigDecimal = new BigDecimal(25.0).setScale(2, RoundingMode.UP);
        assertEquals(bigDecimal, stringToValueConverter.convert(expression));
    }


    @Test
    public void addSubtractAddValuesTest() {

        stringToValueConverter = new StringToValueConverter();

        String expression = "1.3+7.7-3+4";
        BigDecimal bigDecimal = new BigDecimal(10.0).setScale(2, RoundingMode.UP);
        assertEquals(bigDecimal, stringToValueConverter.convert(expression));
    }


    @Test
    public void subtractAddSubtractValuesTest() {

        stringToValueConverter = new StringToValueConverter();

        String expression = "22-4.5-4.5-3";
        BigDecimal bigDecimal = new BigDecimal(10.0).setScale(2, RoundingMode.UP);
        assertEquals(bigDecimal, stringToValueConverter.convert(expression));
    }


    @Test
    public void subtractTwoTimesAndAddValuesTest() {

        stringToValueConverter = new StringToValueConverter();

        String expression = "20-6-4+5";
        BigDecimal bigDecimal= new BigDecimal(15.0).setScale(2,RoundingMode.UP);
        assertEquals(bigDecimal,stringToValueConverter.convert(expression));
    }


    @Test
    public void addAndSubtractTwoTimesAddValuesTest() {

        stringToValueConverter = new StringToValueConverter();

        String expression = "1.3+7.7-3-4";
        BigDecimal bigDecimal= new BigDecimal(2.0).setScale(2,RoundingMode.UP);
        assertEquals(bigDecimal,stringToValueConverter.convert(expression));
    }


    @Test
    public void subtractAndAddTwoTimesValuesTest() {

        stringToValueConverter = new StringToValueConverter();

        String expression = "10-5+2+3";
        BigDecimal bigDecimal= new BigDecimal(10.0).setScale(2,RoundingMode.UP);
        assertEquals(bigDecimal,stringToValueConverter.convert(expression));
    }


    @Test
    public void addMultiplySubtractValuesTest() {

        stringToValueConverter = new StringToValueConverter();

        String expression = "2+2*2-4";
        BigDecimal bigDecimal= new BigDecimal(2.0).setScale(2,RoundingMode.UP);
        assertEquals(bigDecimal,stringToValueConverter.convert(expression));
    }


    @Test
    public void multiplyThreeTimesValuesTest() {

        stringToValueConverter = new StringToValueConverter();

        String expression = "2*3*4";
        BigDecimal bigDecimal= new BigDecimal(24.0).setScale(2,RoundingMode.UP);
        assertEquals(bigDecimal,stringToValueConverter.convert(expression));
    }


    @Test
    public void multiplyAddMultiplyValuesTest() {

        stringToValueConverter = new StringToValueConverter();

        String expression = "2*3+2*3";
        BigDecimal bigDecimal= new BigDecimal(12.0).setScale(2,RoundingMode.UP);
        assertEquals(bigDecimal,stringToValueConverter.convert(expression));
    }*/
}