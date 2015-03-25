import java.util.*;
class kali{
	public static void main (String[]args){
	Scanner sc = new Scanner (System.in);
	int bil1;
	int bil2;
			System.out.println("===========================");
			System.out.println("       Perkalian  		");
			System.out.println("===========================");
			System.out.print("Masukkan Bilangan 1 : ");
			bil1=sc.nextInt();
			System.out.print("Masukkan Bilangan 2 : ");
			bil2=sc.nextInt();
			
			System.out.println("===========================");
			System.out.print("Hasil : " + bil1 + " x " + bil2 + " = ");
		for (int a=0; a<bil1; a++) 
		{
					System.out.print(bil2+"+");
		}
		System.out.print("\b= " + bil1*bil2);
		
	}
}