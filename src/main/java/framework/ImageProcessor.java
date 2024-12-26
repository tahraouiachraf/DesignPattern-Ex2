package framework;

import framework.filters.FilterStrategy;

public class ImageProcessor {
    private FilterStrategy filterStrategy;
    private Compressor compressor;

    public ImageProcessor(FilterStrategy filterStrategy, Compressor compressor) {
        this.filterStrategy = filterStrategy;
        this.compressor = compressor;
    }

    public void setFilterStrategy(FilterStrategy filterStrategy) {
        this.filterStrategy = filterStrategy;
    }

    public int[] filter(int[] data) {
        return filterStrategy.filter(data);
    }

    public int[] compresser(int[] data) {
        return compressor.compresser(data);
    }
}
