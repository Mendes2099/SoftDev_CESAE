import java.util.Scanner;

public class Exercício08 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int minMusica1, minMusica2, minMusica3, segMusica1, segMusica2, segMusica3, totalHoras, totalMinutos, totalSegundos, finalMinutos, finalSegundos;

        System.out.println("Introduza minutos da música 1");
        minMusica1 = input.nextInt();

        System.out.println("Introduza segundos da música 1");
        segMusica1 = input.nextInt();

        System.out.println("Introduza minutos da música 2");
        minMusica2 = input.nextInt();

        System.out.println("Introduza segundos da música 2");
        segMusica2 = input.nextInt();

        System.out.println("Introduza minutos da música 3");
        minMusica3 = input.nextInt();

        System.out.println("Introduza segundos da música 3");
        segMusica3 = input.nextInt();

        totalMinutos = (minMusica1+minMusica2+minMusica3);

        totalSegundos = (segMusica1+segMusica2+segMusica3);

        totalHoras = (totalMinutos/60);
        System.out.print(totalHoras+"h");

        finalMinutos = (totalMinutos/60)+(totalMinutos%60);
        System.out.print(finalMinutos+"m");

        finalSegundos = (totalSegundos/60)+(totalSegundos%60);
        System.out.print(finalSegundos+"s");




    }
}
