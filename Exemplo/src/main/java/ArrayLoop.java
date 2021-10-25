import java.util.Scanner;

public class ArrayLoop {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double soma = 0;

        System.out.println("Quantas notas deseja inserir? ");
        int qtd = input.nextInt();

        double[] notas = new double[qtd];   
        for(int i = 0; i < qtd; i++){
            System.out.println("Digite uma nota: ");
            notas[i] = input.nextDouble();
            soma += notas[i];
        }

        double media = soma / qtd;
        System.out.printf("Sua média é de: %.1f", media);
    }
}
