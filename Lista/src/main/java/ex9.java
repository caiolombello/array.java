import javax.swing.*;
import java.util.Arrays;

public class ex9 {
    public static void main(String[] args){
        double[] nums = new double[10];
        double num = 0;

        for(int i = 1; i < 10; i++){
            nums[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite um número:"));
            for(int j = 0; j < 10; j += 2){
                nums[i] = num;
            }
        }
        JOptionPane.showMessageDialog(null, String.format("Vetor: %s", Arrays.toString(nums)));
    }
}
