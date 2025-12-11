package OOP;

public class ObjectOfSV {
    public static void main(String[] args) {
        Sinhvien sv1 = new Sinhvien();
        sv1.name = "Tran Thanh Dao";
        sv1.age = 20;
        sv1.maSV = 2208;

        System.out.println("Sinh vien 1: ");
        System.out.println("Name: " + sv1.name);
        System.out.println("Age: " + sv1.age);
        System.out.println("Ma SV: " + sv1.maSV);

    }

}
