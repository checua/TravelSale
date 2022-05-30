package com.example.travelsale;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ContentActivity extends AppCompatActivity {

    public static final String NOMBRE_USUARIO = "David";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_content );
    }

    public void enviarnombre(View view){
        Intent intenEnviar = new Intent ( this, DestinoActivity.class );
        EditText nombreUsuario = findViewById ( R.id.nombre );
        String nombreUsuarioMensaje = nombreUsuario.getText ().toString ();
        intenEnviar.putExtra (NOMBRE_USUARIO, nombreUsuarioMensaje);
        startActivity(intenEnviar);
    }
}