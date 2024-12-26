package framework.filters;

public class StandardFilter implements FilterStrategy {
    @Override
    public int[] filter(int[] data) {
        System.out.println("Filtrage standard appliqué.");
        // Exemple d'opération de filtrage simple
        return data;
    }
}

