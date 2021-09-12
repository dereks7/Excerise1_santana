import java.util.Scanner;

public class Ex1_santana
{
    public static void main( String[] args )
    {
        System.out.println( "What is your name?" );
        Scanner in = new Scanner(System.in);
        String firstname = in.nextLine();
        System.out.println("Hello, "+firstname+", nice to meet you!");
    }
}
