package MODUL2_BEN;

public class TransportasiAir extends MainApp {
    protected int jumlahKursi, biaya;

    public TransportasiAir (int jumlahKursi, int biaya){
        super(jumlahKursi, biaya);
        this.jumlahKursi = jumlahKursi;
        this.biaya = biaya;
    }

    @Override
    public void informasi(){
        System.out.println("Kapal memiliki jumlah kursi sebanyak"+ jumlahKursi + " kursi")
    }
    @Override
    public void berlabuh(){
        System.out.println("Kapal akan berlabuh ke"+ berlabuh)
    }

    @Override
    public void berlayar(){
        System.out.println("Kapal akan berlayar dari"+ berlayar)
    }
}
