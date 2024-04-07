package Homeworks.Lesson_04;
//Реализовать приложение, которое читает информацию о вас, и печатает итог на экран:
//Введите ваше имя:
//Марсель
//Введите вашу фамилию:
//Сидиков
//Введите ваш город:
//Берлин
//Введите ваш возраст:
//29
//Введите ваш рост (в метрах):
//1.85
//
//Вывод:
//Меня зовут Марсель Сидиков, мне 29 лет, я из Берлин, мой рост - 1.85

import java.util.Scanner;

public class Task1_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert your Name: ");
        String name = scanner.nextLine();
        System.out.println("Please insert your Surname: ");
        String surname = scanner.nextLine();
        System.out.println("Please insert your City: ");
        String city = scanner.nextLine();
        System.out.println("Please insert your age: ");
        int age = scanner.nextInt();
        System.out.println("Please insert your height: ");
        double height = scanner.nextDouble();

        System.out.println("Hello! My name is "+name+" "+surname+"."+"\n"+
                "I am living in "+city+", and my height is "+height+ " . "+"\n"+
                "I am "+age+" years old.");

    }
}
