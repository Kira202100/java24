package org.hogwards.massive;

public class Main {
    public static void main(String[] args) {
        int[] number = {6,8,7,9,4,16,9,10};
        TrafficAnalyser trafficAnalyser =new TrafficAnalyser(number);
        System.out.println(trafficAnalyser.getMaxTraffic(number));
    }
}
