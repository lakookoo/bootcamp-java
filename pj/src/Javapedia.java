import java.util.Scanner;

public class Javapedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n**********Javapedia**********");
        System.out.println("How many historical figures will you register?");
        int numOfFigures = scan.nextInt();
        scan.nextLine();
        String[][] db = new String[numOfFigures][3];

        for (int i = 0; i < db.length; i++) {

            System.out.println("\n\tFigure " + (i + 1));
            System.out.print("\t - Name: ");
            db[i][0] = scan.nextLine();
            System.out.print("\t - Date of birth: ");
            db[i][1] = scan.nextLine();
            System.out.print("\t - Occupation: ");
            db[i][2] = scan.nextLine();
            System.out.print("\n");

        }

        System.out.println("These are the values you stored:");
        print2DArray(db);

        System.out.print("\nWho do you want information on? ");

        String nameToFind = scan.nextLine();
        for (String[] figure : db) {
            if (figure[0].equals(nameToFind)) {
                System.out.println("\t - Name: " + figure[0]);
                System.out.println("\t - Date of birth: " + figure[1]);
                System.out.println("\t - Occupation: " + figure[2]);
                break;
            } 
                
        }
        System.out.println("The given name " + nameToFind + " is not in the data base");
        scan.close();
        }

public static void print2DArray(String[][] arr) {
        for(int i = 0; i < arr.length; i ++){
            System.out.println("\t");
            for(int j = 0; j < arr[i].length; j ++){
                System.out.println( arr[i][j] + " " );
            }
            System.out.println("\n");
        }
 }

}
