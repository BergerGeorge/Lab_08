import java.util.Scanner;
public class CheckOut
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner pipe = new Scanner(System.in);
        double itemCost = 0;
        double totalCost = 0;
        do  {
            itemCost = SafeInput.getRangedDouble(pipe, "Enter the price of your item: ", .50, 9.99);
        }
        while (!SafeInput.getYNConfirm(pipe, "Are you done entering items?"));
        totalCost = itemCost;
        System.out.printf("\nThe total cost of your item(s) are: "+totalCost);


    }

}

