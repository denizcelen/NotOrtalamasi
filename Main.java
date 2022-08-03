import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);

    System.out.print("Matematik notunu giriniz: ");
    int mat= scanner.nextInt();

    System.out.print("Fizik notunu giriniz: ");
    int fiz= scanner.nextInt();

    System.out.print("Kimya notunu giriniz: ");
    int kim=scanner.nextInt();

    System.out.print("Türkçe notunu giriniz: ");
    int tur= scanner.nextInt();

    System.out.print("Tarih notunu giriniz: ");
    int tar= scanner.nextInt();

    System.out.print("Müzik notunu giriniz: ");
    int muz= scanner.nextInt();

    double  ort=((mat+fiz+kim+tur+tar+muz)/6);
    System.out.println("Not ortalamanız: "+ ort);
    boolean pass=(ort>=60);
        System.out.println(pass ? "Sınfı geçtiniz" : "Sınıfta kaldınız");
    }

    }

