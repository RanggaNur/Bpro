public class Beli2Gratis1{ //bonuscounter
  public static void main(String[] args)
  {
     int JumlahBarang = 40;
     int JumlahBonus= JumlahBarang/2;
     int TotalItem= JumlahBarang + JumlahBonus;
	 int harga=25000*JumlahBarang;
	 
       System.out.println("Jumlah Barang : " + JumlahBarang);
       System.out.println("Jumlah Bonus  : " + JumlahBonus);
       System.out.println("Total Bayar  : Rp " + harga);
       System.out.println("Total Item yang dibawa pulang : " + TotalItem);
  }
}
