package com.example.hello_world;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AgendaForm#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AgendaForm extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_agenda_form, container, false);

        Button btnAgregar = view.findViewById(R.id.buttonGuardar);

        btnAgregar.setOnClickListener(v -> {
            // Aquí podrías guardar los datos antes de volver, si hace falta

            // Volver al fragmento Agenda
            requireActivity().getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.flFragment, new Agenda())  // Asegúrate que R.id.flFragment es tu contenedor de fragmentos
                    .addToBackStack(null)
                    .commit();
        });

        return view;
    }

}