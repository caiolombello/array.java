import javax.swing.*;
import java.util.Arrays;

public class ex10 {
    public static void main(String[] args){
        double[] nums = new double[10];
        double[] iguais = new double[0];

        for (int i = 0; i < 10; i++){
            nums[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite um número:"));
        }

        for (int j = 0; j < 10; j++){   // J percorre o vetor
            for (int k = 1; k < 10; k++){   // K percorre do segundo para o último
                if (nums[j] == nums[k]){    // se 0 for igual a 1.. se 1 for igual a 2..
                    iguais[k] = nums[j];  // iguais[0] = nums[0]
                }
            }
        }
        JOptionPane.showMessageDialog(null, String.format("Dos valores inseridos, os iguais são: %s", Arrays.toString(iguais)));
    }
}
