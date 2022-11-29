package extractors;

import worker.Position;
import worker.Worker;

import java.util.List;

public class OffshorePlatform extends Extractor implements CanFail {

    private final List<Worker> workers;

    public OffshorePlatform(int serialNumber, int intendedCapacity, List<Worker> workers) {
        super(serialNumber, intendedCapacity);
        this.workers = workers;
    }

    public List<Worker> getWorkers() {
        return workers;
    }

    @Override
    public boolean doesFail() {
        if (getQuantity() < 0.7 * getIntendedCapacity()) return true;
        if (workers.stream().noneMatch(worker -> worker.getPosition() == Position.MEDIC)) return true;
        return workers.stream().anyMatch(worker -> worker.getDaysOnThePlatform() > 14);
    }
}
