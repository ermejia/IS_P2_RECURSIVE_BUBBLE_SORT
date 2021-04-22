package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.RecursiveBubbleSort;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class RecursiveBubbleSortApplication implements CommandLineRunner{

	public static void main(String[] args) {

	}

    /**
     * Demo application
     * @param args
     */
    @Override
    public void run(String... args) {

        IRecursiveBubbleSort rBubble = new RecursiveBubbleSort();

        Scanner arrayInput=new Scanner(System.in);
        System.out.print("Enter the number of words to order:");
        int n=arrayInput.nextInt();
        String[] orderedArray=new String[n];

        for(int i=0;i<n;i++){
            System.out.print("Word "+(i+1)+": ");
            orderedArray[i]=arrayInput.next();
        }

        System.out.println("The words in order are: ");

        rBubble.bubbleSort(orderedArray, orderedArray.length);

        for (int i = 0; i < orderedArray.length; i++) {

            System.out.println(orderedArray[i]);

        }


    }

}
