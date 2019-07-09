package com.example.recyclerviewmultiviewtype;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recyclerView);

        List<MyModel> models = new ArrayList<>();
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Rick and morty",R.mipmap.rickandmorty));
        movies.add(new Movie("Stranger things",R.mipmap.strangerthings));
        movies.add(new Movie("Punisher",R.mipmap.punisher));


        models.add(new MyModel("banner","Banner"));
        models.add(new MyModel("list","List"));
        models.add(new MyModel("list","List"));
        models.add(new MyModel("list","List"));
        models.add(new MyModel("AD","AD"));
        models.add(new MyModel("movie",movies));
        models.add(new MyModel("list","List"));
        models.add(new MyModel("list","List"));
        models.add(new MyModel("AD","AD"));
        models.add(new MyModel("list","List"));


        MyAdapter myAdapter = new MyAdapter(models,this);
        mRecyclerView.setAdapter(myAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));


    }
}
