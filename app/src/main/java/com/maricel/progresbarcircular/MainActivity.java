package com.maricel.progresbarcircular;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ProgressBar simpleProgressBar = (ProgressBar) findViewById(R.id.simpleProgresBar);
        Button btnIniciar = (Button) findViewById(R.id.btnIniciar);

        btnIniciar.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View view){
                simpleProgressBar.setVisibility(View.VISIBLE);
            }

        });
    }
}
