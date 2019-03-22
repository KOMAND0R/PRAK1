package com.example.prak1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class SplashScreenActivity extends AppCompatActivity {
    private RecyclerView recycler;
    private MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        recycler = findViewById(R.id.recycleView1);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recycler.setLayoutManager(layoutManager);

        recycler.setHasFixedSize(true);

        myAdapter = new MyAdapter(1000000);
        recycler.setAdapter(myAdapter);
    }
}