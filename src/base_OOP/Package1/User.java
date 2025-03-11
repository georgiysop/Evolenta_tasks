//💡💡- Создать класс "User", содержащий две переменных:
//private String name;
//private Integer age;

//💡- Добавить в класс геттеры и сеттеры, присваивающие и возвращающие значения этих переменных
//💡- Добавить в класс метод: public String toString(), который возвращает строку вида: "Вася, возраст 25 лет", где "Вася" - значение переменной name, а 25 - значение переменной age.
//💡- Создать конструктор класса, принимающий на вход два значения и инициализирующий ими эти переменные

//в методе main главного класса:
//💡- Последовательно запросить у пользователя ввести строку с именем, затем число возраста, сохранить их в соответствующих переменных
//💡- Создать объект класса User, передав в его конструктор эти две переменных в качестве значений, которые он может принять
//💡- Еще раз запросить у оператора имя и возраст другого юзера
//💡- Создать второй объект класс User, передав в его конструктор эти две переменных в качестве значений, которые он может принять
//💡- Вывести в консоль значение, которое возвращает toString() у объекта с наименьшим age

//Пример:
//Вывод: Введите имя первого пользователя
//Ввод: Александр
//Вывод: Введите возраст первого пользователя
//Ввод: 23
//Вывод: Введите имя второго пользователя
//Ввод: Александр2003
//Вывод: Введите возраст второго пользователя
//Ввод: 20
//Вывод: Александр2003, возраст 20 лет

package base_OOP.Package1;

import java.util.Scanner;

public class User {

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


    public String toString() {
        return this.name + ", возраст " + this.age + " лет";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя первого пользователя");
        String name1 = scanner.next();
        System.out.println("Введите возраст первого пользователя");
        Integer age1 = scanner.nextInt();
        User user1 = new User(name1, age1);

        System.out.println("Введите имя второго пользователя");
        String name2 = scanner.next();
        System.out.println("Введите возраст второго пользователя");
        Integer age2 = scanner.nextInt();
        User user2 = new User(name2, age2);

        if (user1.getAge() < user2.getAge()) {
            System.out.println(user1.toString());
        } else {
            System.out.println(user2.toString());
        }

        scanner.close();
    }
}

