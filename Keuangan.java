public class Keuangan {
    private int saldo; //variabel saldo yang di deklarasikan menggunakan tipe data int (enkapsulasi)

    //konstruktor mengatur nilai saldo sesuai dengan parameternya, parameternya yaitu saldoAwal
    public Keuangan(int saldoAwal) {
        this.saldo = saldoAwal;
    }

    //metode getter untuk mengambil nilai dari suatu variabel object (saldo) di luar class
    public int getSaldo() {
        return saldo;
    }

    //metode untuk memodifikasi, disini berarti menambahkan nilai dari variabel object (saldo)
    public void tambahPemasukan(int jumlahPemasukan) {
        saldo += jumlahPemasukan;
    }
}
