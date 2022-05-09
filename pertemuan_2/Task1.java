public class Task1 {
    String fname = "Danang Haris";
    String lname = "Setiawan";
    String nim = "A11.2020.13179";
    String kelompok = "A11.4415";
    String ttd = "18/09/2000";
    String alamat = "Gandu Gemulung RT 004/RW 001, Kec. Kerek, Kab. Tuban, Jawa Timur";
    String email = "111202013179@mhs.dinus.ac.id";
    String nohp = "081252146881";
    String ig = "@mr.danang_haris";

    public static String padRight(String s, int n) {
        return String.format("%1$-" + n + "s", s);
    }

    public static String padLeft(String s, int n) {
        return String.format("%1$" + n + "s", s);
    }

    public void print() {
        System.out.println(padRight("Nama Lengkap", 30) + "= " + fname + " " + lname);
        System.out.println(padRight("NIM", 30) + "= " + nim);
        System.out.println(padRight("Kelompok", 30) + "= " + kelompok);
        System.out.println(padRight("TTL", 30) + "= " + ttd);
        System.out.println(padRight("Alamat", 30) + "= " + alamat);
        System.out.println(padRight("Email", 30) + "= " + email);
        System.out.println(padRight("No. HP", 30) + "= " + nohp);
        System.out.println(padRight("Instagram", 30) + "= " + ig);
    }

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.print();
    }
}
