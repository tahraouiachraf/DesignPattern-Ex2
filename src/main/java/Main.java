import framework.Compressor;
import framework.ImageProcessor;
import framework.StandardCompressor;
import framework.filters.AdapterFilter;
import framework.filters.FilterStrategy;
import framework.filters.ImplNonStandard;
import framework.filters.StandardFilter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Création d'un compresseur standard
        Compressor compressor = new StandardCompressor();

        // Configuration initiale : filtre standard
        FilterStrategy filterStrategy = new StandardFilter();
        ImageProcessor processor = new ImageProcessor(filterStrategy, compressor);

        // Tableau d'exemple (image)
        int[] image = {1, 2, 3, 4, 5};

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Filtrer avec le filtre standard");
            System.out.println("2. Filtrer avec un filtre non standard");
            System.out.println("3. Compresser l'image");
            System.out.println("4. Quitter");
            System.out.print("Choix : ");
            int choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    processor.setFilterStrategy(new StandardFilter());
                    int[] filteredImage = processor.filter(image);
                    System.out.println("Image filtrée : " + java.util.Arrays.toString(filteredImage));
                    break;

                case 2:
                    System.out.print("Entrez le nom du filtre non standard : ");
                    String filterName = scanner.next();
                    processor.setFilterStrategy(new AdapterFilter(new ImplNonStandard(), filterName));
                    filteredImage = processor.filter(image);
                    System.out.println("Image filtrée avec filtre non standard : " + java.util.Arrays.toString(filteredImage));
                    break;

                case 3:
                    int[] compressedImage = processor.compresser(image);
                    System.out.println("Image compressée : " + java.util.Arrays.toString(compressedImage));
                    break;

                case 4:
                    System.out.println("Au revoir !");
                    scanner.close();
                    return;

                default:
                    System.out.println("Choix invalide.");
            }
        }
    }
}
