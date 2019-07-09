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
        models.add(new MyModel("banner","Banner"));
        models.add(new MyModel("list","List"));
        models.add(new MyModel("list","List"));
        models.add(new MyModel("list","List"));
        models.add(new MyModel("AD","AD"));
        models.add(new MyModel("list","List"));
        models.add(new MyModel("list","List"));
        models.add(new MyModel("AD","AD"));
        models.add(new MyModel("list","List"));


        MyAdapter myAdapter = new MyAdapter(models,this);
        mRecyclerView.setAdapter(myAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));


    }
}
