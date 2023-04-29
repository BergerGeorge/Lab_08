import java.util.Scanner;
public class BirthDateTime
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner pipe = new Scanner(System.in);
        int birthMonth = 0;
        int birthYear = 0;
        int birthDay = 0;
        int birthHours = 0;
        int birthMinutes = 0;

        birthMonth = SafeInput.getRangedInt(pipe, "Enter your birth month", 1, 12);
        System.out.println("Your birth month is: "+birthMonth);
        birthYear = SafeInput.getRangedInt(pipe, "Enter your birthyear: ", 1950, 2015);
        System.out.println("Your birth year is: "+birthYear);
        birthDay = SafeInput.getRangedInt(pipe, "Enter your birthday: ", 1, 30);
        System.out.println("Your birthday is: "+birthDay);
        birthHours = SafeInput.getRangedInt(pipe, "Enter what hour you were born at: ", 1, 24);
        System.out.println("The hour you were born at is: "+birthHours);
        birthMinutes = SafeInput.getRangedInt(pipe, "Enter what minute you were born at: ", 1, 60);
        System.out.println("The minute you were born at is: "+birthMinutes);

    }

}
