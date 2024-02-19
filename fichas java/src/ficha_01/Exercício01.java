package ficha_01;

 import java.util.Scanner;

public class Exercício01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n1, n2, soma;

        System.out.println("Introduza um número:");
        n1 = input.nextInt();
        System.out.println("Introduza outro número");
        n2 = input.nextInt();

        soma = (n1+n2);

        System.out.println("Soma: " + soma);

    }
}
