import java.util.Arrays;

public class TDArrays {
    public static void main(String[] args) {
        // int[][] grades = new int[3][4];
        // grades[0][0] = 72;
        // grades[0][1] = 74;
        // grades[0][2] = 78;
        // grades[0][3] = 76;
        // grades[1][0] = 65;
        // grades[1][1] = 64;
        // grades[1][2] = 61;
        // grades[1][3] = 67;
        // grades[2][0] = 95;
        // grades[2][1] = 98;
        // grades[2][2] = 99;
        // grades[2][3] = 100;

        int[][] grades = { {72, 74, 78, 76}, {65, 64, 61, 67}, {95, 98, 99, 100} }; 


        System.out.println("\t Harry: \t" + Arrays.toString(grades[0]));
        System.out.println("\t Ron: \t\t" + Arrays.toString(grades[1]));
        System.out.println("\t Hermione: \t" + Arrays.toString(grades[2]));
        System.out.println(Arrays.toString(grades[0]));

        for( int j = 0; j < grades[0].length; j++){
            System.out.println(grades[0][j]);
        }
        System.out.println(" ");

        for(int[] grade : grades){
            System.out.println(grade[0]);
        }
        System.out.println(" ");

        for( int i = 0; i < grades.length; i++){
            System.out.println(grades[i][0]);
        }
        System.out.println(" ");

        for( int i = 0; i < grades.length; i++){
            for( int j = 0; j < grades[i].length; j++){
                System.out.println(grades[i][j]);
            }
        }


    }
}
