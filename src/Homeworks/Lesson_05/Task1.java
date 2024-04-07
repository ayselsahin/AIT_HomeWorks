package Homeworks.Lesson_05;
<<<<<<< HEAD

public class Task1 {
    public static void main(String[] args) {
        
    }

=======
//Создайте переменную с типом String, в которой будет хранится Вaше имя.
//Сколько букв в вашем имени? Выведите значение на экран
//Создайте две переменные типа char. Одной присвойте первый символ имени, второй - последний символ
//Выведите на экран десятичный код первого и последнего символа вашего имени

public class Task1 {
    public static void main(String[] args) {

        String name="Aysel";
        System.out.println(name.length());

        int lastIndex = name.length()-1;
        char lastChar = name.charAt(lastIndex);
        char firstChar = name.charAt(0);

        int firstChar1 = firstChar;
        int lastChar1 = lastChar;

        String sonuc = firstChar1 + "," +lastChar1;
        System.out.println(sonuc);
    }
>>>>>>> 34f0d51 (Initial commit)
}
