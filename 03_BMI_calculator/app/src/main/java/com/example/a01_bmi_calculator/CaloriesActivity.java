package com.example.a01_bmi_calculator;

import static android.widget.Toast.LENGTH_SHORT;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class CaloriesActivity extends AppCompatActivity {

    private EditText weight; //entered by user
    private EditText height; //entered by user
    private EditText age; //entered by user
    private Button calculateButton;
    RadioButton maleRadioButton;
    RadioButton femaleRadioButton;

    private TextView caloriesResult;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.calories_activity);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        backHome(toolbar);

        caloriesResult = findViewById(R.id.result);
        weight = findViewById(R.id.weightInput);
        weight.setHint("Enter weight [kg]");
        height = findViewById(R.id.heightInput);
        height.setHint("Enter height [cm]");
        age = findViewById(R.id.ageInput);
        age.setHint("Enter age [years]");
        maleRadioButton = findViewById(R.id.maleRadioButton);
        femaleRadioButton = findViewById(R.id.femaleRadioButton);
        calculateButton = findViewById(R.id.caloriesCalculateButton);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("DefaultLocale")
            @Override
            public void onClick(View v) {
                String weightString = weight.getText().toString();
                String heightString = height.getText().toString();
                String ageString = age.getText().toString();

                if (!weightString.isEmpty() && !heightString.isEmpty() && !ageString.isEmpty() && (!maleRadioButton.isChecked() || !femaleRadioButton.isChecked())) {
                    if (maleRadioButton.isChecked()) {
                        double result = calculateCaloriesMale(weightString, heightString, ageString);
                        caloriesResult.setText(String.format("Caloric demand: %.2f", result));
                    } else if (femaleRadioButton.isChecked()) {
                        double result = calculateCaloriesFemale(weightString, heightString, ageString);
                        caloriesResult.setText(String.format("Caloric demand: %.2f", result));
                    }
                } else {
                    Toast.makeText(CaloriesActivity.this, "Inputs cannot be empty", LENGTH_SHORT).show();
                }
            }
        });
    }

    private void backHome(androidx.appcompat.widget.Toolbar toolbar) {
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    @SuppressLint("DefaultLocale")
    public static double calculateCaloriesMale(String weight, String height, String age) {
        double convertedWeight = Double.parseDouble(weight);
        double convertedAge = Double.parseDouble(age);
        double convertedHeight = Double.parseDouble(height);
        return 66.47 + (13.7 * convertedWeight) + (5.0 * convertedHeight) - (6.76 * convertedAge);
    }

    @SuppressLint("DefaultLocale")
    public double calculateCaloriesFemale(String weight, String height, String age) {
        double convertedWeight = Double.parseDouble(weight);
        double convertedAge = Double.parseDouble(age);
        double convertedHeight = Double.parseDouble(height);
        return 655.1 + (9.567 * convertedWeight) + (1.85 * convertedHeight) - (4.68 * convertedAge);
    }
}
