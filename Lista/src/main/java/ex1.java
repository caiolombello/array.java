import javax.swing.*;

public class ex1 {
    public static void main(String[] args){
        double[] impar = new double[10];
        int imparCount = 0;

        for(int i = 0; i < 10; i++){
            impar[i] = i;
            if ((impar[i] %= 2) == 1){
                imparCount += 1;
            }
        }
        JOptionPane.showMessageDialog(null, String.format("Dos 10 primeiros números, %d são impares.", imparCount));
    }
}
