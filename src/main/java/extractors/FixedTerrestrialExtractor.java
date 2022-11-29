package extractors;

public class FixedTerrestrialExtractor extends Extractor {

    private final String location;

    public FixedTerrestrialExtractor(int serialNumber, int intendedCapacity, String location) {
        super(serialNumber, intendedCapacity);
        this.location = location;
    }

    public String getLocation() {
        return location;
    }
}
