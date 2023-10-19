public class mainapp {
    public static void main(String[] args) throws Exception {
        perangkat intel = new perangkat("Adata",2,1.8f);
        intel.informasi();
        System.out.println("");

        laptop tuf = new laptop("Seagate",8,2.4F,true);
        tuf.informasi();
        tuf.bukaGame("Dota 2");
        tuf.kirimEmail("niceyuk@gmail.com");
        tuf.kirimEmail("annarji@gmail.com","rusmangc@gmail.com");
        System.out.println("");
        
        handphone hp = new handphone("Sandisk",3,2.2f,true); 
        hp.informasi();
        hp.telfon(628122122);
        hp.kirimSMS(62852112);
        hp.kirimSMS(628121212,629292211);

    }
}
