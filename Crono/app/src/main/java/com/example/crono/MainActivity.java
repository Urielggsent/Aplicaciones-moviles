package com.example.crono;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private boolean isRunning;  // indica si el cronómetro está corriendo o no
    private long startTime;  // marca de tiempo en que se inició el cronómetro
    private long elapsedTime;  // tiempo transcurrido desde que se inició el cronómetro
    private Handler handler;  // Handler para actualizar el cronómetro cada 100 ms
    private ArrayList<Long> lapTimes;  // lista para almacenar los tiempos de los laps
    private ArrayAdapter<String> lapListAdapter;  // adapter para mostrar los laps en el ListView

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        isRunning = false;
        startTime = 0;
        elapsedTime = 0;
        handler = new Handler();
        lapTimes = new ArrayList<>();
        lapListAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1);

        ListView lapListView = findViewById(R.id.lapListView);
        lapListView.setAdapter(lapListAdapter);
    }

    public void onStartButtonClick(View view) {
        if (!isRunning) {
            isRunning = true;
            startTime = System.currentTimeMillis();
            handler.postDelayed(updateTimer, 0);
        }
    }

    public void onStopButtonClick(View view) {
        if (isRunning) {
            isRunning = false;
            elapsedTime += System.currentTimeMillis() - startTime;
            handler.removeCallbacks(updateTimer);
        }
    }

    public void onResetButtonClick(View view) {
        isRunning = false;
        startTime = 0;
        elapsedTime = 0;
        lapTimes.clear();
        lapListAdapter.clear();
        ((TextView) findViewById(R.id.timerTextView)).setText("00:00:00");
    }

    public void onLapButtonClick(View view) {
        if (isRunning) {
            long lapTime = System.currentTimeMillis() - startTime;
            lapTimes.add(lapTime);
            lapListAdapter.add(formatTime(lapTime));
        }
    }

    private Runnable updateTimer = new Runnable() {
        @Override
        public void run() {
            long currentTime = System.currentTimeMillis();
            elapsedTime = currentTime - startTime;
            ((TextView) findViewById(R.id.timerTextView)).setText(formatTime(elapsedTime));
            handler.postDelayed(this, 100);
        }
    };

    private String formatTime(long time) {
        int hours = (int) (time / 3600000);
        int minutes = (int) ((time % 3600000) / 60000);
        int seconds = (int) ((time % 60000) / 1000);
        int milliseconds = (int) (time % 1000);
        return String.format(Locale.getDefault(), "%02d:%02d:%02d.%03d", hours, minutes, seconds, milliseconds);
    }
}