package financialforecasting;

import java.util.Arrays;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<Double> revenueData = Arrays.asList(1000.0, 1100.0, 1080.0, 1150.0, 1200.0);

        FinancialData data = new FinancialData(revenueData);
        ForecastService service = new ForecastService();

        double alpha = 0.5;
        double nextForecast = service.forecastNext(data, alpha);

        System.out.printf("Forecasted next financial value: %.2f\n", nextForecast);
    }
}
