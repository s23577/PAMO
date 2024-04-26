package com.example.a01_bmi_calculator;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);

        goToMainActivity();
        goToCaloriesActivity();
        goToRecipeActivity();
    }

    public void goToMainActivity() {
        Button openBMI = findViewById(R.id.openBmiCalculatorButton);
        openBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        HomeActivity.this,
                        MainActivity.class
                );
                startActivity(intent);
            }
        });
    }

    public void goToCaloriesActivity() {
        Button openCalories = findViewById(R.id.openCaloriesCalculatorBtn);
        openCalories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        HomeActivity.this,
                        CaloriesActivity.class
                );
                startActivity(intent);
            }
        });
    }

    public void goToRecipeActivity() {
        Button openRecipes = findViewById(R.id.openRecipesBtn);
        openRecipes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        HomeActivity.this,
                        RecipeActivity.class
                );
                startActivity(intent);
            }
        });
    }
}
