package com.example.conociendopueblo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Home extends AppCompatActivity {

    ArrayList<Pueblo> listAtrib = new ArrayList<>();
    RecyclerView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        list = findViewById(R.id.list);
        list.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        createList();
        ListaAdaptador adaptador = new ListaAdaptador(listAtrib);
        list.setAdapter(adaptador);
    }

    private void createList()
    {
        listAtrib.add(new Pueblo("Parroquia de San Antornio", "Támesis, es el primer municipio de Antioquia que dijo no a la minería metálica, un pueblo aunténtico al que aún no ha llegado el turismo de masas y dónde encontrarás un destino perfecto para salir un fin de semana con la familia.", R.drawable.iglesia));
        listAtrib.add(new Pueblo("Monte mágico", "Situado en Támesis, ofrece alojamiento con piscina al aire libre, conexíon WiFi gratuita, restaurante y bar.", R.drawable.monte));
    }
}