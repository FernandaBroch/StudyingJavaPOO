package exercises;

import java.util.Scanner;

public class Exercise03 {

    public static void main(String[] args) {
        //Read the piece code, number of pieces, unit value of each piece from 2 pieces and show the total to be paid

        Scanner sc = new Scanner(System.in);

        System.out.println("Código da peça: ");
        int code1 = sc.nextInt();
        System.out.println("Quantidade de peças: ");
        int quant1 = sc.nextInt();
        System.out.println("Valor unitário da peça: ");
        double unitValue1 = sc.nextDouble();

        System.out.println("Código da peça: ");
        int code2 = sc.nextInt();
        System.out.println("Quantidade de peças: ");
        int quant2 = sc.nextInt();
        System.out.println("Valor unitário da peça: ");
        double unitValue2 = sc.nextDouble();

        double totalPeca1 = quant1 * unitValue1;
        double totalPeca2 = quant2 * unitValue2;

        System.out.printf("Valor a pagar: %.2f%n", totalPeca1 + totalPeca2);


    }
}
