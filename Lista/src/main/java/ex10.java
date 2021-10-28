import java.util.Arrays;
import java.util.Scanner;

public class ex10 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double[] nums = new double[10];
        double[] iguais = new double[10];
        StringBuilder valores = new StringBuilder();

        for (int i = 0; i < 10; i++){
            System.out.println("Digite um número: ");
            nums[i] = teclado.nextDouble();
        }

        for (int j = 0; j < 10; j++){
            for (int k = 1; k < 10; k++){
                if ((nums[j] == nums[k]) && (j != k)){
                    iguais[k] = nums[j];
                    valores.append(Arrays.toString(new double[]{iguais[k]})).append(", ");
                }
            }
        }
        System.out.println("Os valores iguais são: " + valores);
    }
}
