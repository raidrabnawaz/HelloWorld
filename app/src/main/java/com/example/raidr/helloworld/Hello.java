package com.example.raidr.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Hello extends AppCompatActivity {
    EditText userName, password;
    Button button;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        userName = (EditText) findViewById(R.id.name);
        final String struser = userName.getText().toString();

        password = (EditText) findViewById(R.id.password);
        final String strpassword = password.getText().toString();

        button = (Button) findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (struser.equals("") || strpassword.equals("")) {
                    Toast.makeText(Hello.this, "Enter User Name ans Password", Toast.LENGTH_SHORT).show();
                } else if (struser.equals(password.getText().toString())) {
                    Toast.makeText(Hello.this, "User Name and Password are same", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Hello.this, "User Name and Password are not same", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
