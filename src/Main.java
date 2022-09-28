import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the temperature in celsius: ");
    float cels=sc.nextFloat();
    float fahrenheit=(cels*9/5)+32;
    System.out.println("The fahrenheit value is: "+fahrenheit);
    }
}