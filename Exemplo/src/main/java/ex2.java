// 2. Altere o programa anterior de modo que ele exiba também a quantidade de números digitados que são iguais à 100;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double[] nums = new double[10];
        int maior = 0;
        int igual = 0;

        for(int i = 0; i < 10; i++){
            System.out.println("Digite um número: ");
            nums[i] = teclado.nextInt();

            if (nums[i] > 100){
                maior += 1;
            }
            else if (nums[i] == 100){
                igual += 1;
            }
        }
        System.out.printf("Dos números digitados:\nMaiores que 100 são: %d\nIguais a 100 são: %d", maior, igual);
    }
}
