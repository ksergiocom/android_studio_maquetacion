package com.example.hello_world;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    TextView tvOlvidaste, tvCrearCuenta;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tvOlvidaste = findViewById(R.id.tvOlvidaste);
        tvCrearCuenta = findViewById(R.id.tvCrearCuenta);
        btnLogin = findViewById(R.id.btnLogin);


        tvOlvidaste.setOnClickListener(v -> {
            startActivity(new Intent(LoginActivity.this, RecoverActivity.class));
        });

        tvCrearCuenta.setOnClickListener(v -> {
            startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
        });


        btnLogin.setOnClickListener(v -> {
            startActivity(new Intent(LoginActivity.this, MainActivity.class));
            finish(); // Para que no se vuelva atrás al darle atrás
        });
    }
}
