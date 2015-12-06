package com.example.william.newgalery.vista;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.*;
import android.widget.ImageView; // Se importa esta libreria para que nos permita imoplementar los escuchadores
import android.widget.TextView;
import android.widget.Toast;

import com.example.william.newgalery.R;

public class MainActivity extends AppCompatActivity implements OnClickListener { //Se implemente el escuchador click

    private ImageView imgUno, imgDos, imgTres, imgPrincipal;
    private String nombreImagen;
    private TextView tvInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Mapeamos las imagenes de la galería
        imgUno = (ImageView) findViewById(R.id.img_uno);
        imgDos = (ImageView) findViewById(R.id.img_dos);
        imgTres = (ImageView) findViewById(R.id.img_tres);
        tvInfo = (TextView) findViewById(R.id.tvInfo);

        //Le asignamos el escuchador a cada una de las imágenes
        imgUno.setOnClickListener(this);
        imgDos.setOnClickListener(this);
        imgTres.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        nombreImagen = null;
        try{
            switch (v.getId()) {
                case R.id.img_uno:
                    nombreImagen = v.getResources().getResourceEntryName(R.id.img_uno);
                    break;
                case R.id.img_dos:
                    nombreImagen = v.getResources().getResourceEntryName(R.id.img_dos);
                    break;
                case R.id.img_tres:
                    nombreImagen = v.getResources().getResourceEntryName(R.id.img_tres);
                    break;
            }
            Toast.makeText(this, "imagen: " + nombreImagen, Toast.LENGTH_SHORT).show();
        }catch(Exception e){
            tvInfo.setText(e.toString());
        }

    }
}
