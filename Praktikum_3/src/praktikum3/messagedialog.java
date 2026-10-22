package praktikum3;

import javax.swing.JOptionPane;

public class messagedialog {
	public static void main(String[] args) {
		JOptionPane jop = new JOptionPane();
		
		jop.showMessageDialog(null, "KONTOL","MEMEK",jop.WARNING_MESSAGE);
		
		String nama = jop.showInputDialog(null, "Masukkan nama anda");
		jop.showMessageDialog(null, nama);
		
		int confirm = jop.showConfirmDialog(null, "apakah ini kelas pbo", "konfirmasi",jop.YES_NO_OPTION);
		
		if(confirm==1) {
			jop.showMessageDialog(null, "anda pilih no");
		}else {
			jop.showMessageDialog(null, "anda pilih yes");
		}
	}
}
