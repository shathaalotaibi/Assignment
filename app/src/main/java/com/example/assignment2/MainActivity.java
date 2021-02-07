package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button clickButton;
    EditText textName;
    TextView textMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clickButton= (Button) findViewById(R.id.clickButton);
        textName= (EditText) findViewById(R.id.textName);
        textMessage= (TextView) findViewById(R.id.textMessage);
        clickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName=  textName.getText().toString();
                textMessage.setText("Hello, "+ userName);
            }});
    }
}
