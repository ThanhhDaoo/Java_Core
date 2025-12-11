package thanhdaoIT;

import java.util.Arrays;
import java.util.Scanner;

public class Arr {
   
    public static void main(String[] args) {
     // Sắp xếp mảng theo thứ tự tăng dần
    //     // Khai báo mảng
    //     int[] a = {15, 22, 8, 19, 31};
    //     int i , j, temp;
    //     for (i =0; i< a.length -1; i++) {
    //         for (j =i+1; j < a.length; j++) {
    //             if (a[i] > a[j]) {
    //                 // Hoán đổi giá trị
    //                 temp = a[i];
    //                 a[i] = a[j];
    //                 a[j] = temp;
    //             }
    //         }
    //     }
    //     System.out.println(Arrays.toString(a));
    // }

    //Sap xep mang theo thu tu giam dan
    //  public static void main(String[] args) {
    //     // Khai báo mảng
    //     int[] a = {15, 22, 8, 19, 31};
    //     int i , j, temp;
    //     for (i =0; i< a.length -1; i++) {
    //         for (j =i+1; j < a.length; j++) {
    //             if (a[i] < a[j]) {
    //                 // Hoán đổi giá trị
    //                 temp = a[i];
    //                 a[i] = a[j];
    //                 a[j] = temp;
    //             }
    //         }
    //     }
    //     System.out.println(Arrays.toString(a));
    // }
    // Kiem tra so nguyen to
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Nhap so can kiem tra: ");
        // int a = scanner.nextInt();
        // int i;
        // if (a <2)
        //     System.out.print(" khong hop le");
        // for (i=2 ; i< a; i++) {
        //     if (a% i ==0)
        //         System.out.print(a + " khong phai la so nguyen to");
        //         break;
        // }
        // if (i == a) {
        //     System.out.print(a + " la so nguyen to");
        // }

    //Bang cuu chuong
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Nhap so can in bang cuu chuong: ");
        // int a = scanner.nextInt();
        // for (int i =1; i <=10; i++) {
        //     System.out.println(a+ "x" + i + " =" + a*i);;   
        // }
        // scanner.close();
    

    // Nhap 1 mang bat ky
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = scanner.nextInt();
        int [] a = new int[n];
        int i,j, temp, min, max, choice;
        // cho nhap gia tri cho cac phan tu trong mang
        for ( i = 0; i < n; i++) {
            System.out.print("Nhap a[" + i + "]: ");
            a[i] = scanner.nextInt();
        }
        do {
            System.out.println("\nMenu lua chon tinh nang:");
            System.out.println("++------------------------++");
            System.out.println("|1. Sap xep va xuat ra mang vua sap xep");
            System.out.println("|2. Xuat ra phan tu nho nhat trong mang");
            System.out.println("|3. Xuat ra phan tu lon nhat trong mang");
            System.out.println("|4. Ket thuc");
            System.out.println("++------------------------++");
            System.out.print("Nhap vao lua chon cua ban: ");
            // Xử lý đầu vào
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                System.out.println("Lua chon khong hop le. Vui long nhap mot so (1-4).");
                scanner.next(); 
                choice = 0;     // Gán giá trị để đảm bảo lặp lại
                continue;
            }
            switch (choice) {
                case 1:
                    for (i =0; i<a.length -1; i++) {
                        for (j =i+1; j<a.length; j++) {
                            if (a[i] > a[j]) {
                                // Hoán đổi giá trị
                                temp = a[i];
                                a[i] = a[j];
                                a[j] = temp;
                            }
                        }
                    }
                    System.out.println(Arrays.toString(a));
                    break;
                case 2:
                    min = a[0];
                    for (i =1; i< a.length; i++){
                        if (a[i]< min) {
                            min = a[i];
                        }
                    }
                    System.out.println("Phan tu nho nhat trong mang la: " + min);
                    break;
                case 3:
                    max = a[0];
                    for (i =1; i< a.length; i++){
                        if (a[i]> max) {
                            max = a[i];
                        }
                    }
                    System.out.println("Phan tu lon nhat trong mang la: " + max);
                    break;
                default:
                    System.out.println("Lua chon khong hop le");
                    break;
            }
         } while (choice != 4); // Lặp lại chừng nào người dùng chưa chọn 4

        // 3. Đóng Scanner MỘT LẦN ở cuối chương trình
        scanner.close();
         // có thể sử dụng math.min và math.max de tim min va max của mảng
         // for (i=1; i< a.length; i++) {
         //     min = Math.min(min, a[i]);
        //     max = Math.max(max, a[i]);
        //  }
        //  System.out.println("Phan tu nho nhat trong mang la: " + min);
        //  System.out.println("Phan tu lon nhat trong mang la: " +
    }
}