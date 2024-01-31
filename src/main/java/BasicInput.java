import java.util.Scanner;

public class BasicInput {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter integer:");
        int Blankinteger = scnr.nextInt();


        System.out.println("Enter double:");
        double BlankDouble = scnr.nextDouble();

        System.out.println("Enter character:");
        char Blankcharacter = scnr.next().charAt(0);

        System.out.println("Enter string:");
        String Blankstring=scnr.next();

        System.out.println(Blankinteger+ " " + BlankDouble + " " + Blankcharacter + " " + Blankstring);

        ///Backwards now
        System.out.println(Blankstring + " " + Blankcharacter  + " " +  BlankDouble + " " + Blankinteger);

        //hi



        ///// Cast
        System.out.println(BlankDouble + " cast to an integer is"+(int)BlankDouble);

        // TODO (1): Finish reading other items into variables, then output the four values on a single line separated by a space

        // TODO (2): Output the four values in reverse

        // TODO (3): Cast the double to an integer, and output that integer

    }
}