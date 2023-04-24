package br.com.etecia.notnews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MenuActivity extends AppCompatActivity {


    ImageView imgUm;
    ImageView imgDois;
    ImageView imgTres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout);


        imgUm = findViewById(R.id.img1);
        imgDois = findViewById(R.id.img2);
        imgTres = findViewById(R.id.img3);

        imgUm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),
                        MainActivity.class));
                finish();
            }
        });
        imgDois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),
                        MainActivity.class));
                finish();
            }
        });
        imgTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),
                        MainActivity.class));
                finish();
            }
        });

    }
}