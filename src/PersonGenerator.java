import java.util.ArrayList;
import java.util.Scanner;

public class PersonGenerator {
    public static void main(String[] args){
        boolean done = false;
        String ID = "";
        String title = "";
        String firstName = "";
        String lastName = "";
        String recCSV = "";
        int YOB = 0;
        ArrayList<String> people = new ArrayList<>();

        Scanner in = new Scanner(System.in);

        do{
            ID = SafeInput.getNonZeroLenString(in, "Enter ID [000001]");
            title = SafeInput.getNonZeroLenString(in, "Enter your title");
            firstName = SafeInput.getNonZeroLenString(in, "Enter your first name");
            lastName = SafeInput.getNonZeroLenString(in, "Enter your last name");
            YOB = SafeInput.getRangedInt(in, "Enter your year of birth", 1000, 9999);

            recCSV = ID + ", " + title + ", " + firstName + ", " + lastName + ", " +  ", " + YOB;

            System.out.println(recCSV);

            people.add(recCSV);

            done = SafeInput.getYNConfirm(in, "Are you done?");

        }while(!done);

    }
}
