public class BridgeOfficer {

    int maxWeight;

    public BridgeOfficer(int normalVolume) {
        this.maxWeight = normalVolume;
    }

    public boolean checkTruck(Truck truck) {

        if (truck.weight > maxWeight) {
            System.out.println("Turn around, you're overweight!");
            return false;
        } else {
            System.out.println("Everything looks good, go ahead!");
            return true;
        }
    }

    public static void main(String[] args) {
        Truck first = new Truck();
        first.weight = 1000;
        Truck second = new Truck();
        second.weight = 20000;

        BridgeOfficer officer = new BridgeOfficer(15000);
        System.out.println("Truck 1! Can I go, officer?");
        boolean canFirstTruckGo = officer.checkTruck(first);
        System.out.println(canFirstTruckGo);;

        System.out.println();

        System.out.println("Truck 2! And can I?")        ;
        boolean canSecondTruckGo = officer.checkTruck(second);
        System.out.println(canSecondTruckGo);
    }
}