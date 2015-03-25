import java.util.*;
class perhitungan {
	public static void main (String[]args){
		Scanner sc=new Scanner (System.in);
		
		System.out.print("Masukkan Jumlah soal : ");
		
		int soal=sc.nextInt();
		
		int angka1;
		int a=0;
		int angka2;
		int hasil;
		int nilai=0;
		int jawabSalah=0;
		int jawabBenar=0;
		
			System.out.println ("");
			System.out.println ("SOAL !!");
			System.out.println ("");
			
		while(a<soal){
			
			angka1=(int)(Math.random()*20);
			angka2=(int)(Math.random()*10);
			
			System.out.print ((a+1)+" . "+ angka1 +" + " + angka2 + " = " ); 
			hasil=sc.nextInt();
			
			int jawaban=angka1+angka2;
				if(jawaban==hasil){
					//System.out.println ("Benar");
					nilai+=10;
					jawabBenar+=1;
				}else{
					//System.out.println ("Salah");
					jawabSalah+=1;
					nilai-=5;
				}
			a++;
		}
		System.out.println ("");
		System.out.println("Jawaban yang Benar : " + jawabBenar);
		System.out.println("Jawaban yang Salah : " + jawabSalah);
		System.out.println("Nilai Anda : " + nilai);
	}
}