import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Üs hesabı yapmak istediğiniz sayıyı giriniz: ");
		int taban = scanner.nextInt();
		
		System.out.print("Kuvveti giriniz: ");
		int kuvvet = scanner.nextInt();
		
		int carpim = 1;
		
		for(int i = 1; i<=kuvvet; i++) {
			
			carpim *= taban;
			
		}
		
		System.out.println(taban +" sayısının " + kuvvet +". kuvveti = " + carpim );
	}

}
