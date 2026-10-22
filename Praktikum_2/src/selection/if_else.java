package selection;

import java.util.Scanner;

public class if_else {
	public static void main(String[] args) {
		int umur;
		Scanner input=new Scanner(System.in);
		
		System.out.println("Masukkan Umur anda");
		umur=input.nextInt();
		
		if(umur>17) {
			System.out.println("umur anda lebih dari 17");	
		}else {
			System.out.println("umur anda kurang dari 17");
		}
	}
}
