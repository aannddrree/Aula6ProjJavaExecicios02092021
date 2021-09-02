import javax.swing.*;

public class Ex2 {
    public static void main(String[] args) {
        int qtdTotalEleitores = Integer.parseInt(JOptionPane.showInputDialog(null,"Qtd. Eleitores"));
        int qtdVotoBranco = Integer.parseInt(JOptionPane.showInputDialog(null,"Qtd. Votos em Branco"));
        int qtdVotoNulo = Integer.parseInt(JOptionPane.showInputDialog(null,"Qtd. Votos Nulos"));
        int qtdVotoValido = Integer.parseInt(JOptionPane.showInputDialog(null,"Qtd. Votos Validos"));

        String output =
                "Porcentagem Votos em Branco: " + getPorcentagem(qtdVotoBranco,qtdTotalEleitores) +
                "\nPorcentagem Votos Nulos: " + getPorcentagem(qtdVotoNulo, qtdTotalEleitores) +
                "\nPorcentagem Votos Validos: " + getPorcentagem(qtdVotoValido, qtdTotalEleitores);

        JOptionPane.showMessageDialog(null,output);
    }
    private static double getPorcentagem(int qtd, int totalEleitores){
        return (qtd*100)/totalEleitores;
    }
}
