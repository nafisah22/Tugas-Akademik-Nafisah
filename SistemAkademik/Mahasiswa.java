public class Mahasiswa {
    private String nim; private String nama;
    private double tugas,uts,uas,kehadiran;
    public Mahasiswa(String n,String nm,double t,double u,double ua,double h){
        nim=n; nama=nm; tugas=t; uts=u; uas=ua; kehadiran=h;
    }
    public double hitungNilaiAkhir(){return (0.3*tugas)+(0.3*uts)+(0.4*uas);}
    public String getGrade(){
        double x=hitungNilaiAkhir();
        if(x>=85) return "A"; else if(x>=75) return "B";
        else if(x>=65) return "C"; else if(x>=50) return "D"; else return "E";
    }
    public String getPredikat(){
        switch(getGrade()){
            case "A": return "Sangat Baik";
            case "B": return "Baik"; case "C": return "Cukup";
            case "D": return "Kurang"; default: return "Gagal";
        }
    }
    public String getStatusKelulusan(){
        double x=hitungNilaiAkhir();
        if(x>=60){ if(kehadiran>=75) return "LULUS"; else return "TIDAK LULUS (Kehadiran < 75%)"; }
        else if(x>=50) return "REMEDIAL"; else return "TIDAK LULUS";
    }
    public String getPenghargaan(){
        if(hitungNilaiAkhir()>=90 && kehadiran>=90) return "Penghargaan: Mahasiswa Berprestasi"; return "-";
    }
    public void tampilkanData(){
        System.out.println("\n===== DATA MAHASISWA =====");
        System.out.println("NIM : "+nim); System.out.println("Nama : "+nama);
        System.out.println("Tugas : "+tugas); System.out.println("UTS : "+uts);
        System.out.println("UAS : "+uas); System.out.println("Kehadiran : "+kehadiran+"%");
    }
}