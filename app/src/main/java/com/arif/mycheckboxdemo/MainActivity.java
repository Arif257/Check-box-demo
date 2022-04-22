package com.arif.mycheckboxdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private CheckBox milkChekBox, sugarCheckBox, waterCheckBox;
    private Button showButton;
    private TextView resultTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        milkChekBox = findViewById(R.id.milk);
        sugarCheckBox = findViewById(R.id.suger);
        waterCheckBox = findViewById(R.id.water);

        showButton = findViewById(R.id.buttonId);
        resultTextView = findViewById(R.id.result);

        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();
                if (milkChekBox.isChecked()){
                    String value = milkChekBox.getText().toString();
                    stringBuilder.append(value +" is clicked\n");
                }
                if (waterCheckBox.isChecked()){
                    String value = waterCheckBox.getText().toString();
                    stringBuilder.append(value+" is clicked\n");
                }
                if (sugarCheckBox.isChecked()){
                    String value = sugarCheckBox.getText().toString();
                    stringBuilder.append(value+" is clicked\n");

                }
                resultTextView.setText(stringBuilder);
            }
        });
    }
}