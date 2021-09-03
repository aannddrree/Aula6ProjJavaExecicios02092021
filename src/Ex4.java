import javax.swing.*;
import java.awt.*;

public class Ex4 {
    public static void main(String[] args) {
        double salarioFixo = Double.parseDouble(JOptionPane.showInputDialog(null, "Salario Fixo:"));
        double comissaoFixo = Double.parseDouble(JOptionPane.showInputDialog(null, "Comissão:"));
        int qtdCarros = Integer.parseInt(JOptionPane.showInputDialog(null,"Qtd. Carros:"));
        double valorTotalVendas = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor total das vendas:"));;
        JOptionPane.showMessageDialog(null, getSalarioTotal(salarioFixo, comissaoFixo, qtdCarros, valorTotalVendas));
    }

    private static double getSalarioTotal(double salarioFixo, double comissao, int qtdCarros, double valorTotal){
        return salarioFixo + (comissao * qtdCarros) + (valorTotal * 0.05);
    }
}
