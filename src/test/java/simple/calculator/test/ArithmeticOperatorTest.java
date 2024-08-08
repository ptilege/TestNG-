package simple.calculator.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import simple.calculator.ArithmeticOperator;

public class ArithmeticOperatorTest {

    SoftAssert softAssert = new SoftAssert();
    @Test(priority = 0)
    public void testSum(){
        System.out.println("****************01st Test case for cal Sum****************");
        System.out.println("<<<<<<<<<<<<<<<<First sum calculation>>>>>>>>>>>>>>>>");
        int actualValueSum1 = ArithmeticOperator.calSum(20, 5);
        System.out.println("Actual Sum 1 Value is : "+actualValueSum1);
        softAssert.assertEquals(actualValueSum1,26,"Failed to calc sum 1");

        System.out.println("<<<<<<<<<<<<<<<<Second sum calculation>>>>>>>>>>>>>>>>");
        int actualValueSum2 = ArithmeticOperator.calSum(10, 20);
        System.out.println("Actual Sum 1 Value is : "+actualValueSum2);
        softAssert.assertEquals(actualValueSum2,30,"Failed to calc sum 2");

        System.out.println("<<<<<<<<<<<<<<<<Third sum calculation>>>>>>>>>>>>>>>>");
        int actualValueSum3 = ArithmeticOperator.calSum(4, 8);
        System.out.println("Actual Sum 1 Value is : "+actualValueSum3);
        softAssert.assertEquals(actualValueSum3,12,"Failed to calc sum 3");
        System.out.println();
        System.out.println();
        softAssert.assertAll();

    }
}
