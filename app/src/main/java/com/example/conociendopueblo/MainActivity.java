package com.example.conociendopueblo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    Pueblo pueblo;
    ImageView imagen;
    TextView titulo, desc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagen = findViewById(R.id.imagen);
        titulo = findViewById(R.id.titulo);
        desc = findViewById(R.id.texto);

        pueblo = (Pueblo) getIntent().getSerializableExtra("datos");

        Picasso.with(MainActivity.this)
                .load(pueblo.getImagen())
                .into(imagen);
        titulo.setText(pueblo.getTitulo());
        desc.setText(pueblo.getDesc());
    }
}