package id.ac.polinema.recyclerviewsangatsederhana.adapters;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import id.ac.polinema.recyclerviewsangatsederhana.moduls.superhero
        ;

public class superheroadapters extends RecyclerView.Adapter<superheroadapters.MyViewHolder> {
    List<superhero> heroList;

    public superheroadapters(List<superhero> heroList) {
        this.heroList = heroList;
    }

    @NonNull
    @Override
    public superheroadapters.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull superheroadapters.MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}