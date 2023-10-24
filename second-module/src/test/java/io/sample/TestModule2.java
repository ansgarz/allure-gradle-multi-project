package io.sample;

import io.allure.BaseSteps;
import org.testng.annotations.Test;

public class TestModule2
{

    private BaseSteps steps = new BaseSteps();

    @Test
    public void testOutput() {
        steps.firstStep();
        steps.secondStep();
    }

}
