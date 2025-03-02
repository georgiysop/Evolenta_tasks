package base_logical;

import java.util.Scanner;
import java.util.Date;
import java.text.*;

public class Task_4 {

//Для решения задач нужно использовать методы класса String (не рассматривать строку как массив символов).
//4.1.
//💡- Ввести с консоли строку, сохранить ее в строковой переменной
//💡- Ввести с консоли подстроку, сохранить ее во второй строковой переменной
//💡- Подсчитать сколько раз подстрока встречается в строке и вывести это значение на экран.

//Пример:
//Вывод: Введите строку
//Ввод: мама, мамонт, матрас
//Вывод: Введите подстроку
//Ввод: ма
//Вывод: Подстрока 'ма' встречается 4 раза

    public static void Task_4_1() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = in.nextLine();
        System.out.println("Введите подстроку");
        String strFind = in.nextLine();
        int count = 0;
        int fromIndex = 0;

        while ((fromIndex = str.indexOf(strFind, fromIndex)) != -1) {
            count++;
            fromIndex++;
        }
        System.out.println("Подстрока '" + strFind + "' встречается " + count + " раза");
    }

//4.2.
//💡- Ввести строку
//💡- Заменить в строке все слова "кака" и "бяка" на "вырезано цензурой"

//Пример:
//Вывод: Введите строку
//Ввод: Это бяка? Нет это кака
//Вывод: Это вырезано цензурой? Нет это вырезано цензурой

    public static void Task_4_2() {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String res1 = str.replace("кака", "вырезано цензурой");
        String res2 = res1.replace("бяка", "вырезано цензурой");
        System.out.printf(res2);
        in.close();
    }

//4.3.
//💡- Ввести строку с датой формата: 31.12.2020
//💡- Преобразовать строку даты в формат: 2020-12-31

//Пример:
//Вывод: Введите дату в формате 'дд.мм.гггг'
//Ввод: 31.12.2020
//Вывод: 2020-12-31

    public static void Task_4_3() {
        Scanner in = new Scanner(System.in);
        String str_date = in.nextLine();
    }


//4.4.
//💡- Сделать задание 4.3. с использованием классов Date и SimpleDateFormat и их соответствующих методов.

    public static void Task_4_4() {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        Date parsingDate;
        try {
            parsingDate = ft.parse(s);
            System.out.println(parsingDate);
        }catch (ParseException e) {
            System.out.println("Нераспаршена с помощью " + ft);
        }



    }

    public static void main(String[] args) {
        //Task_4_1();
        //Task_4_2();
        //Task_4_3();
        Task_4_4();
    }


}
