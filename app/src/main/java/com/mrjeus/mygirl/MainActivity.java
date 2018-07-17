package com.mrjeus.mygirl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecycle;
    ArrayList<Hero> mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mList = new ArrayList<>();
        Hero hero1 = new Hero(R.drawable.ryze1, "Image 1");
        Hero hero2 = new Hero(R.drawable.ryze2, "Image 2");
        Hero hero3 = new Hero(R.drawable.ryze3, "Image 3");
        Hero hero4 = new Hero(R.drawable.ryze4, "Image 4");
        mList.add(hero1);
        mList.add(hero2);
        mList.add(hero3);
        mList.add(hero4);

        mRecycle = (RecyclerView) findViewById(R.id.recycler_view);
        mRecycle.setHasFixedSize(true);
        LinearLayoutManager manager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        mRecycle.setLayoutManager(manager);
        RecyclerViewAdapter mAdapter = new RecyclerViewAdapter(getApplicationContext(), mList);
        mRecycle.setAdapter(mAdapter);
    }
}
