package com.example.conociendopueblo;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ListaAdaptador extends RecyclerView.Adapter<ListaAdaptador.viewHolder> {

    ArrayList<Pueblo> list;

    public ListaAdaptador(ArrayList<Pueblo> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ListaAdaptador.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View listItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_lista, parent, false);
        return new viewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(@NonNull ListaAdaptador.viewHolder holder, int position) {
        holder.actualizar(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView imagen;
        TextView title;
        public viewHolder(@NonNull View itemView) {
            super(itemView);

            imagen = itemView.findViewById(R.id.img);
            title = itemView.findViewById(R.id.tit);
        }

        public void actualizar(final Pueblo pueblo)
        {
            Picasso.with(itemView.getContext())
                    .load(pueblo.getImagen())
                    .into(imagen);
            title.setText(pueblo.getTitulo());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(), MainActivity.class);
                    intent.putExtra("datos", pueblo);
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
}
