
import java.util.Scanner;

public class FavNumbers
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner pipe = new Scanner(System.in);
        int favNumber = 0;
        double favDouble = 0;

        favNumber = SafeInput.getInt(pipe, "Enter your favorite integer");
        System.out.println("Your favorite number is: "+favNumber);
        favDouble = SafeInput.getDouble(pipe, "\nEnter your favorite double");
        System.out.println("Your favorite double is: "+favDouble);



    }

}

