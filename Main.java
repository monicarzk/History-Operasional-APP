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
            int pilihan = scanner.nextInt(); //program mengambil input dari user pake scanner

            //memakai switch case agar dapat memilih salah satu blok kode sesuai dengan pilihan user
            switch (pilihan) {
                case 1:
                    System.out.println("Saldo Anda = Rp. " + keuangan.getSaldo()); //program akan memanggil nilai dari getter
                    break; //menghentikan eksekusi dari blok kode case 1
                case 2:
                    System.out.print("Masukkan jumlah pemasukan: Rp. ");
                    int jumlahPemasukan = scanner.nextInt(); //mengambil input angka yang dimasukan user pake scanner
                    keuangan.tambahPemasukan(jumlahPemasukan); //program akan memanggil metode tambahPemasukan di objek keuangan
                    System.out.println("Pemasukan = Rp. " + jumlahPemasukan); //mencetak jumlah pemasukan
                    break; //menghentikan eksekusi dari blok kode case 2
                case 3:
                    System.out.print("Masukkan jumlah pengeluaran: Rp. ");
                    int jumlahPengeluaran = scanner.nextInt(); //mengambil input angka yang dimasukan user pake scanner
                    //menggunakan metode if - else karena jika kondisi true maka bloke kode akan dijalankan jika false maka else yg akan dijalankan
                    if (keuangan.kurangiPengeluaran(jumlahPengeluaran)) { //program akan memanggil metode kurangiPengeluaran di objek keuangan
                        System.out.println("Pengeluaran = Rp. " + jumlahPengeluaran); //run jika kondisi true
                    } else {
                        System.out.println("Saldo tidak mencukupi untuk melakukan pengeluaran."); //run jika kondisi false
                    }
                    break; //menghentikan eksekusi dari blok kode case 3
                case 4:
                    System.out.println("See you next time");
                    scanner.close(); //perintah untuk menutup objek scanner
                    System.exit(0); //perintah untuk mengakhiri program java, nilai 0 artinya program berakhir tanpa masalah
                default:
                    //pesan ini memberitahu user bahwa inputnya gak ada yang cocok sama 4 kasus yang diatas maka disarankan untuk memilih lagi
                    //di default ini programnya masih jalan belum ke exit
                    System.out.println("Pilihan tidak valid. Silakan pilih 1, 2, 3, atau 4.");
            }
        }

    }
}
