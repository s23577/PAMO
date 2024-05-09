package com.example.a01_bmi_calculator;

import static com.example.a01_bmi_calculator.CaloriesActivity.calculateCaloriesMale;
import static org.junit.Assert.*;
import org.junit.Test;

public class CaloriesActivityTest {

    @Test
    public void bmiMethodTest(){
        double result = calculateCaloriesMale("98", "180", "24");
        assertEquals(2146.83, result, 0.000000001);
    }
}
