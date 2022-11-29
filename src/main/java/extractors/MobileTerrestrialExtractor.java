package extractors;

public class MobileTerrestrialExtractor extends Extractor implements CanFail {

    private String location;

    public MobileTerrestrialExtractor(int serialNumber, int intendedCapacity, String location) {
        super(serialNumber, intendedCapacity);
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean doesFail() {
        return (getQuantity()<0.25*getIntendedCapacity());
    }
}
