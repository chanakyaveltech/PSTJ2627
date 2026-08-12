import java.util.*;
import java.util.stream.Collectors;
class SensorReading {
    String sensorId;
    double temperature;
    public SensorReading(String sensorId, double temperature) {
        this.sensorId = sensorId;
        this.temperature = temperature;
    }
    public String getSensorId() {
        return sensorId;
    }
    public double getTemperature() {
        return temperature;
    }
}
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            return;
        }
        int n = scanner.nextInt();
        List<SensorReading> readings = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String sensorId = scanner.next();
            double temperature = scanner.nextDouble();
            readings.add(new SensorReading(sensorId, temperature));
        }
        readings.stream()
                .filter(r -> r.getTemperature() > 50)
                .collect(Collectors.groupingBy(
                        SensorReading::getSensorId,
                        Collectors.averagingDouble(SensorReading::getTemperature)
                ))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));

        scanner.close();
    }
}
