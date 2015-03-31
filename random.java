import java.util.*;
class random{
	public static void main (String[]args){
		Scanner sc = new Scanner (System.in);
		
		int i=0;
		int total=0;
		int bilRandom=0;
		
		System.out.print("Massukkan Jumlah Bil Random : ");
		int a=sc.nextInt();
		while (i<a){
			bilRandom=(int)(Math.random()*10.0);
			System.out.println ((i+1)+"="+bilRandom);
			total +=bilRandom;
			i++;
			}
			System.out.println("Total : "+total);
	}
}