import java.util.Scanner;

public class Task2 {
    int kota_a;
    int kota_b;
    static int harga_perJ = 500;

    public void input(){
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Masukkan titik kota A: ");
            kota_a = input.nextInt();
            System.out.println("Masukkan titik kota B: ");
            kota_b = input.nextInt();
        }catch (NumberFormatException e) {
            kota_a = 120;
            kota_b = 1000;
        }
    }

    public static int distance(int kota_a, int kota_b){
        int jarak = kota_b - kota_a;
        return jarak;
    }

    public static int harga(int jarak){
        int harga = jarak * harga_perJ;
        return harga;
    }

    public static void main(String[] args) {
        Task2 task = new Task2();
        task.input();
        int jarak = distance(task.kota_a, task.kota_b);
        System.out.print("titik kota A: " + task.kota_a);
        System.out.println(",\ttitik kota B: " + task.kota_b);
        System.out.println("Harga per jarak: Rp " + harga_perJ);
        System.out.println("Jarak antara kota A dan B adalah: " + jarak);
        System.out.println("Harga yang harus dibayar: Rp " + harga(jarak));
    }

}
