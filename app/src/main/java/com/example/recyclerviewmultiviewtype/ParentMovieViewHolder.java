package com.example.recyclerviewmultiviewtype;

import android.content.Context;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ParentMovieViewHolder extends RecyclerView.ViewHolder {
    private RecyclerView recyclerView;

    public ParentMovieViewHolder(@NonNull View itemView) {
        super(itemView);
        recyclerView = itemView.findViewById(R.id.movieRecyclerView);
    }

    public void setData(Context context, List<Movie> movie){
        MovieAdapter movieAdapter = new MovieAdapter(context,movie);
        recyclerView.setAdapter(movieAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false));
    }
}
