import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTests {
    CalculatorMethods calculatorMethods = new CalculatorMethods();

    @Test
    public void shouldAddTwoNumbers(){
        int result = calculatorMethods.getAddition(15,20);
        Assert.assertEquals(35,result);
    }
    @Test
    public void shouldMultiplyTwoNumbers() {
        int result = calculatorMethods.getMultiply(10, 20);
        Assert.assertEquals(200, result);
    }
    @Test
    public void shouldGetSubtraction(){
        int result= calculatorMethods.getSubtraction(10,20);
        Assert.assertEquals(-10,result);

    }
    @Test
    public void shouldGetRemainder(){
        int result=calculatorMethods.getRemainder(10,10);
        Assert.assertEquals(1,result);
    }
}


