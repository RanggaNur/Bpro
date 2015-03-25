import java.io.*;
	public class TebakGambar{
		public static void main (String[]args)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
			int bil = (int) (Math.random()+0.5);
			int angka;
			
				System.out.print("Masukkan Tebakan Anda (0/1) : ");
				angka=Integer.parseInt(br.readLine());
				if(bil==1)
					System.out.println("Gambar");
				else
					System.out.println("Angka");
				
				
					System.out.println("Angka Tebakan Anda : " + angka);
					System.out.println("Angka Tebakan Komputer : " + bil);
					
					if(angka==bil){
					 System.out.print("Anda Menang");
					}else {
						System.out.print("Anda Kalah");
					}
		}
	}