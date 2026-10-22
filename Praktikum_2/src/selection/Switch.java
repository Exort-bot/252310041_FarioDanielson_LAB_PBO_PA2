package selection;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("masukkan warna");
		String warna=input.nextLine();
		
		switch(warna) {
			case "red":{
				System.out.println("warna yang anda pilih merah");
				break;
			}
			case"blue":{
				System.out.println("warna yang anda pilih biru");
				break;
			}
			default: System.out.println("warna anda bukan biru dan merah");
		}
	}
}
