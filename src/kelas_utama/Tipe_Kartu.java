package kelas_utama;

public enum Tipe_Kartu {
    SILVER(1000000),
    GOLD(3000000),
    PLATINUM(5000000);
    
    private long batas;
    
    private Tipe_Kartu(long batas){
        this.batas = batas;
    }
    
    public long getBatas(){
        return batas;
    }
}
