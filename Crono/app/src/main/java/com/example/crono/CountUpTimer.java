package com.example.crono;

public abstract class CountUpTimer {

    private long startTime;
    private boolean isRunning;
    private long elapsedTime;

    public CountUpTimer() {
        reset();
    }

    public void start() {
        if (!isRunning) {
            isRunning = true;
            startTime = System.currentTimeMillis();
        }
    }

    public void stop() {
        if (isRunning) {
            isRunning = false;
            elapsedTime = System.currentTimeMillis() - startTime;
        }
    }

    public void reset() {
        isRunning = false;
        elapsedTime = 0;
    }

    public long getElapsedTime() {
        if (isRunning) {
            return System.currentTimeMillis() - startTime + elapsedTime;
        } else {
            return elapsedTime;
        }
    }

    public String getTimeString() {
        long elapsedMillis = getElapsedTime();
        int seconds = (int) (elapsedMillis / 1000) % 60;
        int minutes = (int) ((elapsedMillis / (1000 * 60)) % 60);
        int hours = (int) ((elapsedMillis / (1000 * 60 * 60)) % 24);
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}