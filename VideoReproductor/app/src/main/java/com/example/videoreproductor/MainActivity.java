package com.example.videoreproductor;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.videoreproductor.PlaylistActivity;
import com.example.videoreproductor.VideoDbHelper;
import com.example.videoreproductor.VideoItem;
import com.example.videoreproductor.VideoPlaylist;
import com.example.videoreproductor.VideoListAdapter;

public class MainActivity extends AppCompatActivity {
    private VideoView videoView;
    private Button btnLoadVideo, btnPlayVideo, btnCreatePlaylist, btnViewPlaylist;

    private Uri videoUri; // Almacenar la URI del video seleccionado
    private SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializar vistas
        videoView = findViewById(R.id.videoView);
        btnLoadVideo = findViewById(R.id.btnLoadVideo);
        btnPlayVideo = findViewById(R.id.btnPlayVideo);
        btnCreatePlaylist = findViewById(R.id.btnCreatePlaylist);
        btnViewPlaylist = findViewById(R.id.btnViewPlaylist);

        // Inicializar la base de datos
        VideoDbHelper dbHelper = new VideoDbHelper(this);
        db = dbHelper.getWritableDatabase();

        // Configurar el botón "Cargar video"
        btnLoadVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Abrir el selector de archivos y permitir al usuario seleccionar un archivo de video
                Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                intent.setType("video/*");
                startActivityForResult(Intent.createChooser(intent, "Selecciona un video"), 1);
            }
        });

        // Configurar el botón "Reproducir video"
        btnPlayVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (videoUri != null) {
                    // Si se ha seleccionado un video, reproducirlo
                    videoView.setVideoURI(videoUri);
                    videoView.start();
                } else {
                    // Si no se ha seleccionado ningún video, mostrar un mensaje de error
                    Toast.makeText(MainActivity.this, "Por favor selecciona un video", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Configurar el botón "Ver lista de reproducción"
        btnViewPlaylist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, VideoListAdapter.class);
                startActivity(intent);
            }
        });

        // Configurar el botón "Crear lista de reproducción"
        btnCreatePlaylist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Abrir una nueva actividad para que el usuario pueda crear una lista de reproducción
                Intent intent = new Intent(MainActivity.this, PlaylistActivity.class);
                startActivity(intent);
            }
        });
    }

    // Manejar la respuesta del selector de archivos
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        String videoPath = null;
        if (requestCode == 1 && resultCode == RESULT_OK && data != null) {
            // Si se seleccionó un archivo, guardar su URI y mostrar un mensaje de éxito video
            if (requestCode == 1 && resultCode == RESULT_OK && data != null) {
// Si se seleccionó un archivo, guardar su URI y mostrar un mensaje de éxito
                videoUri = data.getData();
                String[] projection = {MediaStore.Video.Media._ID, MediaStore.Video.Media.DATA};
                Cursor cursor = getContentResolver().query(videoUri, projection, null, null, null);
                if (cursor != null && cursor.moveToFirst()) {
                    int columnIndex = cursor.getColumnIndexOrThrow(MediaStore.Video.Media.DATA);
                    videoPath = cursor.getString(columnIndex);
                }
                if (cursor != null) {
                    cursor.close();
                }
                VideoItem videoItem = new VideoItem(videoUri);
                VideoPlaylist.getInstance().addVideo(videoItem);
                Toast.makeText(this, "Archivo seleccionado: " + videoItem.getTitle(), Toast.LENGTH_SHORT).show();
            }
          }
    }
}