package com.example.travelsale;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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
            }
        } );
    }
}