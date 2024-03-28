//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck modelduck = new ModelDuck();
        modelduck.performFly(); // Akan memanggil constructor modelduck(FlyNoWay())
        modelduck.setFlyBehavior(new FlyWithRocketPower());
        modelduck.performFly();
        System.out.println("\n");

        TravelCostCalculator calculator = new TravelCostCalculator(new CarStrategy());
        double cost = calculator.calculateCost(100);
        System.out.println("Biaya perjalanan dengan mobil untuk 100 km: " + cost);

        calculator = new TravelCostCalculator(new MotorcycleStrategy());
        cost = calculator.calculateCost(100);
        System.out.println("Biaya perjalanan dengan motor untuk 100 km: " + cost);
    }
}
