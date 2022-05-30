package com.example.travelsale;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        Button btnParis = findViewById ( R.id.button);
        btnParis.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                Toast.makeText ( getApplicationContext (), "Has seleccionado Paris", Toast.LENGTH_LONG ).show ();
                Intent intent = new Intent ( MainActivity.this, ContentActivity.class );
                startActivity ( intent );
            }
        } );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater ();
        inflater.inflate ( R.menu.menu, menu );
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId ()){
            case R.id.ajustes:
                Toast.makeText ( getApplicationContext (), "Has pulsado Ajustes", Toast.LENGTH_LONG ).show ();
                return true;
            case R.id.ayuda:
                Toast.makeText ( getApplicationContext (), "Has pulsado Ayuda", Toast.LENGTH_LONG ).show ();
                return true;
            case R.id.extra:
                Toast.makeText ( getApplicationContext (), "Has pulsado Extra", Toast.LENGTH_LONG ).show ();
                return true;
            default:
                return super.onOptionsItemSelected ( item );
        }

    }
}