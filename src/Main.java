public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Model S", "Tesla", 2023, 79999.99, "Red", 10);

        System.out.println(car1.toString());

        car1.sell(3);

        System.out.println("Model: " + car1.getModel());
        System.out.println("Brand: " + car1.getBrand());
        System.out.println("Year: " + car1.getYear());
        System.out.println("Price: " + car1.getPrice() + " $");
        System.out.println("Color: " + car1.getColor());
        System.out.println("Quantity: " + car1.getQuantity());

        car1.setColor("Blue");
        car1.setPrice(75999.99);
        car1.delivery(5);

        System.out.println("\nAfter changes:");
        System.out.println(car1.toString());
    }
}
