import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Ex1DIFF {

    public static void main(String[] args) {
        String dataAniversario = "01/10/1989";
        //String dataAniversario = JOptionPane.showInputDialog(null, "Data de Anivesário: ");
        System.out.println("Qtd. de dias: " + getQtdDias(dataAniversario));
    }

    private static long getQtdDias(String dataAniversario){
        //Pegar a Data de Hoje
        DateTimeFormatter data = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        String dataHoje = data.format(now);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        try {
            Date dtAniversario = sdf.parse(dataAniversario);
            Date hoje = sdf.parse(dataHoje);
            //Date hoje = sdf.parse("51515/55454");
            long diferenca = Math.abs(hoje.getTime() - dtAniversario.getTime());
            long qtdDias = TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS);
            return  qtdDias;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
