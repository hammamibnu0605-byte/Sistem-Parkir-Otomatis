Penjelasan Singkat Tema Proyek

Sistem Parkir Otomatis adalah program berbasis konsol sederhana yang digunakan untuk mencatat kendaraan yang masuk dan keluar area parkir.
Aplikasi ini menerapkan konsep Pemrograman Berorientasi Objek (PBO) seperti kelas, objek, konstruktor, metode dengan parameter & return, variabel statis, looping, kondisi, manipulasi string, hingga penanganan pengecualian (try-catch).

Program ini dapat:
Mencatat kendaraan yang masuk.
Menghapus data kendaraan yang keluar.
Menghitung biaya parkir berdasarkan jenis kendaraan dan lama waktu.
Menampilkan total pendapatan parkir.

Struktur & Desain Kelas
Paket dan Kelas
src/
└── main/
    └── java/
        └── com/
            └── mycompany/
                └── kasirwarkoptepan/
                    ├── app/
                    │   └── Main.java
                    ├── exception/
                    │   └── ValidationException.java
                    ├── model/
                    │   ├── Kendaraan.java
                    │   └── ParkirItem.java
                    └── service/
                        └── ParkirService.java

Diagram Kelas
+------------------+
|     Kendaraan    |
+------------------+
| - platNomor      |
| - jenis          |
+------------------+
| + getPlatNomor() |
| + getJenis()     |
+------------------+

        1
        |
        | has
        v
+------------------+
|    ParkirItem    |
+------------------+
| - kendaraan      |
| - waktuMasuk     |
| - waktuKeluar    |
| - biaya          |
+------------------+
| + setBiaya()     |
| + getBiaya()     |
+------------------+

        *
        |
        | contains
        v
+------------------+
|  ParkirService   |
+------------------+
| - daftarParkir[] |
| - totalPendapatan|
+------------------+
| + kendaraanMasuk()|
| + kendaraanKeluar()|
| + lihatDaftarParkir()|
| + getTotalPendapatan()|
+------------------+

+-------------------------+
|     ValidationException |
+-------------------------+
|  extends RuntimeException|
+-------------------------+

Contoh Penggunaan Program
Output di Konsol
=== SISTEM PARKIR OTOMATIS ===
1. Kendaraan Masuk
2. Kendaraan Keluar
3. Daftar Kendaraan
4. Total Pendapatan
0. Keluar
Pilih menu: 1

Plat Nomor: B1234XYZ
Jenis (1=Motor, 2=Mobil): 2
Kendaraan B1234XYZ berhasil masuk parkir.

Pilih menu: 3
Daftar Kendaraan yang sedang parkir:
- Plat: B1234XYZ | Jenis: Mobil

Pilih menu: 2
Plat Nomor: B1234XYZ
Kendaraan B1234XYZ keluar. Durasi: 1 jam. Biaya: Rp 5000

Pilih menu: 4
Total Pendapatan: Rp 5000

Tautan Video Penjelasan
Video YouTube Penjelasan Proyek:
"....................."

Cara Menjalankan Program
1. Clone repositori
   git clone https://github.com/hammamibnu0605-byte/Sistem-Parkir-Otomatis.git
2. Masuk ke folder proyek
   cd Sistem-Parkir-Otomatis
3. Kompilasi program
   javac -d bin src/main/java/com/mycompany/kasirwarkoptepan/**/*.java
4. Jalankan program
   java -cp bin com.mycompany.kasirwarkoptepan.app.Main

Konsep PBO yang Diterapkan
Konsep	Implementasi
Kelas & Objek:	Kendaraan, ParkirItem, ParkirService
Konstruktor:	Inisialisasi data kendaraan dan item parkir
Metode dengan Parameter & Return:	kendaraanMasuk(), kendaraanKeluar()
Variabel Statis & Konstanta:	totalPendapatan (statis)
Kondisional:	if-else, switch-case
Looping:	Menampilkan daftar kendaraan parkir
Manipulasi String:	Pencocokan plat nomor & format teks
Array/List:	Menyimpan daftar kendaraan parkir
Try-Catch:	Menangani kesalahan input dan validasi

Pengembang

Nama: Hammam Ibnu
Proyek: Praktikum PBO — Sistem Parkir Otomatis
Tahun: 2025
