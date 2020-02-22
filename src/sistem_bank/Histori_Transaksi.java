package sistem_bank;

import java.util.Date;
import kelas_utama.*;

public class Histori_Transaksi {
    
    private double jumlah;
    private Date tanggal;
    private Tabungan tabungan;
    
    public Histori_Transaksi(double amount, Tabungan tabungan){
        this.jumlah = amount;
        this.tabungan = tabungan;
        this.tanggal = new Date();
    }
    
    public double getJumlah(){
        return this.jumlah;
    }
    
    public String getLaporanTransaksi(){
        if(this.jumlah >= 0){
            return String.format("%s : $%.02f : \n", this.tanggal.toString(), this.jumlah);
        }else{
            return String.format("%s : $(%.02f) : \n", this.tanggal.toString(), this.jumlah);
        }
    }
    
}
