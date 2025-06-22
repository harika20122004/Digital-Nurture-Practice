package financialforecasting;

import java.util.List;

public class FinancialData {
    private List<Double> dataPoints;

    public FinancialData(List<Double> dataPoints) {
        this.dataPoints = dataPoints;
    }

    public List<Double> getDataPoints() {
        return dataPoints;
    }
}
