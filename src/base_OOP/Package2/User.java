package base_OOP.Package2;


//💡💡- Создать класс "User", содержащий две переменных:
//private String name;
//private Integer age;

//💡- Добавить в класс геттеры и сеттеры, присваивающие и возвращающие значения этих переменных
//💡- Добавить в класс метод: public String toString(), который возвращает строку вида: "Вася, возраст 25 лет", где "Вася" - значение переменной name, а 25 - значение переменной age.
//💡- Создать конструктор класса, принимающий на вход два значения и инициализирующий ими эти переменные

//💡- Создать новый список ArrayList<User>();
//💡- Циклически запросить у оператора ввести данные 5-ти пользователей и записать объекты, созданные при вводе, в ArrayList<>
//💡- Вывести на консоль список пользователей (используя метод toString()), отсортированных по возрастанию возраста
//(сортировать, используя Collections.sort(), реализовав в нем Comparator, сравнивающий значения переменных age)

//Пример:
//Вывод: Введите имя пользователя 1
//Ввод: Александр
//Вывод: Введите возраст пользователя 1
//Ввод: 23
//Вывод: Введите имя пользователя 2
//Ввод: Александр2003
//Вывод: Введите возраст пользователя 2
//Ввод: 20
//Вывод: Введите имя пользователя 3
//Ввод: Михаил
//Вывод: Введите возраст пользователя 3
//Ввод: 19
//Вывод: Введите имя пользователя 4
//Ввод: Евгений
//Вывод: Введите возраст пользователя 4
//Ввод: 50
//Вывод: Введите имя пользователя 5
//Ввод: Мария
//Вывод: Введите возраст пользователя 5
//Ввод: 25

//Вывод: Михаил, возраст 19 лет
//Вывод: Александр2003, возраст 20 лет
//Вывод: Александр, возраст 23 лет
//Вывод: Мария, возраст 25 лет
//Вывод: Евгений, возраст 50 лет

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class User implements Comparable<User> {

    private String name;
    private Integer age;

    User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer name) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + ", возраст " + this.age + " лет";
    }
    @Override
    public int compareTo(User user1) {
        return this.age - user1.age;
    }
}

class UserTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<User>();

        for (int i = 1; i < 6; i++) {
            System.out.println("Введите имя пользователя " + i);
            String name1 = scanner.next();
            System.out.println("Введите возраст пользователя " + i);
            Integer age1 = scanner.nextInt();
            users.add(new User(name1, age1));
        }
        Collections.sort(users);

        for (User user : users) {
            System.out.println(user);
        }

        scanner.close();
    }
}


