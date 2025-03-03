package base_logical;

import java.lang.Math;
import java.util.Arrays;

//💡- Заполнить массив из 20 элементов случайными целыми значениями в диапазоне от 1 до 15 включительно
//💡- Вывести на экран содержимое массива
//💡- Вывести на экран значения, которые встречаются в массиве больше одного раза, в формате, вида:
//"Число '3' встречается 2 раза"
//"Число '5' встречается 3 раза"
//и т.д.

//Пример:
//Вывод: [1, 2, 3, 4, 5, 6, 7, 8, 5, 10, 12, 12, 3, 14, 15, 11, 9, 5, 5, 5]
//Вывод: Число '5' встречается 5 раза
//Вывод: Число '3' встречается 2 раза
//Вывод: Число '12' встречается 2 раза

public class Task_3 {
    public static void main(String[] args) {

        //задание массива
        int[] array = new int[20];
        //int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 5, 10, 12, 12, 3, 14, 15, 11, 9, 5, 5, 5};
        for (int i = 0; i < array.length; i++) {
            int random = (int) (Math.random() * 15 + 1);
            array[i] = random;
        }
        System.out.println(Arrays.toString(array));


        //нахождение повторяющихся элементов
        boolean[] counted = new boolean[array.length]; // Массив для отслеживания уже учтённых элементов

        for (int i = 0; i < array.length; i++) {
            if (!counted[i]) {
                int kol = 1;
                int element = array[i];

                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] == element) {
                        kol++;
                        counted[j] = true;
                    }
                }
                if (kol != 1) {
                    System.out.println("Число '" + element + "' встречается " + kol + " раза");
                    kol = 0;
                }
            }
        }
    }
}
