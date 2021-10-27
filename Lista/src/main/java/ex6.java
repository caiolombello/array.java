import javax.swing.*;

public class ex6 {
    public static void main(String[] args){
        double[] nums = new double[16];
        StringBuilder vetor = new StringBuilder();

        for (int i = 0; i < 16; i++){
            nums[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite um número:"));
        }

        for (int k = 0; k < 8; k++){
            double aux = nums[k];
            nums[k] = nums[k+8];
            nums[k+8] = aux;
        }

        for (int j = 0; j < 16; j++){
            vetor.append(String.format("nums[%d] = %s\n", j, nums[j]));
        }
        JOptionPane.showMessageDialog(null, vetor.toString());
    }
}
