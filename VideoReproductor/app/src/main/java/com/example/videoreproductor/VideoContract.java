package com.example.videoreproductor;

import android.provider.BaseColumns;

public final class VideoContract {
    private VideoContract() {}

    public static class VideoEntry implements BaseColumns {
        public static final String TABLE_NAME = "videos";
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_URI = "uri";
    }
}