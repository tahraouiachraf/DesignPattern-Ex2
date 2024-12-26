package framework.filters;

public class ImplNonStandard {
    public int[] appliquerFiltre(String filterName, int[] data) {
        System.out.println("Filtrage non standard : " + filterName);
        // Exemple d'implémentation
        return data;
    }
}
