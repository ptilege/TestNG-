package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnTest {

    @Test()
    public void oLevel(){
        System.out.println("o/level");
        //Assert.fail();
    }

    @Test(dependsOnMethods = "oLevel")
    public void aLevel(){
        System.out.println("a/level");
    }

    @Test(dependsOnMethods = {"oLevel","aLevel"}, alwaysRun = true)
    public void campus(){
        System.out.println("Campus");
    }


}
