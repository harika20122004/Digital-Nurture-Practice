package financialforecasting;

public class ForecastService {
    private ForecastingAlgorithm algorithm;

    public ForecastService() {
        this.algorithm = new ForecastingAlgorithm();
    }

    public double forecastNext(FinancialData data, double alpha) {
        return algorithm.calculateForecast(data.getDataPoints(), alpha);
    }
}
