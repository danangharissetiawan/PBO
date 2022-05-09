import java.util.Scanner;


public class Task3 {

    double volume;
    double radius;
    double height;
    double pi = 3.14;

    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jari-jari tabung:");
        radius = input.nextDouble();
        System.out.println("Masukkan ketinggian tabung:");
        height = input.nextDouble();
    }

    public int getVolume() {
        volume = pi * radius * radius * height;
        return (int) volume;
    }

    public static String padRight(String s, int n) {
        return String.format("%1$-" + n + "s", s);
    }

    public void print() {
        System.out.println(padRight("Phi", 20)  + pi);
        System.out.println(padRight("Jari-jari", 20) + radius);
        System.out.println(padRight("Ketinggian", 20) + height);
        System.out.println(padRight("Volume", 20) + volume);
        if (volume < 1000) {
            System.out.println("Kecil");
        } else {
            System.out.println("Besar");
        }
    }

    public static void main(String[] args) {
        Task3 task3 = new Task3();
        task3.input();
        task3.getVolume();
        task3.print();
    }
}
