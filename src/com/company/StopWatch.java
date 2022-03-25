package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StopWatch {
    private long startTime;
    private long EndTime;

    public StopWatch() {
    }

    public StopWatch(long startTime, long endTime) {
        this.startTime = startTime;
        EndTime = endTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return EndTime;
    }

    public void setEndTime(long endTime) {
        EndTime = endTime;
    }
    public long elapsedTime(){
        return (this.EndTime - this.startTime)/1000;
    }
}