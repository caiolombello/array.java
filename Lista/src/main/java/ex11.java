import javax.swing.*;

public class ex11 {
    public static void main(String[] args){
        int qtdVotadores = 10;
        int[] voto = new int[qtdVotadores];
        double x = 0;
        double y = 0;
        double z = 0;

        for (int i = 0; i < 10; i++){
            voto[i] = Integer.parseInt(JOptionPane.showInputDialog("VOTE:\n34 - Candidato X\n20 - Candidato Y\n65 - Candidato Z"));
            if (voto[i] == 34){
                x++;
            } else if (voto[i] == 20){
                y++;
            } else if (voto[i] == 65){
                z++;
            } else {
                JOptionPane.showMessageDialog(null, "[ERRO] Não existe um candidato com este número!\nDigite novamente.");
                i--;
            }
        }
        double porcentoX = (x / 10) * 100;
        double porcentoY = (y / 10) * 100;
        double porcentoZ = (z / 10) * 100;
        if ((x > y) && (x > z)) {
            JOptionPane.showMessageDialog(null, String.format("RESULTADOS:\n34 - Candidato X: %.0f (%.1f%%) (GANHOU)\n20 - Candidato Y: %.0f (%.1f%%)\n65 - Candidato Z: %.0f (%.1f%%)", x, porcentoX, y, porcentoY, z, porcentoZ));
        } else if ((y > x) && (y > z)){
            JOptionPane.showMessageDialog(null, String.format("RESULTADOS:\n34 - Candidato X: %.0f (%.1f%%)\n20 - Candidato Y: %.0f (%.1f%%) (GANHOU)\n65 - Candidato Z: %.0f (%.1f%%)", x, porcentoX, y, porcentoY, z, porcentoZ));
        } else if ((z > x) && (z > y)) {
            JOptionPane.showMessageDialog(null, String.format("RESULTADOS:\n34 - Candidato X: %.0f (%.1f%%)\n20 - Candidato Y: %.0f (%.1f%%)\n65 - Candidato Z: %.0f (%.1f%%) (GANHOU)", x, porcentoX, y, porcentoY, z, porcentoZ));
        }
    }
}

