import java.io.*;
public class TebakAngka{
 public static void main(String[] argx) throws IOException 
 {
  BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
 
  int TebakanAngka = (int)(Math.random()*10);
  int Angka ;
  
  System.out.println("..........................");
  System.out.println(" ");
  System.out.println("       GAMES TEBAK BILANGAN DARI 1 - 10     ");
  System.out.println("  Masukkan Angka JANGAN MELEBIHI 1 - 10 ");
  System.out.println(" ");
  System.out.println("..........................");
  System.out.print("Inputkan Angka : ");
  
  Angka = Integer.parseInt(br.readLine());
  
  if (TebakanAngka == Angka){
    System.out.println("Tebakan Benar");
  }
  else{
    System.out.println("Tebakan Salah");
  }
 }
}