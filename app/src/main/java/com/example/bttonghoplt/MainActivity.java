package com.example.bttonghoplt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private RecyclerView rcvHorse;
    private Button btnHorse,btnFood,btnTool;
    private GridLayoutManager gridLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnHorse = findViewById(R.id.btn_Horse);
        btnFood = findViewById(R.id.btn_Food);
        btnTool = findViewById(R.id.btn_Tool);

        rcvHorse = findViewById(R.id.rcv_horse);
        gridLayoutManager = new GridLayoutManager(this,2);
        rcvHorse.setLayoutManager(gridLayoutManager);

        HorseAdapter adapter = new HorseAdapter(getListHorse());
        rcvHorse.setAdapter(adapter);

        btnHorse.setOnClickListener(this);
        btnFood.setOnClickListener(this);
        btnTool.setOnClickListener(this);


    }

    private List<Horse> getListHorse() {
        List<Horse> list = new ArrayList<>();
        list.add(new Horse(R.drawable.img_ngua, "Ngựa", Horse.TYPE_Horse));
        list.add(new Horse(R.drawable.img_ngua, "Ngựa", Horse.TYPE_Horse));
        list.add(new Horse(R.drawable.img_ngua, "Ngựa", Horse.TYPE_Horse));
        list.add(new Horse(R.drawable.img_ngua, "Ngựa", Horse.TYPE_Horse));
        list.add(new Horse(R.drawable.img_ngua, "Ngựa", Horse.TYPE_Horse));
        list.add(new Horse(R.drawable.img_ngua, "Ngựa", Horse.TYPE_Horse));

        list.add(new Horse(R.drawable.img_thucan, "Ngựa", Horse.TYPE_Food));
        list.add(new Horse(R.drawable.img_thucan, "Ngựa", Horse.TYPE_Food));
        list.add(new Horse(R.drawable.img_thucan, "Ngựa", Horse.TYPE_Food));
        list.add(new Horse(R.drawable.img_thucan, "Ngựa", Horse.TYPE_Food));
        list.add(new Horse(R.drawable.img_thucan, "Ngựa", Horse.TYPE_Food));
        list.add(new Horse(R.drawable.img_thucan, "Ngựa", Horse.TYPE_Food));

        list.add(new Horse(R.drawable.img_vatdung, "Ngựa", Horse.TYPE_Tool));
        list.add(new Horse(R.drawable.img_vatdung, "Ngựa", Horse.TYPE_Tool));
        list.add(new Horse(R.drawable.img_vatdung, "Ngựa", Horse.TYPE_Tool));
        list.add(new Horse(R.drawable.img_vatdung, "Ngựa", Horse.TYPE_Tool));
        list.add(new Horse(R.drawable.img_vatdung, "Ngựa", Horse.TYPE_Tool));
        list.add(new Horse(R.drawable.img_vatdung, "Ngựa", Horse.TYPE_Tool));


        return list;
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_Horse:
                scrollToItem(0);
                break;
            case R.id.btn_Food:
                scrollToItem(6);
                break;
            case R.id.btn_Tool:
                scrollToItem(14);
                break;
        }
    }

    private void scrollToItem(int index) {
        if(gridLayoutManager == null) {
            return;
        }
        gridLayoutManager.scrollToPositionWithOffset(index, 0);
    }
}