package Inheritance;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("NAMA\t\t\t: Muhammad Hafizh Adhyaksa");
        System.out.println("NIM\t\t\t\t: 215150707111019");
        System.out.println("Kelas\t\t\t: TI-E\n");

        Scanner scan = new Scanner(System.in);
        Manusia manusia1 = new Manusia("Aku", "3923842934", true, true);
        Manusia manusia2 = new Manusia("Hafizh", "41925125", true, false);
        Manusia manusia3 = new Manusia("Adhyaksa", "851251221", false, false);

        MahasiswaFilkom mhs1 = new MahasiswaFilkom("I Putu Yoga", "351923848239", false, false, "205150601111018", 3.70);
        MahasiswaFilkom mhs2 = new MahasiswaFilkom("Deden", "29173107241", false, true, "21517150700119", 3.60);
        MahasiswaFilkom mhs3 = new MahasiswaFilkom("Hatta", "12865192", true, true, "21507007112151", 4.00);
        MahasiswaFilkom mhs4 = new MahasiswaFilkom("Yamin", "29151251", true, false, "2107125125911", 3.80);

        Pekerja pekerja_1 = new Pekerja("Iqbal Biondy", "351717969", true, true, 7, 22, "395102439281");
        Pekerja pekerja_2 = new Pekerja("Taufik", "21512521", true, true, 6, 18, "127848126491");
        Pekerja pekerja_3 = new Pekerja("Hidayat", "748124121", true, false, 12 , 119, "2189461986941");
        Pekerja pekerja_4 = new Pekerja("Ahsan", "251286124", true ,false, 11, 20, "14286129510");
        Pekerja pekerja_5 = new Pekerja("Kevon", "4182751295", true, false, 3, 21, "21974124112");

        Manajer manajer_1 = new Manajer("Lyra Hertin", "351707384392", false, false, 8, 20, "104837283729", 1500);
        Manajer manajer_2 = new Manajer("Tokito Muchiro", "214125151257", true, false, 24, 13, "231869186294", 1400);
        Manajer manajer_3 = new Manajer("Sasuke Uciha", "1234125125141", true, true, 19, 25, "8126491241", 1300);

        ArrayList<Manusia> listManusia = new ArrayList<Manusia>();
        ArrayList<MahasiswaFilkom> listMahasiswaFilkom = new ArrayList<MahasiswaFilkom>();
        ArrayList<Pekerja> listPekerja = new ArrayList<Pekerja>();
        ArrayList<Manajer> listManajer = new ArrayList<Manajer>();


        listManusia.add(manusia1);
        listManusia.add(manusia2);
        listManusia.add(manusia3);

        listPekerja.add(pekerja_1);
        listPekerja.add(pekerja_2);
        listPekerja.add(pekerja_3);
        listPekerja.add(pekerja_4);
        listPekerja.add(pekerja_5);

        listManajer.add(manajer_1);
        listManajer.add(manajer_2);
        listManajer.add(manajer_3);

        listMahasiswaFilkom.add(mhs1);
        listMahasiswaFilkom.add(mhs2);
        listMahasiswaFilkom.add(mhs3);
        listMahasiswaFilkom.add(mhs4);

        System.out.println("                    Data Manusia                  ");
        listManusia.toString();
        System.out.println("=================================================");
        System.out.println("                    Data Pekerja");
        listPekerja.toString();
        System.out.println("=================================================");
        System.out.println("                    Data Manajer");
        listManajer.toString();
        System.out.println("=================================================");
        System.out.println("                Data Mahasiswa Filkom");
        listMahasiswaFilkom.toString();
        System.out.println("=================================================");

        System.out.println();
        System.out.println("---------------------------");
        System.out.println("Total Manusia          : " + listManusia.size());
        System.out.println("Total Mahasiswa Filkom : " + listMahasiswaFilkom.size());
        System.out.println("Total Pekerja          : " + listPekerja.size());
        System.out.println("Total Manajer          : " + listManajer.size());
        System.out.println("---------------------------");


    }
}