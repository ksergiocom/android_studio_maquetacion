package com.example.hello_world;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Configuracion extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_configuracion, container, false);

        Button btnBorrarCuenta = view.findViewById(R.id.btnBorrarCuenta);
        Button btnGuardarCambios = view.findViewById(R.id.btnGuardarCambios);

        btnGuardarCambios.setOnClickListener(v -> {
            // Aquí podrías guardar datos si hiciera falta

            // Volver al fragmento Agenda
            requireActivity().getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.flFragment, new Inicio())  // R.id.flFragment es el contenedor principal
                    .addToBackStack(null)
                    .commit();
        });

        btnBorrarCuenta.setOnClickListener(v -> {
            // Salta a LoginActivity
            Intent intent = new Intent(requireContext(), LoginActivity.class);
            startActivity(intent);
        });


        return view;
    }
}