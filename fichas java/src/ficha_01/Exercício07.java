package ficha_01;

import java.util.Scanner;

public class Exercício07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double preço1, preço2, preço3, desconto;

        System.out.println("Introduza preço 1");
        preço1= input.nextInt();

        System.out.println("Introduza preço 2");
        preço2= input.nextInt();

        System.out.println("Introduza preço 3");
        preço3= input.nextInt();

        desconto = ((preço1+preço2+preço3)*0.10);
        System.out.println("Desconto 10%: " + desconto);
        System.out.println("Valor a pagar: " + ((preço1+preço2+preço3)-desconto));


    }
}
