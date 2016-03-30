package Praktikum;
import java.util.Scanner;
public class Data {
    
   private String nama, alamat, notelp, email;
   private String[][] tabel = new String[4][2];
   
   public Data(){
       nama = "";
       alamat = "";
       notelp = "";
       email = "";
   }
    
   private void setAll(String nama, String alamat, String notelp, String email) {
     this.nama = nama;
     this.alamat = alamat;
     this.notelp = notelp;
     this.email = email;
   }
   
   public String getNama(){
       return nama;
   }
   
   public String getAlamat(){
       return alamat;
   }
   
   public String getNo(){
       return notelp;
   }
   
   public String getEmail(){
       return email;
   }
   
   public void input() {
       Scanner input = new Scanner(System.in);
       
       System.out.println("                        DATA MAHASISWA");
       System.out.print("Masukan nama           = ");
       String n = input.nextLine();
       System.out.print("Masukan alamat         = ");
       String l = input.nextLine();
       System.out.print("Masukan nomer telepon  = ");
       String t = input.nextLine();
       System.out.print("Masukan email          = ");
       String e = input.nextLine();
       
       setAll(n, l, t, e);
   }
   
   public void tabel() {
       tabel[0][0]   = "NAMA";
       tabel[1][0]   = "ALAMAT";
       tabel[2][0]   = "NOMER TELEPON";
       tabel[3][0]   = "EMAIL";
       tabel[0][1]   = getNama();
       tabel[1][1]   = getAlamat();
       tabel[2][1]   = getNo();
       tabel[3][1]   = getEmail();
       
       for (int a = 0; a < 4; a++) {
            System.err.printf("%15s %10s %5s\n", tabel[a][0], "||", tabel[a][1]);
        }
    }
   
}