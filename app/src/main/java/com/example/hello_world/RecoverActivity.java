package com.example.hello_world;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RecoverActivity extends AppCompatActivity {


    TextView tvInicio, tvCrearCuenta;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recover);

        tvInicio = findViewById(R.id.recovery_link_inicio);
        btn = findViewById(R.id.recover_btn);


        tvInicio.setOnClickListener(v -> {
            startActivity(new Intent(RecoverActivity.this, LoginActivity.class));
        });


        btn.setOnClickListener(v -> {
            startActivity(new Intent(RecoverActivity.this, LoginActivity.class));
            finish(); // Para que no se vuelva atrás al darle atrás
        });
    }
}