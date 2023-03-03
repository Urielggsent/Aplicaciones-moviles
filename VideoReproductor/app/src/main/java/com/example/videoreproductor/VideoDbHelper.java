package com.example.videoreproductor;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class VideoDbHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "videos.db";
    private static final int DATABASE_VERSION = 1;

    public VideoDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Crear la tabla de videos
        String CREATE_TABLE_VIDEOS = "CREATE TABLE " + VideoContract.VideoEntry.TABLE_NAME + " (" +
                VideoContract.VideoEntry._ID + " INTEGER PRIMARY KEY," +
                VideoContract.VideoEntry.COLUMN_NAME + " TEXT," +
                VideoContract.VideoEntry.COLUMN_URI + " TEXT)";
        db.execSQL(CREATE_TABLE_VIDEOS);

        // Insertar algunos videos de ejemplo
        insertVideo(db, "Video de ejemplo 1", "/storage/emulated/0/Download/video1.mp4");
        insertVideo(db, "Video de ejemplo 2", "/storage/emulated/0/Download/video2.mp4");
        insertVideo(db, "Video de ejemplo 3", "/storage/emulated/0/Download/video3.mp4");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Eliminar la tabla de videos si existe
        db.execSQL("DROP TABLE IF EXISTS " + VideoContract.VideoEntry.TABLE_NAME);

        // Crear la tabla de videos de nuevo
        onCreate(db);
    }

    private void insertVideo(SQLiteDatabase db, String name, String uri) {
        ContentValues values = new ContentValues();
        values.put(VideoContract.VideoEntry.COLUMN_NAME, name);
        values.put(VideoContract.VideoEntry.COLUMN_URI, uri);
        db.insert(VideoContract.VideoEntry.TABLE_NAME, null, values);
    }
}
