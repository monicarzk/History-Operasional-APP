import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //membuat scanner untuk membaca input dari keyboard/user
        Scanner scanner = new Scanner(System.in);

        //membuat objek dengan saldo awal sebesar 100000000
        Keuangan keuangan = new Keuangan(100000000);  // Saldo awal

        //memakai looping DO - WHILE agar looping terus berjalan sampai kita memaksa program keluar dari loop
        //disini berarti jika kita menekan tombol 4 maka kita akan keluar dari program/aplikasi
        while (true) {
            //mencetak menu aplikasi
            System.out.println("=== Aplikasi History Operasional ===");
            System.out.println("1. Saldo");
            System.out.println("2. Pemasukan");
            System.out.println("3. Pengeluaran");
            System.out.println("4. exit");

            System.out.print("Masukkan pilihan (1/2/3/4): "); //menampilkan pesan untuk user memasukan pilihan
            int pilihan = scanner.nextInt(); //program mengambil input dari user menggunakan scanner

            //memakai switch case agar dapat memilih salah satu blok kode sesuai dengan pilihan user
            switch (pilihan) {
                case 1:
                    System.out.println("Saldo Anda = Rp. " + keuangan.getSaldo()); //program akan memanggil nilai dari getter
                    break; //menghentikan eksekusi
            }
        }

    }
}
