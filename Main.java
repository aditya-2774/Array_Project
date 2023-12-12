// Array Project to find the average of temperatures and then find how many days are above the average temperature
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many day's temperatures? ");
        int numDays = sc.nextInt();
        int[] temps= new int[numDays];

        // Recording Temperature and finding average
        int sum = 0;
        for (int i=0; i<numDays; i++){
            System.out.println("Day "+ (i+1) + "'s high temp: ");
            temps[i] = sc.nextInt();
            sum+= temps[i];
        }

        double average = sum/numDays;

        // Counting Days Above Average
        int above=0;
        for (int i=0; i<temps.length; i++){
            if(temps[i]<average){
                above++;
            }
        }
        System.out.println();
        System.out.println("Average Temp = " + average);
        System.out.println(above + " days above average");
    }
}