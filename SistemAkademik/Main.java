import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n--- Input Data Mahasiswa ---");
        System.out.print("NIM : "); String nim=input.nextLine();
        System.out.print("Nama : "); String nama=input.nextLine();
        System.out.print("Nilai Tugas (0-100) : "); double tugas=input.nextDouble();
        System.out.print("Nilai UTS (0-100) : "); double uts=input.nextDouble();
        System.out.print("Nilai UAS (0-100) : "); double uas=input.nextDouble();
        System.out.print("Kehadiran % (0-100) : "); double hadir=input.nextDouble();
        
        Mahasiswa mhs = new Mahasiswa(nim,nama,tugas,uts,uas,hadir);
        System.out.println("\n===== HASIL =====");
        mhs.tampilkanData();
        System.out.println("Nilai Akhir : "+mhs.hitungNilaiAkhir());
        System.out.println("Grade : "+mhs.getGrade());
        System.out.println("Predikat : "+mhs.getPredikat());
        System.out.println("Status : "+mhs.getStatusKelulusan());
        System.out.println(mhs.getPenghargaan());
        System.out.println("\nLULUS BUK NAFISAH! Tugas Selesai!");
        input.close();
    }
}