//💡💡- Создать класс "User", содержащий две переменных:
//private String name;
//private Integer age;

//💡- Добавить в класс геттеры и сеттеры, присваивающие и возвращающие значения этих переменных
//💡- Добавить в класс метод: public String toString(), который возвращает строку вида: "Вася, возраст 25 лет", где "Вася" - значение переменной name, а 25 - значение переменной age.
//💡- Создать конструктор класса, принимающий на вход два значения и инициализирующий ими эти переменные

//💡- Создать новую мапу HashMap<Integer, List<User>>(), которая будет в качестве ключа хранить возраст, а в качестве значения - список пользователей;
//💡- Циклически запросить у оператора ввести данные 5-ти пользователей и записать объекты, созданные при вводе, в HashMap.
// Причем, если ключ (возраст) в мапе уже существует, то добавлять объект очередного пользователя в список,
// лежащий в значении по ключу. Если ключ в мапе еще не существует, то создавать новый список, записывать туда юзера и класть этот список в мапу по этому ключу.

//💡- Запросить у пользователя ввести требуемый возраст и, если такой ключ есть в мапе,
//вывести на консоль пользователей из списка, полученного по ключу из мапы, отсортированных по имени.

//Пример 1:
//Вывод: Введите имя пользователя 1
//Ввод: Александр
//Вывод: Введите возраст пользователя 1
//Ввод: 25
//Вывод: Введите имя пользователя 2
//Ввод: Александр2003
//Вывод: Введите возраст пользователя 2
//Ввод: 20
//Вывод: Введите имя пользователя 3
//Ввод: Михаил
//Вывод: Введите возраст пользователя 3
//Ввод: 25
//Вывод: Введите имя пользователя 4
//Ввод: Евгений
//Вывод: Введите возраст пользователя 4
//Ввод: 50
//Вывод: Введите имя пользователя 5
//Ввод: Мария
//Вывод: Введите возраст пользователя 5
//Ввод: 25
//Вывод: Введите требуемый возраст
//Ввод: 25
//Вывод: Александр, возраст 25 лет
//Вывод: Мария, возраст 25 лет
//Вывод: Михаил, возраст 25 лет
//Пример 2:
//Вывод: Введите требуемый возраст
//Ввод: 5

//Вывод: Пользователь с возрастом '5' не найден

package base_OOP.Package3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
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
        return this.name.compareTo(user1.name);
    }
}

class UserTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, ArrayList<User>> hashUsers = new HashMap<>();

        for (int i = 1; i < 6; i++) {
            System.out.println("Введите имя пользователя " + i);
            String name1 = scanner.next();
            System.out.println("Введите возраст пользователя " + i);
            Integer age1 = scanner.nextInt();
            User user1 = new User(name1, age1);


            if (hashUsers.containsKey(age1)) {
                ArrayList<User> userList = hashUsers.get(age1);
                userList.add(user1);
            } else {
                ArrayList<User> userList = new ArrayList<>();
                userList.add(user1);
                hashUsers.put(age1, userList);
            }
        }

        //System.out.println(hashUsers);

        System.out.println("Введите требуемый возраст");
        Integer age1 = scanner.nextInt();

        if (hashUsers.containsKey(age1)) {

            ArrayList<User> users = hashUsers.get(age1);
            Collections.sort(users);

            for (User user : users) {
                System.out.println(user);
            }
        } else {
            System.out.printf("Пользователь с возрастом '%d' не найден",age1);
        }

        scanner.close();
    }
}


