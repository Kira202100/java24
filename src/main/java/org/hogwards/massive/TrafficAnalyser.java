package org.hogwards.massive;

public class TrafficAnalyser {
    private int[] data;

    public TrafficAnalyser(int[] data) {
        this.data = data;
    }

    public int[] getData() {
        return data;
    }

    public int getMaxTraffic(int[] data) {
        int max = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }
        return max;
    }
}

