package seminar.seminar6;

public class Laptop {
    
    private String serialNumber;
    private int hardDisk;
    private String brand;
    private String operatingSystem;
    private int processor;
    private String videocarta;

    public Laptop(String serialNumber,int hardDisk,String brand,String operatingSystem,int processor,String videocarta){
        this.serialNumber = serialNumber;
        this.hardDisk = hardDisk;
        this.brand = brand;
        this.operatingSystem = operatingSystem;
        this.processor = processor;
        this.videocarta = videocarta;
    }

    public String getSerialNumber(){
        return serialNumber;
    }

    public int getHardDisk(){
        return hardDisk;
    }

    public String getBrand(){
        return brand;
    }

    public String getOperatingSystem(){
        return operatingSystem;
    }

    public int getProcessor(){
        return processor;
    }

    public String getVideocarta(){
        return videocarta;
    }

}
