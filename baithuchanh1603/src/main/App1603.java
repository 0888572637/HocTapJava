package main;
import shapes.Person;
import shapes.PhuongTrinhBac2;
import shapes.SinhVien;
public class App1603 {
  public static void  main(String args[]){
        Person ps = new Person();
        SinhVien sv = new SinhVien();
        PhuongTrinhBac2 ptb2 = new PhuongTrinhBac2();
        ps.NhapThongTin();
        ps.InThongTin();
        System.out.println();
        sv.NhapThongTin();
        sv.InThongTin();
        System.out.println();
        ptb2.NhapCacHeSo();
        ptb2.GiaiPhuongTrinh();
      }
}
