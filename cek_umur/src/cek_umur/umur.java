package cek_umur;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class umur {
	public static void main(String[] args) {
		
		JOptionPane jop = new JOptionPane();
		
		jop.showMessageDialog(null, "Cek umur");
		
		String input = jop.showInputDialog(null, "Masukkan umur anda");
		
		int umur = Integer.parseInt(input);
		
		if(umur>=17) {
		jop.showMessageDialog(null, "umur anda di atas 17");
	
		}else {
			jop.showMessageDialog(null, "anda tidak cukup umur");
		}
	}
	
}
