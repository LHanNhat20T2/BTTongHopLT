package com.example.bttonghoplt;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    Button btnlogin;
    EditText edtUser,edtPass;
    TextView tvsignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnlogin = (Button) findViewById(R.id.buttonLogin);
        edtUser = (EditText) findViewById(R.id.edittextUser);
        edtPass = (EditText) findViewById(R.id.edittextPassword);
        tvsignup = (TextView) findViewById(R.id.textviewsignup);


        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = "hannhat244@gmail.com";
                String password = "hannhat123";
                if (edtUser.getText().toString().equals(username) && edtPass.getText().toString().equals(password)) {
                    Toast.makeText(getApplicationContext(), R.string.loginsucess, Toast.LENGTH_SHORT).show();
                    Intent it = new Intent(Login.this, MainActivity.class);
                    startActivity(it);
                } else {
                    Toast.makeText(getApplicationContext(), R.string.loginerror, Toast.LENGTH_SHORT).show();
                }
            }
        });

        tvsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Login.this, SignUp.class);
                startActivity(i);
            }
        });
    }
}