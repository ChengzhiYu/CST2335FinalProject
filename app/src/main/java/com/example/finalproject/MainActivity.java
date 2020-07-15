package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button goToGeoBtn = findViewById(R.id.btn_to_geo);
        Intent goToGeoIntent = new Intent(MainActivity.this, GeoDataActivity.class);
        goToGeoBtn.setOnClickListener(click -> {
            startActivity(goToGeoIntent);
        });

        Button goToHighlightBtn = findViewById(R.id.btn_to_highlight);
        Intent goToHighlightIntent = new Intent(MainActivity.this, SoccerHighlightActivity.class);
        goToHighlightBtn.setOnClickListener(click -> {
            startActivity(goToHighlightIntent);
        });

        Button goToLyricsBtn = findViewById(R.id.btn_to_lyrics);
        Intent goToLyricsIntent = new Intent(MainActivity.this, SongLyricsActivity.class);
        goToLyricsBtn.setOnClickListener(click -> {
            startActivity(goToLyricsIntent);
        });

        Button goToDeezerBtn = findViewById(R.id.btn_to_deezer);
        Intent goToDeezerIntent = new Intent(MainActivity.this, DezeerSongActivity.class);
        goToDeezerBtn.setOnClickListener(click -> {
            startActivity(goToDeezerIntent);
        });
    }
}