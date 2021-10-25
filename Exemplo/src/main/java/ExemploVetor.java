import java.util.Scanner;

public class ExemploVetor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double notas[] = new double[4];
        double media;

        System.out.println("Digite a primeira nota: ");
        notas[0] = teclado.nextDouble();
        System.out.println("Digite a segunda nota: ");
        notas[1] = teclado.nextDouble();
        System.out.println("Digite a terceira nota: ");
        notas[2] = teclado.nextDouble();
        System.out.println("Digite a quarta nota: ");
        notas[3] = teclado.nextDouble();

        media = (notas[0] + notas[1] + notas[2] + notas[3]) / 4;
        System.out.printf("Sua média é: %.1f", media);

    }
}
