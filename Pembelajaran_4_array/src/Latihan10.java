import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Latihan10 {

    public static void main(String[] args) {
        String field[] = {"Nama Lengkap", "Alamat", "No Telp"};
        ArrayList<String> data = new ArrayList<String>();

        for (int i = 0; i < field.length; i++) {
            String isi = JOptionPane.showInputDialog(null,
                "Masukan " + field[i] + ":",
                "Data array ke-" + i, JOptionPane.QUESTION_MESSAGE);
            data.add(isi);
        }

        String hasil = "";
        for (int i = 0; i < data.size(); i++) {
            hasil += field[i] + ": " + data.get(i) + "\n";
        }

        JOptionPane.showMessageDialog(null, hasil);
    }
}