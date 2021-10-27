import javax.swing.*;

public class ex3 {
    public static void main(String[] args){
        double[] num = new double[13];
        int negativo = 0;
        int positivo = 0;

        for (int i = 0; i < 13; i++){
            num[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite um número:"));
            if (num[i] < 0){
                negativo += 1;
            } else positivo += 1;
        }
        JOptionPane.showMessageDialog(null, String.format("%d elementos do vetor são positivos.\n%d elementos do vetor são negativos.", positivo, negativo));
    }
}