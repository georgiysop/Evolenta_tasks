package base_logical;

import java.util.Scanner;

//- Создать проект с главным классом (содержащим метод "main") в NetBeans или любой другой IDE на ваш вкус.
//- Вывести на консоль фразу: "Как тебя зовут?"
//- Считать ответ пользователя
//- Вывести пользователю строку: "Привет, <введенное имя>!"


public class Task_1 {
    public static void main(String[] args) {
        System.out.println("Как тебя зовут ?");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println("Привет, " + name + "!");
        in.close();
    }

}