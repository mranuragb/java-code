package ScalerJava;

public class car
{
    String model="Hatchback";
    String color="Black";
    int price=1000000;
    void drive()
    {
        System.out.println("Driver drive a Car");
    }
    void lock()
    {
        System.out.println("Car are Lock ");
    }
    void unlock()
    {
        System.out.println("Car are Unlocked ");
    }
    int getPrice()
    {
        return price;
    }

    public void setPrice(int price)
    {
        if(price<0)
        {
            price=0;
        }
        this.price = price;
    }
}


