package com.example.ahorcado;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    LinearLayout lv;
    VistaJuego vista;
    String[] palabras;
    EditText txtLetra;
    Button btnIntrod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.layVist);
        vista = new VistaJuego(this);
        lv.addView(vista);
        palabras=getResources().getStringArray(R.array.palabras);
        txtLetra = findViewById(R.id.txtLetra);
        btnIntrod =findViewById(R.id.Introducir);
        btnIntrod.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.mnuNuevo){
            vista.nuevaPalabra(palabras);
        }else{
            finish();
        }

        return true;
    }

    @Override
    public void onClick(View v) {
        if(v==btnIntrod){
            vista.introducirLetra(txtLetra.getText().charAt(0));
        }


    }
}
