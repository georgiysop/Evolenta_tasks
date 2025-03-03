package base_logical;

import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.Date;
import java.text.*;
import java.util.Calendar;

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
        System.out.println("Введите строку");
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
        System.out.println("Введите дату в формате 'дд.мм.гггг'");
        Scanner in = new Scanner(System.in);
        String str_date = in.nextLine();
        String day = str_date.substring(0, 2);
        String month = str_date.substring(3, 5);
        String year = str_date.substring(6, 10);
        String result = year + "-" + month + "-" + day;
        System.out.println(result);
    }


//4.4.
//💡- Сделать задание 4.3. с использованием классов Date и SimpleDateFormat и их соответствующих методов.

    public static void Task_4_4() {
        System.out.println("Введите дату в формате 'дд.мм.гггг'");
        Scanner in = new Scanner(System.in);
        String str_date = in.nextLine();

        SimpleDateFormat ft = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat ft2 = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date date_1 = ft.parse(str_date);
            System.out.println(ft2.format(date_1));
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        //Task_4_1();
        //Task_4_2();
        //Task_4_3();
        //Task_4_4();


    }


}
