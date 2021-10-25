// 3. Declare um vetor com 10 posições.
// Deve ser solicitado que o usuário digite 10 números. O programa deve exibir QUAIS números digitados são superiores à 100.

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double[] nums = new double[10];
        StringBuilder maior = new StringBuilder();

        for(int i = 0; i < 10; i++){
            System.out.println("Digite um número: ");
            nums[i] = teclado.nextInt();

            if (nums[i] > 100){
                maior.append(nums[i]).append("\n");
            }
        }
        System.out.printf("Dos números digitados, os maiores que 100 são: %s", maior);
    }
}
