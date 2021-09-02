import javax.swing.*;
public class Ex5 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null,"Nome:");
        double altura = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Altura: "));
        char sexo = JOptionPane.showInputDialog(null,
                "Sexo (M - Masculino / F - Feminino): ").charAt(0);

        String output = "Peso Ideal: " + calcularPesoIdeal(sexo, altura);
        JOptionPane.showMessageDialog(null, output);
    }
    private static double calcularPesoIdeal(char sexo, double altura){
        if (sexo == 'M'){
            return (72.7 * altura) - 58;
        }else if (sexo == 'F'){
            return (62.2 * altura) - 44.7;
        }
        return 0;
    }
}
