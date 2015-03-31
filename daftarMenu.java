import java.util.*;
import java.text.DateFormat;
import java.util.Date;
public class daftarMenu{
	public static void main (String[]args){
		Scanner sc=new Scanner(System.in);
		
		Date tgl = new Date();
		//System.out.println(DateFormat.getInstance().format(tgl));
		
		String[]menu={"Soto Ayam","Gado-gado","Nasi Goreng","Nasi Campur","Mie Ayam"};
		int[]harga={10000,8000,12000,10000,7000};
		String nota="";
		int subtotal=0;
		int total=0;
		int bayar=0;
		int kembalian=0;
		System.out.println();
		System.out.println("\"Daftar Menu Makanan\"");
		System.out.println();
		System.out.println("Makanan \t\tHarga");
		System.out.println();
		
		for(int i=0; i<menu.length;i++){
			System.out.println((i+1) + "." + menu[i]+"\t\t"+harga[i]);
		}
		String jawab="y";
		while(jawab.equalsIgnoreCase("y")){
			System.out.println();
				System.out.print("Masukkan pilihan : ");
				int pilih=sc.nextInt();
				System.out.println();
				System.out.println(menu[pilih-1]);
				System.out.println();
				
				System.out.print("Masukkan Jumlah Pesanan : ");
				int a=sc.nextInt();
				System.out.println("Harga : "+harga[pilih-1]);
				subtotal=harga[pilih-1]*a;
				System.out.println("Bayar : "+subtotal);
				System.out.println();
				
				nota+=menu[pilih-1]+"\t\t"+a+" Porsi\t\t"+harga[pilih-1]+"\t\t"+subtotal+"\n-----------------------------------------------------------------\n";
				total+=subtotal;
				System.out.println("Pesan lagi?[Y/N]");
				jawab=sc.next();	
				System.out.println();
		}
				
				System.out.println("\t\t\t\t\t\t"+DateFormat.getInstance().format(tgl));
				System.out.println("=================================================================");
				System.out.println("\t\t\t\tNota");
				System.out.println("=================================================================");
				System.out.println("MENU \t\t\tJUMLAH \t\t HARGA \t\t SUBTOTAL");
				System.out.println("-----------------------------------------------------------------");
				System.out.println(nota);
				System.out.println("=================================================================");
				System.out.println("Total bayar : "+total);
				System.out.print("Bayar : ");
				bayar=sc.nextInt();
				kembalian=(bayar-total);
				System.out.println("=================================================================");
				System.out.println("Kembalian : "+kembalian);
				System.out.println("THANKS");
		
	}
}