package com.example.videoreproductor;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class VideoListAdapter extends BaseAdapter {

    private ArrayList<VideoItem> videoList;
    private LayoutInflater inflater;

    public VideoListAdapter(Context context, ArrayList<VideoItem> videoList) {
        this.videoList = videoList;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return videoList.size();
    }

    @Override
    public Object getItem(int position) {
        return videoList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.list_item, null);
            holder = new ViewHolder();
            holder.videoTitle = convertView.findViewById(R.id.video_title);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Uri videoUri = videoList.get(position).getVideoUri();
        String videoTitle = videoUri.getLastPathSegment();
        holder.videoTitle.setText(videoTitle);

        return convertView;
    }

    private static class ViewHolder {
        TextView videoTitle;
    }
}
