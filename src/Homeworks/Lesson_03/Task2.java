package Homeworks.Lesson_03;
//Пусть цена товара A обычно составляет 1000 Euro, и товара B составляет 500 Euro.
// Если клиент покупает товары вместе, то на них действует скидка 10% на всю покупку.
// Выведите на экран переменную, которая соответствует стоимости суммы A+B со скидкой.
// Отдельно выведите на экран сумму скидки от этой покупки.
public class Task2 {
    public static void main(String[] args) {
        int a=1000;
        int b=500;
        int disPercent = 10;

        int totalCount = a+b;
        int discount = totalCount*disPercent/100;
        int finalPayment = totalCount-discount;
        System.out.println("Total sum is: " + totalCount + "\n" + "You got a discount in amount of:" +discount+" Euro " +"\n"+ "You total final payment is now: " + finalPayment);
    }
}
