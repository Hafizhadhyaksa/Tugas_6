package Inheritance;

public class Manajer extends Pekerja{
    private int lamaKerja;
    private int totalManager;

    public Manajer(String nama, String nIK, boolean jenisKelamin, boolean menikah, int jamKerja, int hariKerja,
                   String nIP,int lamaKerja) {
        super(nama, nIK, jenisKelamin, menikah, jamKerja, hariKerja, nIP);
        this.setLamaKerja(lamaKerja);
        totalManager = totalManager + 1;

    }
    //getter
    public int getLamaKerja() {
        return lamaKerja;
    }

    public double getPendapatan(){
        return super.getPendapatan() + 15;
    }
    public int getTotalManager() {
        return totalManager;
    }
    //setter
    public void setTotalManager(int totalManager) {
        this.totalManager = totalManager;
    }
    public void setLamaKerja(int lamaKerja) {
        this.lamaKerja = lamaKerja;
    }

    public double hitungBonus(){
        return super.hitungBonus() + (0.3 * super.hitungBonus());
    }

    public String toString(){
        super.toString();
        System.out.println("Lama Kerja           :" + getLamaKerja() + " hari");


        return " ";

    }


}
