package com.example.a4penguin;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView = findViewById(R.id.video_view);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);

        Uri uri = Uri.parse("paste link here");

        videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri);

        videoView.start();
    }
}
