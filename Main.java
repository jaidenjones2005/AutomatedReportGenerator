public class Main {

    public static void main(String[] args) {

        System.out.println("=== TRUCK REPORT ===");
        VehicleReport truck = new TruckReport();
        truck.generateReport();

        System.out.println();

        System.out.println("=== BIKE REPORT ===");
        VehicleReport bike = new BikeReport();
        bike.generateReport();
    }
}
