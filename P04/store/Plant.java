package store;

public class Plant extends Product{
    private Exposure exposure;

    public Plant(String species, int price, Exposure exposure) {
        super("Plant: " + species, price);
        this.name = species;
        this.price = price;
        this.exposure = exposure;
    }


    public Exposure getExposure(){
        return exposure;
    }
}
