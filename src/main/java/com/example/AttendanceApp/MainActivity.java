// Attendance App Created by;
// Niwenyesiga.Daniel.Mercy,
// Ayugi Joyce
// Econi Emmanuel


package com.example.AttendanceApp;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {
    // defining our local variables to be later used
    // we made them public because we want to re-use them
    // in other classes, such as the attendance
    public EditText editText;
    public Button button1;
    public Button button2;
    public TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //locating the XML views using the findViewById() method
        editText=(EditText)findViewById(R.id.username);
        editText=(EditText)findViewById(R.id.password);

        //button 1 is for Login &  button 2 is for Registration
        // after the user clicks button 1 & button 2, using the OnCLickListener(), the
        // user will be take to another activity.
        button1=(Button)findViewById(R.id.login_button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Attendance.class));
            }
        });

        button2=(Button)findViewById(R.id.registration_button);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Registration.class));
            }
        });
        TextView textView;
        textView = this.findViewById(R.id.registration_link);

    }
}