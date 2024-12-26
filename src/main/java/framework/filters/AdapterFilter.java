package framework.filters;

public class AdapterFilter implements FilterStrategy {
    private ImplNonStandard implNonStandard;
    private String filterName;

    public AdapterFilter(ImplNonStandard implNonStandard, String filterName) {
        this.implNonStandard = implNonStandard;
        this.filterName = filterName;
    }

    @Override
    public int[] filter(int[] data) {
        return implNonStandard.appliquerFiltre(filterName, data);
    }
}