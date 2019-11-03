package com.samyam.indoorcricket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnlogin, btnregister;
    TextView forgot;
    EditText un, pwd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        un = findViewById(R.id.login_username);
        pwd = findViewById(R.id.login_password);
        btnlogin = findViewById(R.id.login_submit);
        btnregister = findViewById(R.id.login_register);
        forgot = findViewById(R.id.login_text);

        btnlogin.setOnClickListener(this);
        btnregister.setOnClickListener(this);
        forgot.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.login_submit:
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
                break;

            case R.id.login_register:

                Intent intent2 = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent2);

                break;
        }
    }
}
