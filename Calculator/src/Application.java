public class Application {
    public static void main(String[] args){
        Television sonyTv;
        sonyTv = new Television();
        System.out.println("Model is : " + sonyTv.model);
        System.out.println("Price " + sonyTv.price);
        sonyTv.displayDetails();
        sonyTv.price = 50000;
        sonyTv.displayDetails();
    }

}
