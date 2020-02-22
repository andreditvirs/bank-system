package kelas_utama;

public class Kartu_ATM {
    private int id;
    private Tipe_Kartu tipeKartu;
    
    public Kartu_ATM(int id, Tipe_Kartu tipeKartu){
        this.id = id;
        this.tipeKartu = tipeKartu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Tipe_Kartu getTipeKartu() {
        return tipeKartu;
    }

    public void setTipeKartu(Tipe_Kartu tipeKartu) {
        this.tipeKartu = tipeKartu;
    }
    
}
