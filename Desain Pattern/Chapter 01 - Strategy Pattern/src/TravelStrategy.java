public interface TravelStrategy {
    double calculateCost(double distance);
}

class CarStrategy implements TravelStrategy {

    @Override
    public double calculateCost(double distance) {
        return distance * 0.5;

    }
}
        class MotorcycleStrategy implements TravelStrategy {

            @Override
            public double calculateCost(double distance) {
                return distance * 0.25;
    }
}