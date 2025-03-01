package base_logical;

import java.lang.Math;

public class Task_3 {
    public static void main(String[] args) {

        int[] array = new int[20];
        int kol_5 = 0;
        int kol_3 = 0;
        for (int i = 0; i < array.length; i++) {
            int random = (int) (Math.random() * 15);
            array[i] = random;


            System.out.print(array[i] + " ");
        }

    }
}
