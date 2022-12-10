package MODUL2_BEN;

public class Sampan extends MainApp {
    protected int layar;

    public Sampan(int jumlahKursi, int biaya, int layar){
        super(jumlahKursi, biaya, layar);
        this.jumlahKursi = jumlahKursi;
        this.biaya = biaya;
        this.layar = layar;
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

    @Override
    public void berlabuh(int jangkar){
        System.out.println("Kapal akan berlabuh ke"+ berlabuh(int jangkar))
    }
}
