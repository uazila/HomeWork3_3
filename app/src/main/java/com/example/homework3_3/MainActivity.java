package com.example.homework3_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recycle);
        ArrayList<String> nomer=new ArrayList<>();

        nomer.add("444666");
        nomer.add("2464");
        nomer.add("4456");
        nomer.add("5486");
        nomer.add("1478");
        nomer.add("1456");
        nomer.add("1258");
        nomer.add("3269");
        nomer.add("3698");
        nomer.add("589");
        nomer.add("895");
        nomer.add("1589");
        nomer.add("1259");
        nomer.add("1589");
        nomer.add("1259");


        NomerAdapter adapter=new NomerAdapter(nomer);
        recyclerView.setAdapter(adapter);

    }
}