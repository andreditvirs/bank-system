package sistem_bank;

import kelas_utama.*;

public class Transaksi_Offline extends Sistem_Transaksi{    
    
    @Override
    public boolean TarikTunai(long nominal, Tipe_Kartu tipe){
        long saldoAwal = getTabungan().getSaldo();
        if (saldoAwal > nominal && nominal <= tipe.getBatas()) {
            getTabungan().setSaldo(saldoAwal - nominal);
            return true;
        }
        return false;
    }
    
    public boolean credit(long nominal){
        return true;
    }
    
    @Override
    public boolean setorTunai(long nominal, Tipe_Kartu tipe){
        long saldoAwal = getTabungan().getSaldo();
        if(tipe.getBatas() >= nominal){
            getTabungan().setSaldo(saldoAwal + nominal);
            return true;
        }
        return false;
    }
}
