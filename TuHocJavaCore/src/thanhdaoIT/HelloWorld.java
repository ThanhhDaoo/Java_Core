package thanhdaoIT;

import java.util.Scanner;// CHO NHẬP

public class HelloWorld {
    public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
              System.out.print("Nhập tên của bạn: ");
              String ten = scanner.nextLine();//CHUỖI KÍ TỰ
              System.out.print("Nhập tuổi của bạn: ");
              int tuoi = scanner.nextInt(); // CHUỖI SỐ
              System.out.println("Tên của bạn là: " + ten);
              System.out.println("Tuổi của bạn là: " + tuoi);
              scanner.close();
    }
    // khai bao 1 biến và hiện ra tên và tuổi
}
