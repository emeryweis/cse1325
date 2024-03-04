package store;

public enum Exposure {
    SHADE("Shaded"), PARTSUN("Part sun, part shade"), SUN("Sunny");


    private final String exposure;

    private Exposure(String exposure) {
        this.exposure = exposure;
    }

    @Override
    public String toString(){
            return exposure;
        }
        
}

