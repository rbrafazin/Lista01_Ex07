import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o lado do quadrado: ");
        double l = sc.nextDouble();
        double a = Math.pow(l, 2);
        double da = a * 2;

        System.out.print("O dobro da área é " + da + "m²");

        sc.close();

    }

}
