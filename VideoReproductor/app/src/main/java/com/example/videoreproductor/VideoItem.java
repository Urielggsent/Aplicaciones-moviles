package com.example.videoreproductor;

import android.net.Uri;

public class VideoItem {

    private Uri videoUri;

    public VideoItem(Uri videoUri) {
        this.videoUri = videoUri;
    }

    public Uri getVideoUri() {
        return videoUri;
    }

    public void setVideoUri(Uri videoUri) {
        this.videoUri = videoUri;
    }

    public String getTitle() {
        String title = "";
        // Extract the video title from the videoUri here
        return title;
    }
}
