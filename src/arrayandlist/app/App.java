package arrayandlist.app;

import arrayandlist.entities.Rent;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Rent[] vect = new Rent[10];

        System.out.print("How many rooms will be rented? ");

        int qtd = sc.nextInt();

        for(int i=0; i < qtd; i++){
            System.out.printf("Rent #%d:%n", i+1);
            System.out.print("Nome:");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email:");
            String email = sc.nextLine();
            System.out.print("Room:");
            int room = sc.nextInt();

            vect[room] = new Rent(name, email);

        }
        System.out.println("Busy rooms: ");
        for (int i=0;i<10;i++){
            if(vect[i]!= null){
                System.out.println(i+": "+vect[i].toString());
            }
        }

        sc.close();
    }

}
