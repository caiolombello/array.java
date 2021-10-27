import javax.swing.*;

public class ex2 {
    public static void main(String[] args){
        double[] num = new double[15];
        int negativo = 0;

        for (int i = 0; i < 15; i++){
            num[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite um número:", i));
            if (num[i] < 0){
                negativo += 1;
            }
        }
        JOptionPane.showMessageDialog(null, String.format("%d elementos do vetor são negativos.", negativo));
    }
}