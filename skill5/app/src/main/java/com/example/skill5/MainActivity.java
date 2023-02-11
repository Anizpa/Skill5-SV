package com.example.skill5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.skill5.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<PersonajeVo> listDatos;
    RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler = (RecyclerView) findViewById(R.id.recyclerId);
        //recycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));
        //recycler.setLayoutManager(new GridLayoutManager(this, 2));
        listDatos = new ArrayList<>();
        recycler.setLayoutManager(new LinearLayoutManager(this));

        llenarPersonajes();



       /* for (int i = 0; i < 50; i++) {
            listDatos.add("Dato: " +i);
        }*/

        AdapterDatos adapterDatos = new AdapterDatos(listDatos);
        recycler.setAdapter(adapterDatos);
    }

    private void llenarPersonajes() {
        listDatos.add(new PersonajeVo("Krusty", "", R.drawable.krusti));
        listDatos.add(new PersonajeVo("Hommer", "", R.drawable.homero));
        listDatos.add(new PersonajeVo("Marge", "", R.drawable.marge));
        listDatos.add(new PersonajeVo("Bart", "", R.drawable.bart));
        listDatos.add(new PersonajeVo("Lisa", "", R.drawable.lisa));
        listDatos.add(new PersonajeVo("Maggie", "", R.drawable.magie));
        listDatos.add(new PersonajeVo("Flanders", "", R.drawable.flanders));
        listDatos.add(new PersonajeVo("Milhouse", "", R.drawable.milhouse));
        listDatos.add(new PersonajeVo("Sr. Burns", "", R.drawable.burns));

    }


}