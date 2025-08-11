import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class App {

    public static Integer[] carregarArquivo(String numeros_aleatorios) throws IOException {
        List<String> linhas = Files.readAllLines(Paths.get(numeros_aleatorios));
        Integer[] numeros = new Integer[linhas.size()];
        for (int i = 0; i < linhas.size(); i++) {
            numeros[i] = Integer.parseInt(linhas.get(i).trim());
        }
        return numeros;
    }
    public static void main(String[] args) throws Exception {

        BubbleSort<Integer> bSort = new BubbleSort<>();
        Comparator<Integer> comparaTor = (a,b) -> a.compareTo(b);
        String[] arquivos = {"numeros_aleatorios.txt"};
        for(String numeros_aleatorios : arquivos){

                Integer[] numerosArquivo = carregarArquivo(numeros_aleatorios);
                System.out.println("\nNumeros antes de Ordenar: "+Arrays.toString(numerosArquivo));
                bSort.sort(numerosArquivo, comparaTor);
                System.out.println("\nNumeros ordenados: "+Arrays.toString(numerosArquivo));
                System.out.println("Quantidade de fases: "+bSort.getFases());
                System.out.println("Quantidade de Trocas: "+bSort.getTroca());
                System.out.println("Quantidade de Comprarações: "+bSort.getComp());

        }

        
    }
}
