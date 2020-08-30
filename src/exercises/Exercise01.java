package exercises;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        //Read 2 integer and show the the sum on the screen
        Scanner sc = new Scanner(System.in);

        System.out.println("Write the first integer:");
        int fst = sc.nextInt();
        System.out.println("Write the second integer:");
        int snd = sc.nextInt();

        System.out.println(fst + snd);

        sc.close();

    }

}
