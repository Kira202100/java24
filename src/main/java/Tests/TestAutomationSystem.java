package Tests;



import java.util.Arrays;

public class TestAutomationSystem {
    public static void main(String[] args) {
        TestScenario[] testScenarios  =  {new PaymentTest(),new LoginTest(),new ProductSeachTest()};
    for (int i=0; i< testScenarios.length; i++) {
        testScenarios[i].runTest();
    }
    }
}
