import java.util.Scanner;
public class Reggie
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner pipe = new Scanner(System.in);
        String ssn = "";
        String menuChoice = "";
        String mNumber = "";

        ssn = SafeInput.getRegExString(pipe, "Please enter your SSN", "^\\\\d{3}-\\\\d{2}-\\\\d{4}$");
        System.out.println("You said your SSN is: "+ssn);

        menuChoice = SafeInput.getRegExString(pipe, "Please enter your choice[O,S,V,Q]", "[OoSsVvQq]");
        System.out.println("You entered: "+menuChoice + " as your choice.");

        mNumber = SafeInput.getRegExString(pipe, "Please enter your MNumber", "(M|m)\\\\d{5}");
        System.out.println("You entered "+mNumber +" as your MNumber.");


    }

}
