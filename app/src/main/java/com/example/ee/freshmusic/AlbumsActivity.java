package com.example.ee.freshmusic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        ImageButton back1 = findViewById(R.id.imageButton2);
        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btonowplaying = new Intent(AlbumsActivity.this, NowPlaying.class);
                startActivity(btonowplaying);


            }


        });

        //Toolbar
        setTitle("");
    }

}