package HyperSkills;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Read an integer from the input
        String integerStr = reader.readLine();
        int integer;
        try {
            integer = Integer.parseInt(integerStr);
        } catch (Exception e) {
            System.out.println("Invalid input!");
            return;
        }
        

        // Read a string from the input
        String string = reader.readLine();
        if (integer > 0) {
            for (int i = 0; i <= integer; i++ ) {
                System.out.println(string);
            }
        } else if (integer == 0) {
            System.out.println(string);
        }
        // } 
        // else {
        //     System.out.println("Invalid input!");
        // }

    }
}