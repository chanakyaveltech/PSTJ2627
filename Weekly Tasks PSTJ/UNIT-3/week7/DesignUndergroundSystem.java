import java.util.*;

public class DesignUndergroundSystem {
    class CheckInInfo {
        String stationName; int time;
        CheckInInfo(String stationName, int time) { this.stationName = stationName; this.time = time; }
    }
    
    class RouteStat {
        double totalTime; int count;
        RouteStat() { this.totalTime = 0; this.count = 0; }
    }
    
    Map<Integer, CheckInInfo> checkIns = new HashMap<>();
    Map<String, RouteStat> routeStats = new HashMap<>();

    public void checkIn(int id, String stationName, int t) {
        checkIns.put(id, new CheckInInfo(stationName, t));
    }

    public void checkOut(int id, String stationName, int t) {
        CheckInInfo info = checkIns.remove(id);
        String route = info.stationName + "->" + stationName;
        RouteStat stat = routeStats.getOrDefault(route, new RouteStat());
        stat.totalTime += (t - info.time);
        stat.count++;
        routeStats.put(route, stat);
    }

    public double getAverageTime(String startStation, String endStation) {
        String route = startStation + "->" + endStation;
        RouteStat stat = routeStats.get(route);
        return stat.totalTime / stat.count;
    }

    public static void main(String[] args) {
        DesignUndergroundSystem us = new DesignUndergroundSystem();
        us.checkIn(45, "Leyton", 3);
        us.checkIn(32, "Paradise", 8);
        us.checkOut(45, "Waterloo", 15);
        System.out.println(us.getAverageTime("Leyton", "Waterloo")); // returns 12.0
    }
}