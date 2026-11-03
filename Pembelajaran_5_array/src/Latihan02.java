import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Latihan02 {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        ArrayList<ArrayList<Integer>> B = new ArrayList<>();
        ArrayList<ArrayList<Integer>> C = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            A.add(new ArrayList<>());
            for (int j = 0; j < 2; j++) {
                String input = JOptionPane.showInputDialog(null,
                        "Masukkan nilai Matriks A[" + i + "][" + j + "] :",
                        "Input Matriks A", JOptionPane.QUESTION_MESSAGE);
                A.get(i).add(Integer.parseInt(input));
            }
        }

        for (int i = 0; i < 2; i++) {
            B.add(new ArrayList<>());
            for (int j = 0; j < 2; j++) {
                String input = JOptionPane.showInputDialog(null,
                        "Masukkan nilai Matriks B[" + i + "][" + j + "] :",
                        "Input Matriks B", JOptionPane.QUESTION_MESSAGE);
                B.get(i).add(Integer.parseInt(input));
            }
        }

        for (int i = 0; i < 2; i++) {
            C.add(new ArrayList<>());
            for (int j = 0; j < 2; j++) {
                int jumlah = 0;
                for (int k = 0; k < 2; k++) {
                    jumlah += A.get(i).get(k) * B.get(k).get(j);
                }
                C.get(i).add(jumlah);
            }
        }

        String hasil = "Matriks A:\n" + tampil(A)
                + "\nMatriks B:\n" + tampil(B)
                + "\nMatriks C = A x B:\n" + tampil(C);
        JOptionPane.showMessageDialog(null, hasil,
                "Hasil Perkalian Matriks", JOptionPane.INFORMATION_MESSAGE);
    }

    static String tampil(ArrayList<ArrayList<Integer>> m) {
        StringBuilder sb = new StringBuilder();
        for (ArrayList<Integer> baris : m) {
            for (int nilai : baris) {
                sb.append(nilai).append("    ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}