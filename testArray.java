import java.util.*;
class testArray{
	public static void main (String[]args){
	Scanner sc = new Scanner (System.in);
	//deklarasi dan inisialisasi
	//int [] data = new int[5];
	int [] dataR = new int[5];
	double avg=0;
	int sum=0;
	
	//masukkan nilai masing2 array
	/*data [0]=100;
	data [1]=90;
	data [2]=80;
	data [3]=20;
	data [4]=10;*/
	
	for(int i=0; i<dataR.length;i++){
	dataR[i]=(int)(Math.random()*10.0);
	//System.out.print("cetak : " +data[1]);

		}
				System.out.println(" ");
				System.out.println("Menampilkan hasil bilangan random dalam array");
				System.out.println(" ");
	int min=dataR[0];
	int max=dataR[0];
			for (int j=0;j<dataR.length;j++){
				System.out.println("data random ke ["+j+"]=" +dataR[j]);
				sum+=dataR[j];
				if(min>dataR[j]){
					min=dataR[j];
				} 
				if(max<dataR[j]){
					max=dataR[j];
				}
				//avg=sum/(double)dataR[j];
			}
				avg=sum/(double)dataR.length;
				System.out.println(" ");
				System.out.println("Jumlah : " +sum);
				System.out.println("Maksimal : " +max);
				System.out.println("Minimal : " +min);
				System.out.println("Rata - rata : " +avg);
	}
}