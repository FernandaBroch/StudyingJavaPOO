package exercises;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        //Read the circle's radius value and then show the circle area with 4 decimals

        final double PI = 3.14159;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do raio:");
        double radius = sc.nextDouble();

        double circle = radius * radius * PI;

        System.out.printf("Area do Circulo %.4f%n", circle);

        sc.close();
    }
}
