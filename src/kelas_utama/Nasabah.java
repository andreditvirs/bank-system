package kelas_utama;

import java.util.ArrayList;

public class Nasabah {
    private ArrayList<Tabungan> listTabungan;
    private int id;
    private String nama;
    
    public Nasabah(int id, String nama){
        this.id = id;
        this.nama = nama;
    }

    public ArrayList<Tabungan> getListTabungan() {
        return listTabungan;
    }

    public void setListTabungan(ArrayList<Tabungan> listTabungan) {
        this.listTabungan = listTabungan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    
}
