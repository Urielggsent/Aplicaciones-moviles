package com.example.videoreproductor;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.ListView;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaylistActivity extends AppCompatActivity {

    private static final int REQUEST_CODE_PICK_VIDEO = 1;

    private ArrayList<VideoItem> videoList;
    private VideoListAdapter videoListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        videoList = new ArrayList<>();
        videoListAdapter = new VideoListAdapter(this, videoList);

        ListView listView = findViewById(R.id.video_list_view);
        listView.setAdapter(videoListAdapter);

        Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(intent, REQUEST_CODE_PICK_VIDEO);
    }
    private void addToPlaylist(Uri videoUri) {
        videoList.add(new VideoItem(videoUri));
        videoListAdapter.notifyDataSetChanged();
    }

    private void updateVideoList(ArrayList<VideoItem> newVideoList) {
        videoList.clear();
        videoList.addAll(newVideoList);
        videoListAdapter.notifyDataSetChanged();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_CODE_PICK_VIDEO && resultCode == RESULT_OK) {
            Uri videoUri = data.getData();
            videoList.add(new VideoItem(videoUri));
            videoListAdapter.notifyDataSetChanged();
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        // Handle permissions results here
    }

}
