package kelas_utama;

import java.util.ArrayList;

public class Database_Bank {
    private static ArrayList<Nasabah> listNasabah = new ArrayList<Nasabah>();
    
    public static ArrayList<Nasabah> getListNasabah() {
        return listNasabah;
    }
    
}
