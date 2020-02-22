package sistem_bank;

import java.util.ArrayList;
import java.util.Date;
import kelas_utama.*;

public class Sistem_Transaksi {
    ArrayList<Histori_Transaksi> historiTransaksi;
    private Tabungan tabungan;
    private Nasabah nasabah;
    
    public void setTabungan(Tabungan tabungan){
        this.tabungan = tabungan;
    }
    
    public Tabungan getTabungan(){
        return this.tabungan;
    }

    public Nasabah getNasabah() {
        return nasabah;
    }

    public void setNasabah(Nasabah nasabah) {
        this.nasabah = nasabah;
    }
    
    public boolean validasiTabungan(String userID, int password){
        for(Nasabah nasabah : Database_Bank.getListNasabah()){
            for(Tabungan tabungan : nasabah.getListTabungan()){
                String userIDLama = tabungan.getUserID();
                int passwordLama = tabungan.getPassword();
                if(userIDLama.equals(userID) && passwordLama == password){
                    setTabungan(tabungan);
                    setNasabah(nasabah);
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean transfer(long nominal, int rekeningTujuanParameter, boolean verifikasi){
        for(Nasabah nasabahTujuan : Database_Bank.getListNasabah()){
            for(Tabungan tabunganTujuan : nasabahTujuan.getListTabungan()){
                int rekeningLama = tabunganTujuan.getRekening();
                if(rekeningLama == rekeningTujuanParameter && getTabungan().getSaldo() > nominal && verifikasi == true){
                    tabunganTujuan.setSaldo(tabunganTujuan.getSaldo()+nominal);
                    getTabungan().setSaldo(getTabungan().getSaldo()-nominal);
                    setNasabah(nasabahTujuan);
                    return true;
                }else if(rekeningLama == rekeningTujuanParameter && getTabungan().getSaldo() > nominal && verifikasi == false){
                    setNasabah(nasabahTujuan);
                    return true;
                }
            }
        }
        return false;
    }
    
    public String cekSaldo(){
        long saldo = tabungan.getSaldo();
        return String.format("Rp %d", saldo);
    }
    
    public boolean login(String userID, int password){
        if(validasiTabungan(userID, password)){
            return true;
        }
        return false;
    }
    
    public boolean TarikTunai(long nominal, Tipe_Kartu tipeKatu){
        return true;
    }
    
    public void tambahTransaksi(long jumlah){
        Histori_Transaksi historiTransaksiBaru = new Histori_Transaksi(jumlah, this.tabungan);
        this.historiTransaksi.add(historiTransaksiBaru);
    }
    
    public String cetakLaporanTransaksi(){
        return null;
    }

    public boolean setorTunai(long nominal, Tipe_Kartu tipe) {
        return true;
    }
    
}
