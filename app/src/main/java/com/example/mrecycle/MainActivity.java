package com.example.mrecycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
RecyclerView r1;
    String[] s1;
    String[] s2;
    int[] image = {R.drawable.dhoni, R.drawable.rohitsharma, R.drawable.dhoni, R.drawable.sachin,
            R.drawable.sachin, R.drawable.rohitsharma, R.drawable.sachin, R.drawable.sachin, R.drawable.rohitsharma};
MyownAdapter ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r1=findViewById(R.id.MyRecyclerView);
        s1=getResources().getStringArray(R.array.cricketers);
        s2=getResources().getStringArray(R.array.Scores);
ad = new MyownAdapter(this,s1,s2,image);
r1.setAdapter(ad);
       r1.setLayoutManager(new LinearLayoutManager(this));
    }
}
