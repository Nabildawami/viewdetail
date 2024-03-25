package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Mengambil data yang dikirim dari MainActivity
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String nim = intent.getStringExtra("nim");
        int imageResourceId = intent.getIntExtra("image",0);

        // Menampilkan data di ImageView dan TextView
        ImageView imageView = findViewById(R.id.detail_imageview);
        TextView nameTextView = findViewById(R.id.detail_name);
        TextView nimTextView = findViewById(R.id.detail_nim);

        imageView.setImageResource(imageResourceId);
        nameTextView.setText(name);
        nimTextView.setText(nim);
    }
}
