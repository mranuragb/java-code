package ScalerJava;

public class Console
{
    public static void main(String[] args) {
        String n;
        java.io.Console c =System.console();
        n=c.readLine();
        System.out.println("Print the Console "+n);
    }
}
