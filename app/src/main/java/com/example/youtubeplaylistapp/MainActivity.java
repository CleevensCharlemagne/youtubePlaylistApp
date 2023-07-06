package com.example.youtubeplaylistapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.api.services.youtube.YouTube;

import java.io.IOException;


public class MainActivity extends AppCompatActivity {

    YouTube youtube = new YouTube.Builder(new NetHttpTransport(), new JacksonFactory(), new HttpRequestInitializer() {
        @Override
        public void initialize(HttpRequest request) throws IOException {
            // Do nothing
        }
    }).setApplicationName("YourAppName").build();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}