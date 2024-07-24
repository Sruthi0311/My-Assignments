public class Television {
    String model = "Sony some Model";
    int width;
    int height;
    float price;
    String color;
    boolean available;

    void displayDetails(){
        System.out.println(model);
        System.out.println("Te width of the TV is: " + width);
        System.out.println("Total price : " + (price + 5000));
        System.out.println(color);
        System.out.println(available);
    }
}
