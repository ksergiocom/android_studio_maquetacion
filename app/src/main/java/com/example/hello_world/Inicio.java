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

        LinearLayout cardContainer = view.findViewById(R.id.cardContainer);

        List<CardInfo> listaCards = Arrays.asList(
                new CardInfo("Viaje a la Playa", "Sol y arena", R.drawable.playa),
                new CardInfo("Montañas", "Aventura y aire fresco", R.drawable.montana),
                new CardInfo("Ciudad", "Explora la cultura urbana", R.drawable.ciudad)
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
                Toast.makeText(getContext(), "Has pulsado: " + card.titulo, Toast.LENGTH_SHORT).show();
            });

            cardContainer.addView(cardView);
        }

        return view;
    }
}