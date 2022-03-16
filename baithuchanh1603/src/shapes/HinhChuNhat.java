package shapes;
import java.io.PrintStream;
import java.util.Scanner;

public class HinhChuNhat {
     private static final PrintStream OUT = System.out;
    float dai;
     float rong;
     float cv;
     float dt;

     public void nhapChieuDai(){
         OUT.println("Hãy nhập vào Chiều dài Hình Chữ Nhật : ");
         Scanner sc = new Scanner(System.in);
         dai = sc.nextFloat();
     }

     public void nhapChieuRong(){
         OUT.println("Hãy nhập vào chiều rộng Hình Chữ Nhật : ");
         Scanner sc = new Scanner(System.in);
         rong = sc.nextFloat();
     }

     public void tinhChuVi(){
         cv = 2 * (dai + rong);
     }
     public void tinhDienTich(){
         dt = dai * rong;
     }

     public void inChuVi(){
         OUT.println("Chu vi Hình chữ Nhật : " + cv);
     }

     public void inDienTich(){
         OUTDienTich(){
         System.out.println("Diện tích Hình Chữ Nhật : " + dt);
     }
}

