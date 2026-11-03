import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

public class Latihan04 {

    public static void main(String[] args) {
        ArrayList<ArrayList<String>> data = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            data.add(new ArrayList<>());

            String nama = JOptionPane.showInputDialog(null,
                    "Masukkan Nama Lengkap orang ke-" + (i + 1) + " :",
                    "Input Data", JOptionPane.QUESTION_MESSAGE);
            String alamat = JOptionPane.showInputDialog(null,
                    "Masukkan Alamat orang ke-" + (i + 1) + " :",
                    "Input Data", JOptionPane.QUESTION_MESSAGE);
            String telp = JOptionPane.showInputDialog(null,
                    "Masukkan No Telp orang ke-" + (i + 1) + " :",
                    "Input Data", JOptionPane.QUESTION_MESSAGE);

            data.get(i).add(nama);
            data.get(i).add(alamat);
            data.get(i).add(telp);
        }

        Collections.sort(data, (baris1, baris2)
                -> baris1.get(0).compareToIgnoreCase(baris2.get(0)));

        StringBuilder sb = new StringBuilder();
        sb.append("DATA TERURUT (Ascending berdasarkan Nama Lengkap)\n\n");
        for (ArrayList<String> baris : data) {
            sb.append("Nama Lengkap : ").append(baris.get(0)).append("\n");
            sb.append("Alamat : ").append(baris.get(1)).append("\n");
            sb.append("No Telp : ").append(baris.get(2)).append("\n\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString(),
                "Data Terurut", JOptionPane.INFORMATION_MESSAGE);
    }
}