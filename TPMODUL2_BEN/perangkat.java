public class perangkat {
    protected String drive;
    protected int ram;
    protected float processor;

    public perangkat(String drive,int ram, float processor){
        this.drive = drive;
        this.ram = ram;
        this.processor = processor;

    }

    public void informasi(){
        System.out.println("Perangkat tidak diketahui memiliki drive tipe " + drive + " dengan ram sebesar " + ram +" GB dan processor secepat " + processor + "0 Ghz");
    }
}


