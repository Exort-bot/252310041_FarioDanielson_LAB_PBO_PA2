import javax.swing.JOptionPane;

public class Latihan03 {

    public static void main(String[] args) {
        // 1. Tentukan jumlah array
        int jumlah = Integer.parseInt(
            JOptionPane.showInputDialog(null, "Masukan jumlah array:",
                "Input", JOptionPane.QUESTION_MESSAGE));

        // 2. Buat array sesuai jumlah
        int[] nilai = new int[jumlah];

        // 3. Isi array lewat dialog
        for (int i = 0; i < nilai.length; i++) {
            nilai[i] = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Masukan angka:",
                    "Data array ke-" + i, JOptionPane.QUESTION_MESSAGE));
        }

        // 4. Susun teks output
        String hasil = "";
        for (int i = 0; i < nilai.length; i++) {
            hasil += "x[" + i + "]=" + nilai[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, hasil,
            "Output Array", JOptionPane.INFORMATION_MESSAGE);
    }
}