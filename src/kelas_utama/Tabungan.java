package kelas_utama;

public class Tabungan {
    private int rekening;
    private long saldo;
    private String userID;
    private int password;
    private Kartu_ATM kartuATM;
    
    public Tabungan(int rekening, long saldo, String user, int password, Kartu_ATM kartuATM) {
        this.rekening = rekening;
        this.saldo = saldo;
        this.userID = user;
        this.password = password;
        this.kartuATM = kartuATM;
    }

    
    public Tabungan(int rekening, long saldo, String user, int password) {
        this.rekening = rekening;
        this.saldo = saldo;
        this.userID = user;
        this.password = password;
    }
    
    public Tabungan(Kartu_ATM kartuATM){
        this.kartuATM = kartuATM;
    }

    public int getRekening() {
        return rekening;
    }

    public void setRekening(int rekening) {
        this.rekening = rekening;
    }

    public long getSaldo() {
        return saldo;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String user) {
        this.userID = user;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public Kartu_ATM getKartuATM() {
        return kartuATM;
    }

    public void setKartuATM(Kartu_ATM kartuATM) {
        this.kartuATM = kartuATM;
    }
    
}
