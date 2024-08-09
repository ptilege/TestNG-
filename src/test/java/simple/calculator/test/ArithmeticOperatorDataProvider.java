package simple.calculator.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import simple.calculator.ArithmeticOperator;

public class ArithmeticOperatorDataProvider  {

    @Test(dataProvider = "setOfData")
    public void testSum(int input1, int input2, int expectedOutPut){
        Assert.assertEquals(ArithmeticOperator.calSum(input1,input2),expectedOutPut,"Failed to cal Sum");
    }

    @DataProvider(name = "setOfData")
    public Object[][] getData(){
        return new Object[][]{
                {0,1,1},
                {0,-1,-1},
                {-2147483647,-1,-2147483648},
                {2147483646,1,2147483647}
        };
    }
}
