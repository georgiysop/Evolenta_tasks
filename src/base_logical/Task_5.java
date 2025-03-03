package base_logical;

//2.22 Задание 5. Даты. SimpleDateFormat, Calendar, циклы, условные операторы (списки и мапы по желанию).
//💡- Ввести с консоли дату в формата: 31.12.2020, сохранить ее в переменной класса Date (преобразовав введенную строку с использованием SimpleDateFormat)
//💡- Увеличить дату на 45 дней и вывести на экран
//💡- Сдвинуть дату на начало года и вывести на экран
//💡- Увеличить дату на 10 рабочих дней (считаем субботы и воскресенья выходными) и вывести на экран
//💡- Ввести с консоли вторую дату в том же формате и сохранить ее в другой переменной класса Date
//💡- Посчитать количество рабочих дней (субботы и воскресенья - выходные) между первой и второй датами введенными с консоли и вывести на экран

//Пример:
//Вывод: Введите дату в формате dd.MM.yyyy:
//Ввод: 10.01.2024
//Вывод: Дата после увеличения на 45 дней: 24.02.2024
//Вывод: Дата после сдвига на начало года: 01.01.2024
//Вывод: Дата после увеличения на 10 рабочих дней: 24.01.2024
//Вывод: Введите вторую дату в формате dd.MM.yyyy:
//Ввод: 01.01.2024
//Вывод: Количество рабочих дней между введенными датами: 7

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        System.out.println("Введите дату в формате dd.MM.yyyy:");
        Scanner in = new Scanner(System.in);
        String str_date_1 = in.nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        try {
            Date date1 = sdf.parse(str_date_1);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
