package Homeworks.Lesson_03;

// Найдите в Интернете данные по температуре в вашем городе за прошедшую неделю.
// Вычислите среднюю температуру за неделю и выведете ее на печать.

public class Task3 {
    public static void main(String[] args) {
        int Mon = 10;
        int Tue= 14;
        int Wed= 25;
        int Thu=23;
        int Fri=14;
        int Sat=15;
        int Sun=26;
        int tempSum=Mon+Tue+Wed+Thu+Fri+Sat+Sun;
        float tempAverage = (float) tempSum /7 ;
        System.out.format("%.2f",tempAverage);
    }
}
