import javax.swing.*;

public class ex7 {
    public static void main(String[] args){
        double[] nums = new double[20];

        for(int i = 0; i < 20; i++){
            nums[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite um número:"));
        }
        int x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de X:"));

        for(int j = 0; j < 20; j++){
            if(x == nums[j]){
                JOptionPane.showMessageDialog(null, String.format("O valor de X (%d) foi encontrado em nums[%d].", x, j));
                j = 19;
            }
            else if (j == 19) {
                JOptionPane.showMessageDialog(null, String.format("O valor de X (%d) não foi encontrado no vetor de nums.", x));
            }
        }
    }
}
