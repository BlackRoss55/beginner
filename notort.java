import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Matematik notunu giriniz");
        int mat = sc1.nextInt();
        System.out.println("Kimya notunu giriniz");
        int kim = sc1.nextInt();
        System.out.println("Fizik notunu giriniz");
        int fiz = sc1.nextInt();
        System.out.println("Türkçe notunu giriniz");
        int tur = sc1.nextInt();
        System.out.println("Tarih notunu giriniz");
        int tar = sc1.nextInt();
        System.out.println("Müzik notunu giriniz");
        int muz = sc1.nextInt();

        double toplam = (mat + kim + fiz + tur + tar+ muz)/6;

        System.out.println("Öğrenci not ortalaması: " + toplam);

        if(toplam >= 60) {
            System.out.println("Öğrenci sınıfı geçti");

        }
        else {
            System.out.println("Öğrenci sınıfta kaldı");
        }
    }
}
