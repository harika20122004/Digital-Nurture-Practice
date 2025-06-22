package financialforecasting;

import java.util.List;

public class ForecastingAlgorithm {

    // Simple Exponential Smoothing forecast
    public double calculateForecast(List<Double> data, double alpha) {
        if (data == null || data.isEmpty()) {
            throw new IllegalArgumentException("Data cannot be empty.");
        }

        double forecast = data.get(0);

        for (int i = 1; i < data.size(); i++) {
            forecast = alpha * data.get(i - 1) + (1 - alpha) * forecast;
        }

        return forecast;
    }
}
v
