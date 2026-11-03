import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Latihan01 {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        ArrayList<ArrayList<Integer>> B = new ArrayList<>();

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

        String hasil = "Matriks A:\n" + tampil(A)
                + "\nMatriks B:\n" + tampil(B);
        JOptionPane.showMessageDialog(null, hasil,
                "Hasil Matriks", JOptionPane.INFORMATION_MESSAGE);
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