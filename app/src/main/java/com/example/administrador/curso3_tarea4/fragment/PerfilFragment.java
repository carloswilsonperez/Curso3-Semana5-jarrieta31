package com.example.administrador.curso3_tarea4.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.administrador.curso3_tarea4.R;
import com.example.administrador.curso3_tarea4.adapter.PerfilAdaptador;
import com.example.administrador.curso3_tarea4.pojo.Mascota;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class PerfilFragment extends Fragment {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaPerfiles;
    public PerfilAdaptador adaptador;


    public PerfilFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_perfil , container, false);
        // Inflate the layout for this fragment
     //   return inflater.inflate(R.layout.fragment_perfil, container, false);

        listaPerfiles = (RecyclerView) v.findViewById(R.id.rvPerfil);

        // Instacia el GridLayoutManager que sirve para manejar la forma en que se ve la lista
        GridLayoutManager glm = new GridLayoutManager(getContext(), 3);

        //Le decimos que el RecyclerView se comporte como un LinearLayoutManager y adquiera todas sus propiedades
        listaPerfiles.setLayoutManager(glm);
        inicializarListaMascotas(); // Inicializamos la lista de mascotas
        inicializaAdaptador();    // Inicializamos el adaptador

        return v;
    }

    // Inicializa el adaptador
    public void inicializaAdaptador(){
        adaptador = new PerfilAdaptador(mascotas, getActivity());
        listaPerfiles.setAdapter(adaptador);
    }


    // Cargo las mascotas a mostrar
    public void inicializarListaMascotas(){
        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota("Pulgarcito", 2, R.drawable.perro00, R.color.fondo_perro00));
        mascotas.add(new Mascota("Yaman", 5, R.drawable.perro01, R.color.fondo_perro01));
        mascotas.add(new Mascota("Toby", 3, R.drawable.perro02, R.color.fondo_perro02));
        mascotas.add(new Mascota("Peñarol", 3, R.drawable.perro03, R.color.fondo_perro03));
        mascotas.add(new Mascota("Fausto", 4, R.drawable.perro04, R.color.fondo_perro04));
        mascotas.add(new Mascota("Rafa", 2, R.drawable.perro05, R.color.fondo_perro05));
        mascotas.add(new Mascota("Duke", 2, R.drawable.perro06, R.color.fondo_perro06));
        mascotas.add(new Mascota("Spayck", 2, R.drawable.perro07, R.color.fondo_perro07));
        mascotas.add(new Mascota("Paco", 5, R.drawable.perro08, R.color.fondo_perro08));
    }

}
