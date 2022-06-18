package Inheritance;

public class MahasiswaFilkom extends Manusia{
    private String NIM;
    private double IPK;
    private int totalMahasiswaFilkom;

    public MahasiswaFilkom(String nama, String nik, boolean jenisKelamin, boolean menikah, String nim, double ipk) {
        super(nama, nik, jenisKelamin, menikah);
        NIM = nim;
        IPK = ipk;
        totalMahasiswaFilkom = totalMahasiswaFilkom + 1;
    }

//getter
    public int getTotalMahasiswaFilkom() {
        return totalMahasiswaFilkom;
    }
    public String getNIM() {
        return NIM;
    }
    public double getIPK() {
        return IPK;
    }
    public String getStatus(){
        String a = getNIM();
        String b = a.substring(0,  2);
        String angkatan;

        if (b.equalsIgnoreCase("18")){
            angkatan = "2018";
        }else if (b.equalsIgnoreCase("19")){
            angkatan = "2019";
        } else if (b.equalsIgnoreCase("20")){
            angkatan = "2020";
        }else if (b.equalsIgnoreCase("21")){
            angkatan = "2021";
        }else {
            angkatan = "0";
        }

        char indeks;
        indeks = a.charAt(6);
        int index = (int) a.charAt(6) - 48;
        String prodi= "";


        switch (indeks){
            case 2:
                prodi = "Teknik Meniup Gelembung";
                break;
            case 3:
                prodi = "Teknik Berburu Ubur-Ubur";
                break;
            case 4:
                prodi = "Sistem Penghaburgeran";
                break;
            case 6:
                prodi = "Pendidikan Chum Bucket";
                break;
            case 7:
                prodi = "Teknologi Telepon Kerang";
                break;
            default:
                break;
        }
        if (indeks == '2'){
            prodi = "Teknik Meniup Gelembung";
        } else if (indeks == '3'){
            prodi = "Teknik Berburu Ubur-Ubur";
        } else if (indeks == '4'){
            prodi = "Sistem Penghaburgeran";
        }else if (indeks == '6'){
            prodi = "Pendidikan Chum Bucket";
        }else if (indeks == '7'){
            prodi = "Teknologi Telepon Kerang";
        }else {
            prodi = "tes";
        }

        return prodi + "," + angkatan;
    }
    public double getBeasiswa(){
        double beasiswa;
        if (getIPK() > 3.0 && getIPK() <= 3.5){
            beasiswa = 50;
        }else if (getIPK() > 3.5 && getIPK() <= 4){
            beasiswa = 75;
        } else {
            beasiswa = 0;
        }

        return beasiswa;
    }
    public double getPendapatan(){
        return super.getPendapatan() + getBeasiswa();
    }


//setter
    public void setTotalMahasiswaFilkom(int totalMahasiswaFilkom) {
        this.totalMahasiswaFilkom = totalMahasiswaFilkom;
    }

    public void setNIM(String nIM) {
        NIM = nIM;
    }

    public void setIPK(double iPK) {
        IPK = iPK;
    }

    public String toString(){
        super.toString();
        System.out.println("IPK                  :" + getIPK());
        System.out.println("NIM                  :" + getNIM());
        System.out.println("Status               :" + getStatus());


        return "";
    }


}
