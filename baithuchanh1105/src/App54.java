import java.util.HashSet;
import java.util.Scanner;
public class App54 {
    public class HashAdd {
        public static void main(String[] args){
            int number;
            HashSet<Integer> hashSetInteger = new HashSet<>();
            try (Scanner scanner = new Scanner(System.in)) {
                hashSetInteger.add(0);
                hashSetInteger.add(3);
                hashSetInteger.add(1);
                hashSetInteger.add(4);
                hashSetInteger.add(2);
                hashSetInteger.add(8);
                System.out.println("Các phần từ trong hashSetInteger: ");
                System.out.println(hashSetInteger);
                System.out.println("Nhập phần từ cần thêm: ");
                number = scanner.nextInt();
            }
            if (!hashSetInteger.contains(number)){
                hashSetInteger.add(number);
                System.out.println("Thên thành công!");
                System. out.println("Các phần từ trong hashSetInteger sau khi thêm: ");
                System.out.println(hashSetInteger);
             }else{
                System.out.println("Phần từ number đã tồn tại!");
        }
       
        }
    }
}
