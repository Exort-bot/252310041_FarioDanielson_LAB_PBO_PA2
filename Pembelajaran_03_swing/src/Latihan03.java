import javax.swing.JOptionPane;

public class Latihan03 {

    public static void main(String[] args) {
        String fullname;
        String usiaStr;
        String alamat;

        while (true) {
            fullname = JOptionPane.showInputDialog(null, "Masukkan fullname:");
            if (fullname == null || fullname.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null,
                        "Field fullname tidak boleh kosong",
                        "Error", JOptionPane.ERROR_MESSAGE);
                continue;
            }
            break;
        }


        while (true) {
            usiaStr = JOptionPane.showInputDialog(null, "Masukkan usia:");
            if (usiaStr == null || usiaStr.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null,
                        "Field usia tidak boleh kosong",
                        "Error", JOptionPane.ERROR_MESSAGE);
                continue;
            }
            if (!usiaStr.trim().matches("\\d+")) {
                JOptionPane.showMessageDialog(null,
                        "Isian usia harus angka",
                        "Error", JOptionPane.ERROR_MESSAGE);
                continue;
            }
            break;
        }

        while (true) {
            alamat = JOptionPane.showInputDialog(null, "Masukkan alamat:");
            if (alamat == null || alamat.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null,
                        "Field alamat tidak boleh kosong",
                        "Error", JOptionPane.ERROR_MESSAGE);
                continue;
            }
            if (alamat.trim().length() < 10) {
                JOptionPane.showMessageDialog(null,
                        "Masukan alamat minimum 10 karakter",
                        "Warning", JOptionPane.WARNING_MESSAGE);
                continue;
            }
            break;
        }

        Biodata2 bio = new Biodata2();
        bio.simpanBiodata(fullname.trim(), Integer.parseInt(usiaStr.trim()), alamat.trim());

        JOptionPane.showMessageDialog(null,
                "Fullname : " + bio.getFullname() + "\n"
              + "Usia     : " + bio.getUsia() + "\n"
              + "Alamat   : " + bio.getAlamat(),
                "Informasi Biodata", JOptionPane.INFORMATION_MESSAGE);
    }
}