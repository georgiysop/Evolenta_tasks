package base_logical;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

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


public class Task_5 {

    private static void WorkingDays(Calendar calendar, int workingDays) {
        while (workingDays > 0) {
            calendar.add(Calendar.DAY_OF_MONTH, 1);
            int dayWeek = calendar.get(Calendar.DAY_OF_WEEK);
            if (dayWeek != Calendar.SATURDAY && dayWeek != Calendar.SUNDAY) {
                workingDays--;
            }
        }
    }

    private static int countWorkingDays(Date startDate, Date endDate) {
        Calendar startCal = Calendar.getInstance();
        startCal.setTime(startDate);
        Calendar endCal = Calendar.getInstance();
        endCal.setTime(endDate);

        int workingDays = 0;

        // Если startDate позже endDate, меняем их местами
        if (startCal.after(endCal)) {
            Calendar temp = startCal;
            startCal = endCal;
            endCal = temp;
        }

        // Исключаем начальную дату из подсчета
        startCal.add(Calendar.DAY_OF_MONTH, 1);

        while (!startCal.after(endCal) ) {
            int dayWeek = startCal.get(Calendar.DAY_OF_WEEK);
            if (dayWeek != Calendar.SATURDAY && dayWeek != Calendar.SUNDAY) {
                workingDays++;
            }
            startCal.add(Calendar.DAY_OF_MONTH, 1);
        }
        return workingDays;
    }

    public static void main(String[] args) {
        System.out.println("Введите дату в формате dd.MM.yyyy:");
        Scanner in = new Scanner(System.in);
        String str_date_1 = in.nextLine();


        SimpleDateFormat ft = new SimpleDateFormat("dd.MM.yyyy");
        try {
            Calendar calendar = Calendar.getInstance();
            Date date_1 = ft.parse(str_date_1);
            calendar.setTime(date_1);

            calendar.add(Calendar.DAY_OF_YEAR, 45);
            System.out.println("Дата после увеличения на 45 дней: " + ft.format(calendar.getTime()));

            calendar.set(Calendar.DAY_OF_YEAR, 1);
            System.out.println("Дата после сдвига на начало года: " + ft.format(calendar.getTime()));

            calendar.setTime(date_1);
            WorkingDays(calendar, 10);
            System.out.println("Дата после увеличения на 10 рабочих дней: " + ft.format(calendar.getTime()));

            System.out.println("Введите вторую дату в формате dd.MM.yyyy:");
            String str_date_2 = in.nextLine();
            Date date_2 = ft.parse(str_date_2);

            int workingDayss = countWorkingDays(date_1, date_2);
            System.out.println("Количество рабочих дней между введенными датами: " + workingDayss);
            in.close();
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println("Ошибка в формате даты. Пожалуйста, введите дату в формате dd.MM.yyyy.");
        }
    }
}
