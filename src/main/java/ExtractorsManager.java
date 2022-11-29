import extractors.Extractor;

import java.util.ArrayList;
import java.util.List;

public class ExtractorsManager {
    public int getNumberOfExtractorsWithFailure() {
        return extractorsWithFailure;
    }

    //Singleton Pattern
    private int extractorsWithFailure = 0;

    public List<Extractor> getExtractorsWithCapacityAbove95(List<Extractor> extractors) {
        List<Extractor> result = new ArrayList<>();
        extractors.forEach(extractor -> {
            if (extractor.getQuantity() > extractor.getQuantity() * 0.95) result.add(extractor);
        });
        return result;
    }

    public void incrementExtractorsWithFailure() {
        extractorsWithFailure++;
    }

    public void resetExtractorsWithFailureCounter(){
        extractorsWithFailure = 0;
    }


}
