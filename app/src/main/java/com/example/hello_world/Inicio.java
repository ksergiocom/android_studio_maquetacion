package com.example.hello_world;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.Arrays;
import java.util.List;


public class Inicio extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_inicio, container, false);

        Fragment detalleFragment = new Detalle();

        LinearLayout cardContainer = view.findViewById(R.id.cardContainer);

        List<CardInfo> listaCards = Arrays.asList(
                new CardInfo(
                        "Viaje a la Playa",
                        "Disfruta de días soleados en la costa, relajándote sobre la arena fina mientras escuchas el sonido de las olas. Ideal para desconectar del estrés y sumergirse en un entorno tropical con aguas cristalinas.",
                        R.drawable.playa
                ),
                new CardInfo(
                        "Montañas",
                        "Sumérgete en una experiencia única de senderismo, aire puro y paisajes imponentes. Perfecto para los amantes de la naturaleza que buscan aventuras en entornos tranquilos rodeados de pinos y cumbres nevadas.",
                        R.drawable.montana
                ),
                new CardInfo(
                        "Ciudad",
                        "Explora el vibrante ritmo urbano con sus museos, gastronomía internacional, arquitectura moderna y vida nocturna. Una escapada ideal para quienes desean descubrir nuevas culturas sin salir del entorno metropolitano.",
                        R.drawable.ciudad
                ),
                new CardInfo(
                        "Escapada Costera",
                        "Vive una experiencia inolvidable frente al mar con atardeceres espectaculares, deportes acuáticos y paseos por la orilla. Un destino perfecto para el romance o el descanso absoluto.",
                        R.drawable.playa
                ),
                new CardInfo(
                        "Refugio en la Cima",
                        "Descubre la paz de los paisajes montañosos y déjate llevar por rutas naturales, lagos escondidos y el contacto puro con la tierra. Ideal para desconectar y reconectar contigo mismo.",
                        R.drawable.montana
                ),
                new CardInfo(
                        "Aventura Urbana",
                        "Sumérgete en el dinamismo de una gran ciudad donde cada rincón cuenta una historia. Entre luces, cultura y ritmo acelerado, cada día es una nueva oportunidad para explorar lo inesperado.",
                        R.drawable.ciudad
                )
        );



        for (CardInfo card : listaCards) {
            View cardView = inflater.inflate(R.layout.item_card, container, false);

            ImageView imageView = cardView.findViewById(R.id.cardImage);
            TextView titleView = cardView.findViewById(R.id.cardTitle);
            TextView descView = cardView.findViewById(R.id.cardDescription);
            Button button = cardView.findViewById(R.id.cardButton);

            imageView.setImageResource(card.imagenResId);
            titleView.setText(card.titulo);
            descView.setText(card.descripcion);

            button.setOnClickListener(v -> {


                // Cambiar a Detalle fragment
                requireActivity().getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.flFragment, new Detalle())
                        .addToBackStack(null)
                        .commit();
            });

            cardContainer.addView(cardView);
        }

        return view;
    }
}