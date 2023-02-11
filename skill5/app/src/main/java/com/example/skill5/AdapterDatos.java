package com.example.skill5;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterDatos extends RecyclerView.Adapter<AdapterDatos.ViewHolderDatos> {

    ArrayList<PersonajeVo> listDatos;
    public AdapterDatos(ArrayList<PersonajeVo> listDatos){
        this.listDatos = listDatos;
    }

    @Override
    public AdapterDatos.ViewHolderDatos onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, null, false);
        return new ViewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(AdapterDatos.ViewHolderDatos holder, int position) {
       //holder.asignarDatps(listDatos.get(position));
        holder.etiNombre.setText(listDatos.get(position).getNombre());
        holder.etiInfo.setText(listDatos.get(position).getInfo());
        holder.foto.setImageResource(listDatos.get(position).getFoto());



    }

    @Override
    public int getItemCount() {
        return listDatos.size();
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {

        //TextView dato;

        TextView etiNombre, etiInfo;
        ImageView foto;

        public ViewHolderDatos(View itemView) {
            super(itemView);
            etiNombre = itemView.findViewById(R.id.idDato);
            etiInfo = itemView.findViewById(R.id.info);
            foto = itemView.findViewById(R.id.imagen);

        }

        /*public void asignarDatps(String datos) {
            dato.setText(datos);
        }*/
    }
}
