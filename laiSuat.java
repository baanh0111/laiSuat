import java.util.Scanner;

public class laiSuat {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so tien: ");
        double tien = scanner.nextDouble();

        System.out.println("Nhap lai suat (%): ");
        double laiSuat = scanner.nextDouble();

        System.out.println("Nhap so thang: ");

        int thang = scanner.nextInt();

        double tongSotien = 0;
        for (int i = 0 ; i < thang; i++){
            tongSotien += tien * (laiSuat / 100 ) /12 * thang;

        }
        System.out.println("Tong so tien sau " + thang + " thang la: " + tongSotien);

    }
}
