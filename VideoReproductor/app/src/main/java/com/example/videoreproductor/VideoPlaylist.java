package com.example.videoreproductor;



import java.util.ArrayList;

public class VideoPlaylist {
    private static VideoPlaylist instance;
    private ArrayList<VideoItem> videoList;

    private VideoPlaylist() {
        videoList = new ArrayList<>();
    }

    public static VideoPlaylist getInstance() {
        if (instance == null) {
            instance = new VideoPlaylist();
        }
        return instance;
    }

    public ArrayList<VideoItem> getVideoList() {
        return videoList;
    }

    public void addVideo(VideoItem videoItem) {
        videoList.add(videoItem);
    }

    public void clearPlaylist() {
        videoList.clear();
    }
}
