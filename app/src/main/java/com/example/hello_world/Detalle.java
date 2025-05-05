package com.example.hello_world;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Detalle extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_agenda_form, container, false);

        Button btnGuardar = view.findViewById(R.id.buttonGuardar);

        btnGuardar.setOnClickListener(v -> {
            // Aquí podrías guardar datos si hiciera falta

            // Volver al fragmento Agenda
            requireActivity().getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.flFragment, new Agenda())  // R.id.flFragment es el contenedor principal
                    .addToBackStack(null)
                    .commit();
        });

        return view;
    }
}