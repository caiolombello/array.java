import javax.swing.*;

public class ex5 {
    public static void main(String[] args){
        double[] nums = new double[12];

        for (int i = 0; i < 12; i++){
            nums[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite um número:"));
        }
        int x = Integer.parseInt(JOptionPane.showInputDialog("Defina o valor de X:"));
        x = (int) nums[x];
        int y = Integer.parseInt(JOptionPane.showInputDialog("Defina o valor de Y:"));
        y = (int) nums[y];

        JOptionPane.showMessageDialog(null, String.format("A soma dos valores encontrados nas posições %d e %d resulta em %d", x, y, (x + y)));
    }
}
