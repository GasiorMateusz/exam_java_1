package extractors;

public abstract class Extractor {

    private final int serialNumber;
    private final int intendedCapacity;
    private int quantity = 0;

    public Extractor(int serialNumber, int intendedCapacity) {
        this.serialNumber = serialNumber;
        this.intendedCapacity = intendedCapacity;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public int getIntendedCapacity() {
        return intendedCapacity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
