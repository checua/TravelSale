package com.example.travelsale;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DestinoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_destino );

        Intent intentFinal = getIntent ();
        String nombreUsuarioFinal = intentFinal.getStringExtra ( ContentActivity.NOMBRE_USUARIO );

        TextView mensajeFinal = findViewById ( R.id.mensajeFinal );
        mensajeFinal.setText ( nombreUsuarioFinal );
    }
}