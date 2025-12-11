package thanhdaoIT;

import java.util.Scanner;

public class CacHamCoBan {
    public static void main(String[] args) {
        //SỐ LỚN VÀ BÉ
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Nhap so thu nhat: ");
        // int soThuNhat = scanner.nextInt();
        // System.out.print("Nhap so thu hai: ");
        // int soThuHai = scanner.nextInt();
        // System.out.println("So lon nhat la: " + Math.max(soThuNhat, soThuHai));
        // System.out.println("So nho nhat la: " + Math.min(soThuNhat, soThuHai));
        // scanner.close();

        //TONG
        // int a =10;
        // int b =3;
        // int c = Math.max(a, b);
        // int d = Math.min(a, b);
        // System.out.println("Giá trị lớn hơn là: " + c);
        // System.out.println("Giá trị nhỏ hơn là: " + d);

        //IN TEN VA DIEM
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Nhap ten sing vien: ");
        // String tenSV = scanner.nextLine();
        // System.out.print("Nhap diem trung binh: ");
        // double DTB = scanner.nextDouble();
        // System.out.println("Ten sinh vien la :" +tenSV ); 
        // System.out.println("Diem trung binh la :" +DTB );
        // scanner.close();

        //TINH CHU VI , DIEN TICH HCN, CANH NHO NHAT
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Nhap vao chieu dai cua hinh chu nhat");
        // double chieuDai = scanner.nextDouble();
        // System.out.print("Nhap vao chieu rong cua hinh chu nhat");
        // double chieuRong = scanner.nextDouble();
        // double chuVi = (chieuDai +chieuRong)*2;
        // double dienTich = chieuDai * chieuRong;
        // double canhNN = Math.min(chieuDai, chieuRong);
        // System.out.println("Chu vi hinh chu nhat la: " + chuVi);
        // System.out.println("Dien tich hinh chu nhat la: " + dienTich);
        // System.out.println("Canh nho nhat cua hinh chu nhat la: " + canhNN);
        // scanner.close();  
        
        //TINH THE TICH CUA HINH LAP PHUONG
        // Scanner scanner = new Scanner(System.in);
        // System.out.print ("Nhap do dai canh cua hinh :");
        // double canh = scanner . nextDouble ();
        // double theTich = Math.pow(3, canh);
        // System.out.println ("The tich cua hinh Lap Phuong la :"+theTich);
        // scanner.close();

        //BAI TAP VE IF ELSE
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Nhap vao danh thu cua cong ty: ");
        // double dThu = scanner.nextDouble();
        // double thue;
        // if (dThu < 10000000) {
        //     System.out.println("Cong ty ban khong phai dong thue.");
        // } else {
        //     if (dThu >= 10000000 && dThu <=15000000) {
        //         System.out.println("Cong ty ban phai dong thue 10%.");
        //         thue = dThu * 0.1;
        //         System.out.println("So tien thue phai dong la: " + thue);
        //     } else {
        //         if (dThu > 15000000 && dThu <= 30000000) {
        //             System.out.println("Cong ty ban phai dong thue 20%.");
        //              thue = dThu * 0.2;
        //             System.out.println("So tien thue phai dong la: " + thue);
        //         } else {
        //             System.out.println("Cong ty ban phai dong thue 30%.");
        //             thue = dThu * 0.3;
        //             System.out.println("So tien thue phai dong la: " + thue);
        //         }
                
        //     }
        // }
        // scanner.close();
        
        //BAI 1: ax+b =0
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Nhap he so a: ");
        // double a = scanner.nextDouble();
        // System.out.print("Nhap he so b: ");
        // double b = scanner.nextDouble();
        // if (a== 0 && b==0) {
        //     System.out.println("Phuong trinh vo so nghiem.");
        // } else if (a==0 && b!=0) {
        //     System.out.println("Phuong trinh vo nghiem.");
        // } else {
        //     double x = -b/a;
        //     System.out.println("Nghiem cua phuong trinh la: " + x);
            
        // }
        // scanner.close();

        //BAI 2: ax^2+bx+c =0
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Nhap he so a: ");
        // double a = scanner.nextDouble();
        // System.out.print("Nhap he so b: ");
        // double b = scanner.nextDouble();
        // System.out.print("Nhap he so c: ");
        // double c = scanner.nextDouble();
        // double delta = b*b - 4*a*c;
        // if (a==0) {
        //     if (b==0 && c==0) {
        //         System.out.println("Phuong trinh vo so nghiem.");
        //     } else if (b==0 && c!=0) {
        //         System.out.println("Phuong trinh vo nghiem.");
        //     } else {
        //         double x = -c/b;
        //         System.out.println("Nghiem cua phuong trinh la: " + x);
        //     }
        // } else {
        //     if (delta < 0){
        //         System.out.println("Phuong trinh vo nghiem.");
        //     } else if (delta == 0) {
        //         double x = -b/(2*a);
        //         System.out.println("Phuong trinh co nghiem kep: " + x);
        //     } else{
        //         double x1 = (-b + Math.sqrt(delta))/(2*a);
        //         double x2 = (-b - Math.sqrt(delta))/(2*a);
        //         System.out.println("Phuong trinh co 2 nghiem phan biet: ");
        //         System.out.println("x1 = " + x1);
        //         System.out.println("x2 = " + x2);
        //     }
                
        // }

        //BAI 3: Tinh so dien
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Nhap so dien tieu thu trong thang: ");
        // double soDien = scanner.nextDouble();
        // double tienDien;
        // if (soDien >0 && soDien <=100){
        //     tienDien = soDien *1000;
        //     System.out.println("So tien dien phai tra la: " + tienDien + " VND");
        // } else {
        //     tienDien = 100*1000 + (soDien -100)*1500;
        //     System.out.println("So tien dien phai tra la: " + tienDien + " VND");
        // }
        // scanner.close();

        //BAI4 : su dung SWITCH CASE
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // 1. Hiển thị Menu (Phần này sẽ lặp lại)
            System.out.println("\nMenu lua chon tinh nang:");
            System.out.println("++------------------------++");
            System.out.println("|1. Giai phuong trinh bac nhat");
            System.out.println("|2. Giai phuong trinh bac hai");
            System.out.println("|3. Tinh tien dien");
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

            // 2. Xử lý lựa chọn
            switch (choice) {
                case 1:
                    System.out.println("Ban da chon lua chon 1");
                    System.out.print("Nhap he so a: ");
                    double a = scanner.nextDouble();
                    System.out.print("Nhap he so b: ");
                    double b = scanner.nextDouble();
                    if (a == 0 && b == 0) {
                        System.out.println("Phuong trinh vo so nghiem.");
                    } else if (a == 0 && b != 0) {
                        System.out.println("Phuong trinh vo nghiem.");
                    } else {
                        double x = -b / a;
                        System.out.println("Nghiem cua phuong trinh la: " + x);
                    }
                    // ĐÃ XÓA: scanner.close();
                    break;
                case 2:
                    System.out.println("Ban da chon lua chon 2");
                    System.out.print("Nhap he so a: ");
                    double aa = scanner.nextDouble();
                    System.out.print("Nhap he so b: ");
                    double bb = scanner.nextDouble();
                    System.out.print("Nhap he so c: ");
                    double c = scanner.nextDouble();
                    double delta = bb * bb - 4 * aa * c;
                    
                    if (aa == 0) {
                        if (bb == 0 && c == 0) {
                            System.out.println("Phuong trinh vo so nghiem.");
                        } else if (bb == 0 && c != 0) {
                            System.out.println("Phuong trinh vo nghiem.");
                        } else {
                            double x = -c / bb;
                            System.out.println("Nghiem cua phuong trinh la: " + x);
                        }
                    } else {
                        if (delta < 0) {
                            System.out.println("Phuong trinh vo nghiem.");
                        } else if (delta == 0) {
                            double x_kep = -bb / (2 * aa);
                            System.out.println("Phuong trinh co nghiem kep: " + x_kep);
                        } else {
                            double x1 = (-bb + Math.sqrt(delta)) / (2 * aa);
                            double x2 = (-bb - Math.sqrt(delta)) / (2 * aa);
                            System.out.println("Phuong trinh co 2 nghiem phan biet: ");
                            System.out.println("x1 = " + x1);
                            System.out.println("x2 = " + x2);
                        }
                    }
                    // ĐÃ XÓA: scanner.close();
                    break;
                case 3:
                    System.out.println("Ban da chon lua chon 3");
                    System.out.print("Nhap so dien tieu thu trong thang: ");
                    double soDien = scanner.nextDouble();
                    double tienDien;
                    
                    if (soDien > 0 && soDien <= 100) {
                        tienDien = soDien * 1000;
                        System.out.println("So tien dien phai tra la: " + tienDien + " VND");
                    } else if (soDien > 100) {
                        tienDien = 100 * 1000 + (soDien - 100) * 1500;
                        System.out.println("So tien dien phai tra la: " + tienDien + " VND");
                    } else {
                        System.out.println("So dien khong hop le.");
                    }
                    // ĐÃ XÓA: scanner.close();
                    break;
                case 4:
                    System.out.println("Ket thuc chuong trinh. Tam biet!");
                    // Bỏ System.exit(0) để cho phép chạy đến scanner.close()
                    break;
                default:
                    System.out.println("Lua chon khong hop le");
                    break;
            }
        } while (choice != 4); // Lặp lại chừng nào người dùng chưa chọn 4

        // 3. Đóng Scanner MỘT LẦN ở cuối chương trình
        scanner.close();

    }
}


