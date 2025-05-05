package com.example.hello_world;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link RutasForm#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RutasForm extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_rutas_form, container, false);

        Button btnGuardarRuta = view.findViewById(R.id.btnGuardarRuta);

        btnGuardarRuta.setOnClickListener(v -> {
            // Aquí podrías guardar datos si hiciera falta

            // Volver al fragmento Agenda
            requireActivity().getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.flFragment, new Rutas())  // R.id.flFragment es el contenedor principal
                    .addToBackStack(null)
                    .commit();
        });

        return view;

        /*
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_rutas_form, container, false);
        */

        /*
                View view = inflater.inflate(R.layout.fragment_rutas_form, container, false);

        Button fabAddStage = view.findViewById(R.id.fabAddStage);

        fabAddStage.setOnClickListener(v -> {
            // Aquí podrías guardar datos si hiciera falta

            // Volver al fragmento Agenda
            requireActivity().getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.flFragment, new Rutas())  // R.id.flFragment es el contenedor principal
                    .addToBackStack(null)
                    .commit();
        });

        return view;
         */
    }
}