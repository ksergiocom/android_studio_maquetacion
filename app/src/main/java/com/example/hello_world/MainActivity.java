package com.example.hello_world;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.fragment.app.Fragment;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TopBar
        MaterialToolbar topAppBar = findViewById(R.id.topAppBar);
        setSupportActionBar(topAppBar);

        // Bottom Navigation
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);

        Fragment inicioFragment = new Inicio();
        Fragment rutasFragment = new Rutas();
        Fragment agendaFragment = new Agenda();

        setCurrentFragment(inicioFragment);

        bottomNavigationView.setOnItemSelectedListener(item -> {
            int id = item.getItemId();
            if (id == R.id.nav_inicio) {
                setCurrentFragment(inicioFragment);
                return true;
            } else if( id == R.id.nav_rutas){
                setCurrentFragment(rutasFragment);
                return true;
            } else if( id == R.id.nav_agenda){
                setCurrentFragment(agendaFragment);
                return true;
            }
            return false;
        });

    }


    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.top_app_bar_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        Fragment configuracionFragment = new Configuracion();

        if (item.getItemId() == R.id.nav_configuracion) {
            setCurrentFragment(configuracionFragment);
            return true;
        } else if (item.getItemId() == R.id.nav_logout) {
            startActivity(new Intent(MainActivity.this, LoginActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    private void setCurrentFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.flFragment, fragment)
                .commit();
    }

}