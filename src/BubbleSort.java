import java.util.*;

public class BubbleSort<T>{

    private long fases;
    private long troca;
    private long comp;

    private void troca(T[] array, int i, int j){
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public T[] sort(T[] array, Comparator<T> comparator){
        this.fases = 0;
        this.troca = 0;
        this.comp = 0;

        int n = array.length;
        for(int fase=1;fase<n;fase++){
            fases++;
            boolean numTroca = false;

            for(int j=0;j<n-fase;j++){
                comp++;
                if(comparator.compare(array[j],array[j+1]) >0){
                    troca(array, j, j+1);
                    numTroca = true;
                    troca++;
                }// fim if
            }// fim for j
            if(!numTroca)
            break;
        }// fim for fase
        return array;
    } 

    public long getComp() {
        return comp;
    }

    public long getFases() {
        return fases;
    }

    public long getTroca() {
        return troca;
    }
}