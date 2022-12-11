package ScalerJava;

public class Main
{
    public static void main(String[] args) {
        car c=new car();
        c.color="Blue";
        System.out.println("color is "+c.color);
        c.drive();
        c.unlock();
        System.out.println("Model is "+c.model);
        //c.price=1000000;
        System.out.println("Price is "+c.getPrice());
        c.getPrice();
        c.setPrice(3000000);
        System.out.println("Price is "+c.getPrice());

    }
}
