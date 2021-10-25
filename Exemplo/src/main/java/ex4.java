// 4. Declare um vetor com 6 posições. Solicite que o usuário digite 6 números.
// Solicite que o usuário digite um numero a ser pesquisado no vetor.
// Seu programa deverá informar quantas vezes aquele número aparece no vetor. Exemplo:
// Digite um número: 8
// Digite um número: 13
// Digite um número: 56
// Digite um número: 43
// Digite um número: 8
// Digite um número: 90
// Digite o número à ser pesquisado: 8
// *** O número aparece 2 vezes no vetor ***

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double[] nums = new double[6];
        int qtd = 0;

        for(int i = 0; i < 6; i++){
            System.out.println("Digite um número: ");
            nums[i] = teclado.nextInt();
        }

        System.out.println("Pesquise um número: "); // TODO: Barra de loading (Threading)
        int search = teclado.nextInt();

        for(int j = 0; j < 6; j++){
            if(search == nums[j]){
                qtd += 1;
            }
        }

        System.out.printf("*** O número %d aparece %d vezes no vetor ***", search, qtd);
    }
}
