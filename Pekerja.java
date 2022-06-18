package Inheritance;

public class Pekerja extends Manusia{
    private double gaji;
    private double bonus;
    private int jamKerja;
    private int hariKerja;
    private String NIP;
    private int totalPekerja;

    public Pekerja(String nama, String NIK, boolean jenisKelamin, boolean menikah,
                   int jamKerja, int hariKerja, String nip) {
        super(nama, NIK, jenisKelamin, menikah);
        this.jamKerja = jamKerja;
        this.hariKerja = hariKerja;
        NIP = nip;
        totalPekerja = totalPekerja + 1;

    }
//getter
    public double getGaji() {
        return gaji;
    }
    public double getBonus() {
        return bonus;
    }
    public int getTotalPekerja() {
        return totalPekerja;
    }
    public int getJamKerja() {
        return jamKerja;
    }
    public int getHariKerja() {
        return hariKerja;
    }
    public String getNIP() {
        return NIP;
    }
    public double getPendapatan() {
        return super.getPendapatan() + GajiNormal() + hitungBonus();
    }
    public String getStatus(){
        String a = getNIP();

        char digit_1 = a.charAt(0);
        String kantorCabang = "";
        if (digit_1 == '1'){
            kantorCabang = "Mondstadt";
        }else if (digit_1 == '2'){
            kantorCabang = "Liyue";
        }else if (digit_1 == '3'){
            kantorCabang = "Inazuma";
        }else if (digit_1 == '4'){
            kantorCabang = "Sumeru";
        }else if (digit_1 == '5'){
            kantorCabang = "Fontaine";
        }else if (digit_1 == '6'){
            kantorCabang = "Natlan";
        }else if (digit_1 == '7'){
            kantorCabang = "Snezhnaya";
        }else {
            kantorCabang = " ";
        }
        switch (digit_1){
            case 1:
                kantorCabang="Mondstadt";
                break;
            case 2:
                kantorCabang = "Liyue";
                break;
            case 3: 
                kantorCabang = "Inazuma";
                break;
            case 4:
                kantorCabang = "Sumeru";
                break;
            case 5:
                kantorCabang = "Fontaine";
                break;
            case 6:
                kantorCabang = "Natlan";
                break;
            case 7:
                kantorCabang = "Snezhnaya";
                break;
            default:
                break;
        }
        
        char digit_3 = a.charAt(2);
        char noCabang = digit_3;

        char digit_7 = a.charAt(6);

        String departemen;
        if (digit_7 == '1'){
            departemen = "Pemasaran";
        }else if (digit_7 == '2'){
            departemen = "Humas";
        }else if (digit_7 == '3'){
            departemen = "Riset";
        }else if (digit_7 == '4'){
            departemen = "Teknologi";
        }else if (digit_7 == '5'){
            departemen = "Personalia";
        }else if (digit_7 == '6'){
            departemen = "Akademik";
        }else if (digit_7 == '7'){
            departemen = "Administrasi";
        }else if (digit_7 == '8'){
            departemen = "Operasional";
        }else if (digit_7 == '9'){
            departemen = "Pembangunan";
        }else {
            departemen = " ";
        }

        return departemen + "," + kantorCabang + " " + "cabang ke-" + noCabang;

    }

//setter
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void setTotalPekerja(int totalPekerja) {
        this.totalPekerja = totalPekerja;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public void setHariKerja(int hariKerja) {
        this.hariKerja = hariKerja;
    }

    public void setNIP(String nIP) {
        NIP = nIP;
    }
    public double GajiNormal(){
        double gajiNormal;

        return gajiNormal = getHariKerja() * getJamKerja() * 15;
    }

    public double hitungBonus() {
        double bonus;
        double hariLibur = 0;

        for (int i = 1; i <= getHariKerja(); i++) {
            if (i % 7 == 0) {
                hariLibur = hariLibur + 2;
            }
        }
        double bonusLibur = getJamKerja() * hariLibur * 20;

        double bonusLembur = (getJamKerja() - 7) * (getHariKerja() - hariLibur) * 7;

        return bonus = bonusLembur + bonusLibur;

    }


    public String toString(){
        super.toString();
        System.out.println("Bonus                :" + hitungBonus() + "$");
        System.out.println("Gaji                 :" + GajiNormal() + "$");
        System.out.println("Status               :" + getStatus());


        return " ";
    }

}

