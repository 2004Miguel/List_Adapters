package com.miguel.list_adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;

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
    }

    @Override asfdasdfasdfsadf



}
