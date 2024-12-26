package framework;

public class StandardCompressor extends Compressor {
    @Override
    protected int[] effectuerCompression(int[] data) {
        System.out.println("Compression standard effectuée.");
        // Exemple de compression simple
        return data;
    }
}
