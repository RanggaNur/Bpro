public class BonusCounter{ 
  public static void main(String[] args)
  {
     int JumlahBarang = 27;
     int JumlahBonus= JumlahBarang/2;
     int TotalItem= JumlahBarang + JumlahBonus;
	 int harga=25000*JumlahBarang;
	 
       
	   System.out.println("======================================");
	   System.out.println("-------------TOKO BAJU----------------");
	   System.out.println("======================================");
	   System.out.println("Jumlah Barang : " + JumlahBarang);
       System.out.println("Jumlah Bonus  : " + JumlahBonus);
       System.out.println("Total Bayar  : Rp " + harga);
       System.out.println("Total Item yang dibawa pulang : " + TotalItem);
  }
}
