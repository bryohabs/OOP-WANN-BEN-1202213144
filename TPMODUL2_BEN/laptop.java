public class laptop extends perangkat {
    protected boolean webcam;
    public laptop(String drive, int ram, float processor, boolean webcam){
        super(drive, ram, processor);
        this.webcam = webcam;
    }
    
    @Override
    public void informasi(){
        System.out.println("Laptop ini memiliki drive tipe " + drive + " dengan ram sebesar " + ram +" GB dan processor secepat " + processor +"0 Ghz. Selain itu laptop ini juga memiliki webcam"); 
    }

    public void bukaGame(String nama_game){
            System.out.println("laptop berhasil membuka game " + nama_game);
    }

    public void kirimEmail(String email){
        System.out.println("Laptop berhasil mengirim Email ke " + email);
    }

    public void kirimEmail(String email1, String email2){
        System.out.println("Laptop berhasil mengirim Email ke " + email1 + " dan ke " + email2);
    }
}

    

