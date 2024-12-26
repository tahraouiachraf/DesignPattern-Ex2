package framework;

public abstract class Compressor {
    public final int[] compresser(int[] data) {
        System.out.println("Compression démarrée.");
        preTraitement(data);
        int[] result = effectuerCompression(data);
        postTraitement(result);
        return result;
    }

    protected void preTraitement(int[] data) {
        System.out.println("Pré-traitement par défaut.");
    }

    protected abstract int[] effectuerCompression(int[] data);

    protected void postTraitement(int[] data) {
        System.out.println("Post-traitement par défaut.");
    }
}