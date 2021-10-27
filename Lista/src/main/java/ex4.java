import javax.swing.*;

public class ex4 {
    public static void main(String[] args){
        double[] num = new double[20];
        int par = 0;

        for (int i = 0; i < 20; i++){
            num[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite um número:"));
            if ((num[i] %= 2) == 0){
                par += 1;
            }
        }
        JOptionPane.showMessageDialog(null, String.format("Dos números digitados, %d são pares.", par));
    }
}
