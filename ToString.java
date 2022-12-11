package ScalerJava;

public class ToString
{
    public static void main(String[] args) {
        Integer value =100;

        String obj = value.toString();
        //where we are converting an Integer to a String, and using the
        // length() method to calculate the length of the "string"
        Integer objj =Integer.valueOf("100",5);
        System.out.println("It is Using valueOf"+" "+objj);
        System.out.println("It is a conversion "+obj.length());
    }
}
