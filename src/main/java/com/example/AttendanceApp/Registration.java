package com.example.AttendanceApp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Registration extends AppCompatActivity {
    public EditText editText;
    public Button button;
    public RadioButton radioButton;
    public TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        editText=(EditText)findViewById(R.id.firstname);
        editText=(EditText)findViewById(R.id.lastName);
        editText=(EditText)findViewById(R.id.username);
        editText=(EditText)findViewById(R.id.password);
        button=(Button)findViewById(R.id.registration_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Registration.this,MainActivity.class));
            }
        });
    }
}