import javax.swing.JOptionPane;

public class Latihan02 {

    public static void main(String[] args) {
        String fullname = JOptionPane.showInputDialog(null, "Masukkan nama lengkap:");
        String usiaStr  = JOptionPane.showInputDialog(null, "Masukkan usia:");
        String alamat   = JOptionPane.showInputDialog(null, "Masukkan email:");

        int usia = Integer.parseInt(usiaStr);

        Biodata2 bio = new Biodata2();
        bio.simpanBiodata(fullname, usia, alamat);

        JOptionPane.showMessageDialog(null,
                "Fullname : " + bio.getFullname() + "\n"
              + "Usia     : " + bio.getUsia() + "\n"
              + "Alamat   : " + bio.getAlamat());
    }
}