package com.example.ee.freshmusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //passing intent to open Playlist Activity
    public void playlist (View view) {
        Intent playlistScreen = new Intent(this, Playlists.class);
        startActivity(playlistScreen);
    }
}
