package com.catata.capturarguardarfoto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class Pantalla2 extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);

        imageView = (ImageView)findViewById(R.id.imageView2);

        cargarFoto();
    }

    private void cargarFoto() {
    }
}