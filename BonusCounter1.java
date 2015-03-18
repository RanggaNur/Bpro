import java.io.*;
public class BonusCounter1{ 
  public static void main(String[] args) throws IOException
  {
  BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
     int JumlahBarang;
	 int kembalian;
	 
       
	   System.out.println("======================================");
	   System.out.println("-------------TOKO BAJU----------------");
	   System.out.println("======================================");
	   System.out.print("Jumlah Barang : ");
	   JumlahBarang=Integer.parseInt(br.readLine());
	   int JumlahBonus= JumlahBarang/2;
	   int TotalItem= JumlahBarang + JumlahBonus;
		int harga=25000*JumlahBarang;
       System.out.println("Jumlah Bonus  : " + JumlahBonus);
       System.out.println("Total Harga  : Rp " + harga);
       System.out.print("Bayar  : Rp ");
	   int bayar=Integer.parseInt(br.readLine());
	   kembalian =(bayar-harga);
	   System.out.println("Kembalian : Rp " + kembalian);
       System.out.println("Total Item yang dibawa pulang : " + TotalItem);
  }
}
