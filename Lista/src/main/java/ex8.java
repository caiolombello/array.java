import javax.swing.*;
import java.util.Arrays;

public class ex8 {
    public static void main(String[] args){
        double[] A = new double[20];
        double[] B = new double[20];
        double[] C = new double[20];

        for (int i = 0; i < 20; i ++){
            A[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite um número para o vetor A:"));
            B[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite um número para o vetor B:"));
            if ((i % 2) == 0) {
                C[i] = B[i];
            } else {
                C[i] = A[i];
            }
        }
        JOptionPane.showMessageDialog(null, String.format("Vetor A: %s\nVetor B: %s\nVetor C: %s", Arrays.toString(A), Arrays.toString(B), Arrays.toString(C)));
    }
}
