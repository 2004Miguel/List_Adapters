package com.miguel.list_adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class List_Adapter extends BaseAdapter {
    Context contexto; //en donde estamos en este momento, en que pantalla
    String [] nombres, mensajes, hora_ultimo_mensaje, numero_telfono, pais;
    int id_imagen;
    LayoutInflater inflater; //Se va a "inflar el layout"

    public List_Adapter(Context contexto, String[] nombres, String[] mensajes, String[] hora_ultimo_mensaje, String[] numero_telfono, String[] pais, int id_imagen) {
        this.contexto = contexto;
        this.nombres = nombres;
        this.mensajes = mensajes;
        this.hora_ultimo_mensaje = hora_ultimo_mensaje;
        this.numero_telfono = numero_telfono;
        this.pais = pais;
        this.id_imagen = id_imagen;
        inflater = LayoutInflater.from(contexto);
    }

    @Override
    public int getCount(){return nombres.length;} //devuelve la cantidad de datos recibidos

    @Override
    public Object getItem(int i){return null;}  //devuelve un objeto vacio y recibe la cantidad de datos

    @Override
    public long getItemId(int i){return 0;}  //el id siempre va a ser 0
    @Override
    public View getView(int i, View vista, ViewGroup viewGroup){ //obtener la vista

        vista = inflater.inflate(R.layout.list_tem, null);
        ImageView fotoPerfil = vista.findViewById(R.id)

        return vista;
    }



}
