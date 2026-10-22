import javax.swing.JOptionPane;

public class Latihan04 {

    private static boolean konfirmasiKeluar() {
        int pilihan = JOptionPane.showConfirmDialog(null,
                "Apakah anda ingin keluar ?",
                "Konfirmasi",
                JOptionPane.YES_NO_OPTION);
        return pilihan == JOptionPane.YES_OPTION;
    }

    private static String inputDialog(String pesan) {
        while (true) {
            String hasil = JOptionPane.showInputDialog(null, pesan);
            if (hasil == null) {
                if (konfirmasiKeluar()) {
                    System.exit(0);
                }
                continue;
            }
            return hasil;
        }
    }

    public static void main(String[] args) {

        while (true) {

            String fullname;
            String usiaStr;
            String alamat;

            while (true) {
                fullname = inputDialog("Masukkan fullname:");
                if (fullname.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null,
                            "Field fullname tidak boleh kosong",
                            "Error", JOptionPane.ERROR_MESSAGE);
                    continue;
                }
                break;
            }

            while (true) {
                usiaStr = inputDialog("Masukkan usia:");
                if (usiaStr.trim().isEmpty()) {
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
                alamat = inputDialog("Masukkan alamat:");
                if (alamat.trim().isEmpty()) {
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

            if (konfirmasiKeluar()) {
                System.exit(0);
            }
        }
    }
}