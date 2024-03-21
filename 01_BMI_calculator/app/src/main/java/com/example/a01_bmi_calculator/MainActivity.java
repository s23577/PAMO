package com.example.a01_bmi_calculator;

import static android.widget.Toast.LENGTH_SHORT;

import android.annotation.SuppressLint;
import android.icu.text.NumberFormat;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText weight; //entered by user
    private EditText height; //entered by user
    private Button calculateButton;
    private double convertedWeight;
    private double convertedHeight;
    private double bmi;

    private TextView bmiResult; //showed calculated BMI value

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        bmiResult = findViewById(R.id.result);
        weight = findViewById(R.id.weightInput);
        weight.setHint("Enter weight [kg]");
        height = findViewById(R.id.heightInput);
        height.setHint("Enter height [cm]");
        calculateButton = findViewById(R.id.bmiCalculateButton);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String weightString = weight.getText().toString();
                String heightString = height.getText().toString();

                if (!weightString.isEmpty() && !heightString.isEmpty()) {
                    calculateBMI();
                } else {
                    Toast.makeText(MainActivity.this, "Inputs cannot be empty", LENGTH_SHORT).show();
                }
            }
        });
    }

    @SuppressLint("DefaultLocale")
    private void calculateBMI() {
        String weightStr = weight.getText().toString();
        String heightStr = height.getText().toString();

        convertedWeight = Double.parseDouble(weightStr);
        convertedHeight = Double.parseDouble(heightStr) / 100;
        bmi = convertedWeight / (convertedHeight * convertedHeight);

        bmiResult.setText(String.format("BMI: %.2f", bmi));
    }
}