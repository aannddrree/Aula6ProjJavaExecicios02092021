import javax.swing.*;

public class Ex3 {
    public static void main(String[] args) {
        double custoFabrica = Double.parseDouble(JOptionPane.showInputDialog(null,"Custo de Fabrica: "));
        JOptionPane.showMessageDialog(null, "Total com imposto: " + calcular(custoFabrica));
    }

    private static double calcular(double custoFabrica){
        return custoFabrica * 1.73;
    }
}
