package Kelompok;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class LAUNDRY {
    public static void main(String[] args) {
    boolean bool = true;
    String a,b;
    int pilihanUser ;
    int cash, kembalian;
    int pilihan1;
    int pilihan2;
    int berat;
    int total=0;

   
    Queue<String> namapelanggan = new LinkedList<>();
    Stack<String> baju1 = new Stack<String>(); 

    String [] kategori = {"Biasa","Express"};
    String [] jenis = {"Cuci","Gosok","Cuci Gosok"};
    int [][] harga = {{3000,3000,6000},{5000,5000,12000}};
    
    Scanner pilih =new Scanner(System.in);

    
    
    System.out.println(" ======================================");
    System.out.println("            SELAMAT DATANG             ");
    System.out.println(" ===================================== ");
    System.out.println("-----------LAUNDRY BERSAMA------------");
    System.out.println(" =====================================");
    System.out.println();
    System.out.println("--------------Kategori------------ ");
    System.out.println("\t 1. Biasa ");
    System.out.println("\t 2. Express ");
    System.out.println();
    System.out.println("--------------jenis---------------- ");
    System.out.println("\t 1. cuci ");
    System.out.println("\t 2. gosok ");
    System.out.println("\t 3. cuci gosok ");
    System.out.println(" =====================================");
    System.out.println();
    

    do{
        System.out.println(" 1. Laundry");
        System.out.println(" 2. Pengambilan");
        System.out.println(" 3. Proses pencucian");
        System.out.println(" 4. cek antrian");
        System.out.println(" =====================================");
        System.out.print("MASUKAN PILIHAN [1-5]: ");
        pilihanUser =pilih.nextInt();

    if (pilihanUser==1){
    System.out.print(" Masukkan Nama pelanggan: ");
    a=pilih.next();
    namapelanggan.add(a);
    System.out.print(" Masukkan tumpukan: ");
    b=pilih.next();
    baju1.push(b);
    System.out.println();
    System.out.print("Silahkan pilih kategori:  "); 
    pilihan1=pilih.nextInt();
      switch (pilihan1) {
          case 1:
              System.out.println("kategori : "+kategori[0]);
              break;
              case 2:
              System.out.println("kategori : "+kategori[1]);
              break;
      }
        System.out.print("Silahkan pilih jenis:  "); 
        pilihan2=pilih.nextInt();
        switch (pilihan2) {
            case 1:
            System.out.println("jenis : "+jenis[0]);
            break;
            case 2:
            System.out.println("jenis : "+jenis[1]);
            break;
            case 3:
            System.out.println("jenis : "+jenis[2]);
            break;
        }

        System.out.print("masukkan berat:  "); 
        berat=pilih.nextInt();

        if (pilihan1==1 && pilihan2==1){
            total= harga[0][0]*berat;
            System.out.print("harga:  "+total);
            System.out.println();
        }
        else if (pilihan1==1 && pilihan2==2){
            total= harga[0][1]*berat;
            System.out.print("harga:  "+total);
            System.out.println();
        }
        else if (pilihan1==1 && pilihan2==3){
            total= harga[0][2]*berat;
            System.out.print("harga:  "+total);
            System.out.println();
        }
        else if (pilihan1==2 && pilihan2==1){
            total= harga[1][0]*berat;
            System.out.print("harga:  "+total);
            System.out.println();
        }
        else if (pilihan1==2 && pilihan2==2){
            total= harga[1][1]*berat;
            System.out.print("harga:  "+total);
            System.out.println();
        }
        else if (pilihan1==2 && pilihan2==3){
            total= harga[1][2]*berat;
            System.out.print("harga:  "+total);
            System.out.println();
            System.out.print("");
        }
        System.out.print(" Total harga : Rp. "+total);
        System.out.println("");
        System.out.print(" Cash : Rp. ");
        cash=pilih.nextInt();

        kembalian = cash - total;
       System.out.println("Kembalian : Rp. "+kembalian);
       System.out.println("");  
        
    }
    else if (pilihanUser==2){
        System.out.print("Masukkan nama pengambilan : ");
        a=pilih.next();
        namapelanggan.remove();
        System.out.println("Antrian: "+namapelanggan);
        System.out.println("");

    }
    else if (pilihanUser==3){
    baju1.pop();
    System.out.println("Stack: "+baju1);
    System.out.println(""); 
    }
    else if (pilihanUser==4){
    System.out.print(" Cek antrian :  "+namapelanggan.isEmpty());
    System.out.println(" antrian : "+namapelanggan);
    System.out.println();
    }

    }
        while (bool);

}
}
