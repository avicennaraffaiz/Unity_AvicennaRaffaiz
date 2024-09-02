package CS_KL_MAvicennaRaffaizAdiharsa_2206062844_OOP1;


public class Mahasiswa {
    private String nama;
    private int id;
    private class oop;
    private class jarkom;
    private class strukdis;
    private class rangkaianListrik;
    private Jurusan jurusan;
    
    public Mahasiswa(String nama, int id, class oop, class jarkom, 
    class rangkaianListrik, Jurusan jurusan) {
        this.nama = nama;
        this.id = id;
        this.oop = oop;
        this.jarkom = jarkom;
        this.strukdis = strukdis;
        this.rangkaianListrik = rangkaianListrik;
        this.jurusan = jurusan;
    }
    
    public float getIPK() {
        return ipk;
    }
    
    public void showDetail() {
        System.out.println("Nama: " + nama);
        System.out.println("ID: " + id);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("OOP: " + oop.getNama);
        System.out.println("Jarkom: " + jarkom.getNama);
        System.out.println("Strukdis: " + strukdis.getNama);
        System.out.println("RL: " + rangkaianListrik.getNama);
    }
}
