package com.example.loginscreen;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginScreen extends AppCompatActivity {
    EditText etUserName, etPassword;
    Button btnLogin;
    TextView tvNotYet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        etUserName = findViewById(R.id.etUserName);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);
        tvNotYet = findViewById(R.id.tvNotYet);


        btnLogin.setOnClickListener(v -> {
            if (etUserName.getText().toString().equals("user") && etPassword.getText().toString().equals("123456")) {
                Toast.makeText(LoginScreen.this, "Login Successful!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(LoginScreen.this, "Login Failed!", Toast.LENGTH_SHORT).show();
            }
        });

        tvNotYet.setOnClickListener(v -> Toast.makeText(LoginScreen.this, "Please Sign Up For a New Account.", Toast.LENGTH_SHORT).show());
    }
}