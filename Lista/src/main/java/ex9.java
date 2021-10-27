import javax.swing.*;
import java.util.Arrays;

public class ex9 {
    public static void main(String[] args){
        double[] nums = new double[40];
        double aux = 0;
        double num = 0;
        int i = 0;

        while (i < 40){
            i++;
            aux = num;
            if (i == 40){
                System.exit(0);
            }
            aux = Double.parseDouble(JOptionPane.showInputDialog("Digite um número:"));
            nums[i] = aux;
        }
        JOptionPane.showMessageDialog(null, String.format("Vetor: %s", Arrays.toString(nums)));
    }
}
