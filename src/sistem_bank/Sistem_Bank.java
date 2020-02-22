package sistem_bank;

import java.util.ArrayList;
import kelas_utama.*;

public class Sistem_Bank {

    public void tambahNasabah(Nasabah nasabahBaru){
        Database_Bank.getListNasabah().add(nasabahBaru);
        int i =  Database_Bank.getListNasabah().size()-1;
        Database_Bank.getListNasabah().get(i).setListTabungan(new ArrayList<>());
    }
    
    public boolean tambahTabungan(String namaBaru, Tabungan tabunganBaru){
        for(int i = 0; i < Database_Bank.getListNasabah().size(); i++){
            if(Database_Bank.getListNasabah().get(i).getNama().equals(namaBaru)){
                Database_Bank.getListNasabah().get(i).getListTabungan().add(tabunganBaru);
                return true;
            }
        }
        return false;
    }
    
    public boolean tambahKartuATM(String userIDBaru, Kartu_ATM kartuATM){
        for(Nasabah nasabah : Database_Bank.getListNasabah()){
            for(Tabungan tabungan : nasabah.getListTabungan()){
                String userID = tabungan.getUserID();
                if(userID.equals(userIDBaru)){
                    tabungan.setKartuATM(kartuATM);
                    return true;
                }
            }
        }
        return false;
    }
}
