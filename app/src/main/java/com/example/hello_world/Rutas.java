package com.example.hello_world;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Rutas#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Rutas extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_rutas, container, false);

        Button btnCrearItinerario = view.findViewById(R.id.btnCrearItinerario);

        btnCrearItinerario.setOnClickListener(v -> {
            // Aquí podrías guardar datos si hiciera falta

            // Volver al fragmento Agenda
            requireActivity().getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.flFragment, new RutasForm())  // R.id.flFragment es el contenedor principal
                    .addToBackStack(null)
                    .commit();
        });

        Button btnEmpezar1 = view.findViewById(R.id.item_ruta_1).findViewById(R.id.btnEmpezar1);
        Button btnEmpezar2 = view.findViewById(R.id.item_ruta_2).findViewById(R.id.btnEmpezar1);
        Button btnEmpezar3 = view.findViewById(R.id.item_ruta_3).findViewById(R.id.btnEmpezar1);
        Button btnEmpezar4 = view.findViewById(R.id.item_ruta_1).findViewById(R.id.btnEmpezar1);
        Button btnEmpezar5 = view.findViewById(R.id.item_ruta_2).findViewById(R.id.btnEmpezar1);
        Button btnEmpezar6 = view.findViewById(R.id.item_ruta_3).findViewById(R.id.btnEmpezar1);

        // JAJAJAJAJAJA
        btnEmpezar1.setOnClickListener(v -> cambiarFragment());
        btnEmpezar2.setOnClickListener(v -> cambiarFragment());
        btnEmpezar3.setOnClickListener(v -> cambiarFragment());
        btnEmpezar4.setOnClickListener(v -> cambiarFragment());
        btnEmpezar5.setOnClickListener(v -> cambiarFragment());
        btnEmpezar6.setOnClickListener(v -> cambiarFragment());

        return view;
    }

    private void cambiarFragment() {
        // Cambiar a otro fragmento (por ejemplo, un fragmento "DestinoForm")
        requireActivity().getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.flFragment, new RutasDetalle())  // Cambia "DestinoForm" al fragmento que necesites
                .addToBackStack(null)
                .commit();
    }

}