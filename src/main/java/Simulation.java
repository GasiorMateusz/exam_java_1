import extractors.*;
import worker.Worker;

import java.util.ArrayList;
import java.util.List;

public class Simulation {

    private final ExtractorsManager manager = new ExtractorsManager();

    private final List<Extractor> extractors = new ArrayList<>();
    private final List<CanFail> extractorsThatCanFail = new ArrayList<>();

    public void run() {
        for (int i = 0; i < 5; i++) {
            simulateDayRoutine();
            showImportantReports();

            manager.resetExtractorsWithFailureCounter();
            resetExtractorsQuantity();
        }
    }

    private void simulateDayRoutine() {
        extractors.forEach(extractor -> extractor.setQuantity(Utils.getRandomInt(0, extractor.getIntendedCapacity())));
        extractorsThatCanFail.forEach(extractor -> {
            if (extractor.doesFail()) manager.incrementExtractorsWithFailure();
        });
    }

    public void setUp() {
        //Extractors Factory Pattern
        extractors.add(new FixedTerrestrialExtractor(123, 100, "Warszawa"));
        extractors.add(new MobileTerrestrialExtractor(456, 120, "Gdansk"));
        extractors.add(new OffshorePlatform(789, 80, createRandomWorkerList()));

        extractors.forEach(extractor -> {
            if (extractor instanceof CanFail) extractorsThatCanFail.add((CanFail) extractor);
        });
    }

    private List<Worker> createRandomWorkerList() {
        List<Worker> workers = new ArrayList<>();
        return workers;
    }

    private void showImportantReports() {
        //shows reports using manager
        System.out.println("Extractors that failed in the last 24 hrs : " + manager.getNumberOfExtractorsWithFailure());
        System.out.println("Extractors that extracted more than theirs 95% of capacity : " +
                manager.getNumberOfExtractorsWithFailure());
    }

    private void resetExtractorsQuantity() {
        extractors.forEach(extractor -> {
            extractor.setQuantity(0);
        });
    }

}
