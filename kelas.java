package CS_KL_MAvicennaRaffaizAdiharsa_2206062844_OOP1;

public class kelas {
    private String namakelas;
    private float nilai;
    private int sks;
    private Dosen dosen;
    
    public Kelas(String namakelas, float nilai, int sks, Dosen dosen) {
        this.namakelas = namakelas;
        this.nilai = nilai;
        this.sks = sks;
        this.dosen = dosen;
    }
    
    public String getNamakelas(){
        return namakelas;
    }
    
    public void setNamakelas(String namakelas) {
        this.namakelas = namakelas;
    }
    
    public float getNilai() {
        return nilai;
    }
    
    public void setNilai(float nilai) {
        this.nilai = nilai;
    }
    
    public int getSks() {
        return sks;
    }
    
    public void setSks() {
        this.sks = sks;
    }
    
    public Dosen getDosen() {
        return dosen;
    }
    
    public void setDosen(Dosen dosen) {
        this.dosen = dosen;
    }
    
    public void showDetail() {
        System.out.println("Nama Kelas: " + namakelas);
        System.out.println("SKS: " + sks);
        System.out.println("Dosen: " + dosen);
    }
}
