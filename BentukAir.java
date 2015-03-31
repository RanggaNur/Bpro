import java.util.*;
public class BentukAir {
  public static void main (String[]args){
   Scanner scn=new Scanner (System.in);
   System.out.println ("Masukkan Suhu Air (celcius) : ");
    int SuhuAir=scn.nextInt();
      if (SuhuAir>=100){
      System.out.println ("Air menjadi Gas");
      }
        if (SuhuAir<=0){
    System.out.println ("Air menjadi Padat");
       }
          if ((SuhuAir<100)&&(SuhuAir>0)){
      System.out.println ("Air menjadi Cair");
    }
  }
}