import javax.swing.*;
import java.util.Arrays;

public class ex12 {
    public static void main(String[] args){
        int[] nums = new int[14];
        int[] maiores = new int[14];

        for (int i = 0; i < 14; i++){
            nums[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
            if (nums[i] > 100){
                maiores[i] = nums[i];
            }
        }
        JOptionPane.showMessageDialog(null, String.format("Números maiores que 100 no vetor: %s", Arrays.toString(maiores)));
    }
}
