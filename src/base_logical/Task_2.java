package base_logical;

import java.util.Scanner;
import java.lang.Math;

public class Task_2 {
    public static void main(String[] args) {
        //- Считать потоком ввода три числа, введенных пользователем, и сохранить их в целочисленных переменных a, b и c
        Scanner in = new Scanner(System.in);
        final int a = in.nextInt();
        final int b = in.nextInt();
        final int c = in.nextInt();


        //- Вывести на консоль переменные, значения которых делятся на 5 (вида: a=25, c=15), если нет ни одного значений, делящегося на 5, вывести строку: "нет значений, кратных 5"
        int[] array = {a, b, c};
        int chet = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 5 == 0 && i == 0) {
                System.out.println("a="+ array[i]);
                chet++;
            } else if (array[i] % 5 == 0 && i == 1) {
                System.out.println("b="+ array[i]);
                chet++;
            } else if (array[i] % 5 == 0 && i == 2) {
                System.out.println("c="+ array[i]);
                chet++;
            }
        }
        if (chet == 0) {
            System.out.println("нет значений, кратных 5");
        }

        //Вывести на консоль значение от целочисленного деления a на b (результат - целое число)
        int delenie_a_b = a / b;
        System.out.println("Результат целочисленного деления a на b: "+delenie_a_b);


        double a2 = a;
        double b2 = b;

        //Вывести на консоль значение от деления a на b (результат - число с плавающей запятой)
        double delenie_a_b_toch = a2 / b2;
        System.out.printf("Результат деления a на b: "+ "%.12f\n", delenie_a_b_toch);

        //Вывести на консоль значение от деления a на b, округленного до ближайшего целого в большую сторону
        double delenie_a_b_ceil = Math.ceil(a2 / b2);
        int result_ceil = (int) delenie_a_b_ceil;
        System.out.println("Результат деления a на b с округлением в большую сторону: "+result_ceil);

        //Вывести на консоль значение от деления a на b, округленного до ближайшего целого в меньшую сторону
        double delenie_a_b_floor = Math.floor(a2 / b2);
        int result_floor = (int) delenie_a_b_floor;
        System.out.println("Результат деления a на b с округлением в меньшую сторону: "+result_floor);

        //Вывести на консоль значение от деления a на b, округленного до ближайшего целого математическим округлением
        int delenie_a_b_round = Math.round(a / b);
        System.out.println("Результат деления a на b с математическим округлением: "+delenie_a_b_round);

        //Вывести на консоль остаток от деления b на c
        int delenie_b_c_ostatock = b % c;
        System.out.println("Остаток от деления b на c: "+delenie_b_c_ostatock);

        //Вывести на консоль наименьшее значение из a и b
        int result_min = Math.min(a, b);
        System.out.println("Наименьшее значение из a и b: "+result_min);

        //Вывести на консоль наибольшее значение из b и c
        int result_max = Math.max(b, c);
        System.out.println("Наибольшее значение из b и c: "+result_max);
    }
}
