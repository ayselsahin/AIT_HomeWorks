package Homeworks.Lesson_03;
//int x = 3 Чему будет равно значение х после выполнения операции x += x++ ?
// Проверьте свое предположение на практике.
public class Task5 {
    public static void main(String[] args) {

        int x=3;
        x += x++;
        System.out.println(x);
    }
}
