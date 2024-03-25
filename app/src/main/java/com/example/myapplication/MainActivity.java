package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<Item> items = new ArrayList<>();
        items.add(new Item("Abmi Sukma Edri","12250120341",R.drawable.amiii));
        items.add(new Item("Ahmad Kurniawan","12250111514",R.drawable.ahmed));
        items.add(new Item("Aufa Hajati","12250120338",R.drawable.aufa));
        items.add(new Item("Daffa Finanda","12250111603",R.drawable.dapin));
        items.add(new Item("Daffa Ikhwan Nurfauzan","12250110979",R.drawable.dafuq));
        items.add(new Item("Dwi Jelita Adhliyah","12250120331",R.drawable.jelita));
        items.add(new Item("Dwi Mahdini","12250111298",R.drawable.dwik));
        items.add(new Item("Fajri","12250110382",R.drawable.fajri));
        items.add(new Item("Fakhri","12250111381",R.drawable.fakhri));
        items.add(new Item("Farras Lathief","12250111328",R.drawable.farras));
        items.add(new Item("Gilang Ramadhan Indra","12250111323",R.drawable.gilang));
        items.add(new Item("Hafidz Alhadid Rahman","12250111794",R.drawable.hafidz));
        items.add(new Item("Haritsah Naufaldy","12250110361",R.drawable.aldy));
        items.add(new Item("M. Nabil Dawami","12250111527",R.drawable.nabil));
        items.add(new Item("Muh. Zaki Erbai Syas","12250111134",R.drawable.zaki));
        items.add(new Item("Muhammad Aditya","12250111048",R.drawable.adit));
        items.add(new Item("Muhammad Dhimas","12250111231",R.drawable.dms));
        items.add(new Item("Muhammad Faruq","12250111791",R.drawable.faruqhz));
        items.add(new Item("Muhammad Rafly","12250111489",R.drawable.rafly));
        items.add(new Item("Nurika Dwi Wahyuni","12250120360",R.drawable.nurika));
        items.add(new Item("Ogya Secio","12250111346",R.drawable.ogi));
        items.add(new Item("Rahma Laksita","12250124357",R.drawable.rahma));
        items.add(new Item("Surya Hidayatullah","12250111759",R.drawable.srya));

        MyAdapter adapter = new MyAdapter(this, items);
        adapter.setOnItemClickListener(new MyAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Item item) {
                // Ketika item di RecyclerView diklik, buka DetailActivity dan kirim data item
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("name", item.getName());
                intent.putExtra("nim", item.getNim());
                intent.putExtra("image", item.getImage());
                startActivity(intent);
            }
        });

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}