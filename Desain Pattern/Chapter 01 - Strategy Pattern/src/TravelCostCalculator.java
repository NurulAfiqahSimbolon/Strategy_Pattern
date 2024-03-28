public class TravelCostCalculator {

    private TravelStrategy strategy;

    public TravelCostCalculator(TravelStrategy strategy) {
        this.strategy = strategy;
    }
    public double calculateCost ( double distance){
        return strategy.calculateCost(distance);
    }
}