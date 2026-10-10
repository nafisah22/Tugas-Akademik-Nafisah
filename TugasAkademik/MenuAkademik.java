import java.util.Scanner;

public class MenuAkademik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n============================");
            System.out.println("       MENU AKADEMIK");
            System.out.println("============================");
            System.out.println("1. Input Nilai Mahasiswa");
            System.out.println("2. Tampilkan Bilangan Genap");
            System.out.println("3. Hitung Faktorial");
            System.out.println("4. Tampilkan Pola Bintang");
            System.out.println("5. Keluar");
            System.out.println("============================");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nilai (0-100): ");
                    int nilai = input.nextInt();
                    if (nilai >= 85) {
                        System.out.println("Grade A - LULUS");
                    } else if (nilai >= 70) {
                        System.out.println("Grade B - LULUS");
                    } else if (nilai >= 60) {
                        System.out.println("Grade C - LULUS");
                    } else if (nilai >= 50) {
                        System.out.println("Grade D - TIDAK LULUS");
                    } else {
                        System.out.println("Grade E - TIDAK LULUS");
                    }
                    break;
                case 2:
                    System.out.print("Sampai berapa? : ");
                    int batas = input.nextInt();
                    for (int i = 2; i <= batas; i += 2) {
                        System.out.print(i + " ");
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Masukkan angka: ");
                    int angka = input.nextInt();
                    long faktorial = 1;
                    int j = 1;
                    while (j <= angka) {
                        faktorial *= j;
                        j++;
                    }
                    System.out.println(angka + "! = " + faktorial);
                    break;
                case 4:
                    System.out.print("Masukkan tinggi pola: ");
                    int tinggi = input.nextInt();
                    for (int i = 1; i <= tinggi; i++) {
                        for (int k = 1; k <= i; k++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.println("Terima kasih! Selesai.");
                    break;
                default:
                    System.out.println("Menu salah!");
            }
        } while (pilihan != 5);
        input.close();
    }
}