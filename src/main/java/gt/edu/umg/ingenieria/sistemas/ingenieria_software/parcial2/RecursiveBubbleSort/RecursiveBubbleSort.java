package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.RecursiveBubbleSort;

public class RecursiveBubbleSort implements IRecursiveBubbleSort {

    /**
     * Recursive Bubble sort algorithm implementation
     * @param orderArray
     * @param n
     */
    @Override
    public void bubbleSort(String[] orderArray, int n) {
        if (n == 1) 
            return;
        for(int i = 0; i < orderArray.length; i++) {
            for (int j = 0; j < orderArray.length - 1; j++) {
                String firstElement = orderArray[j],
                        secondElement = orderArray[j + 1];
                if (firstElement.compareTo(secondElement) > 0) {
                    orderArray[j] = secondElement;
                    orderArray[j + 1] = firstElement;
                }
            }
        }
        bubbleSort(orderArray, n - 1);
    }

}

