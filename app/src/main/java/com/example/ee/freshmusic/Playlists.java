package com.example.ee.freshmusic;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;


public class Playlists extends Activity implements SongListAdapter.SongClickListener {


    ArrayList<SongItems> SongItems = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(android.R.style.Theme_DeviceDefault_Light);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_playlists);

        SongItems.add(new SongItems("We Are Here", "Alicia Keys", R.drawable.aliciakeys_albumart));
        SongItems.add(new SongItems("Overprotected", "Britney Spears", R.drawable.britneyspears_albumart));
        SongItems.add(new SongItems("It Only Rains On Me", "Don Williams", R.drawable.donwilliams_albumart));
        SongItems.add(new SongItems("Free", "Enrique Iglesias", R.drawable.enriqueiglesias_albumart));
        SongItems.add(new SongItems("Zebras & Airplanes", "Alicia Keys", R.drawable.aliciakeys_albumart));
        SongItems.add(new SongItems("Running With The Wolves", "Aurora", R.drawable.aurora_albumart));
        SongItems.add(new SongItems("Man Of The Woods", "Justin Timbalake", R.drawable.justintimblake_albumart));
        SongItems.add(new SongItems("I Never Told You", "Colbie Calilat", R.drawable.colbiecalilat_albumart));
        SongItems.add(new SongItems("I Wanna Be Free", "Marc Anthony", R.drawable.marcanthony_albumart));
        SongItems.add(new SongItems("Ghost Of You", "Selena Gomez", R.drawable.selenagomez_albumart));
        SongItems.add(new SongItems("You Still The One", "Shania Twain", R.drawable.shaniatwain_albumart));
        SongItems.add(new SongItems("Bailando", "Enrique Iglesias", R.drawable.enriqueiglesias_albumart));
        SongItems.add(new SongItems("Hello", "Adele", R.drawable.adele_albumart));
        SongItems.add(new SongItems("I'm Not A Girl", "Britney Spears", R.drawable.britneyspears_albumart));
        SongItems.add(new SongItems("Bad Liar", "Selena Gomez", R.drawable.selenagomez_albumart));

        //casting view from adapter into List View on My PlayLists
        SongListAdapter Adapter = new SongListAdapter(this, SongItems, this);

        ListView listView = findViewById(R.id.myplaylists);
        listView.setAdapter(Adapter);

    }

    @Override
    public void songClicked(int position) {

        Intent intent = new Intent(Playlists.this, NowPlaying.class);

        startActivity(intent);


    }


}

