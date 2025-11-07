<h1>ENKAPULASI</h1>
<h4>.</h4>

<h2>CLASS STUDENT</h2>
<h4>Program ini merupakan contoh enkapsulasi (encapsulation) dalam pemrograman berorientasi objek (OOP).Kelas Student menyembunyikan (men-private) data sensitif seperti name dan score, 
  serta menyediakan akses terkontrol melalui getter, setter, dan method khusus agar nilai tetap valid (0–100).</h4>
<h3>Deklarasi Atribut</h3>
<pre><img width="222" height="59" alt="image" src="https://github.com/user-attachments/assets/48b5637b-7149-4ee5-aaa5-237d72730e3a" /></pre>
<h4>Atribut diset private agar tidak bisa diakses langsung dari luar class. Konsep enkapsulasi, yaitu melindungi data dari manipulasi langsung.</h4>

<h3>Konstruktur</h3>
<pre><img width="468" height="97" alt="image" src="https://github.com/user-attachments/assets/173d1a62-c9ea-4693-9f3e-44ead9485f2f" /></pre>
<h4>Constructor digunakan untuk menginisialisasi objek Student.Di sini terdapat validasi nilai, jika score di luar rentang 0–100,
  program melempar exception (IllegalArgumentException), sehingga data tetap aman.</h4>

<h3>Getter Dan Setter</h3>
<pre><img width="350" height="68" alt="image" src="https://github.com/user-attachments/assets/a27945bb-3c9d-4f3d-a32d-c1df3090fe7f" /></pre>
<h4>getName() dan getScore() digunakan untuk membaca nilai properti.setName() memungkinkan perubahan nama.Tidak ada setScore()
  karena pengubahan nilai score hanya boleh lewat metode khusus (lihat poin berikut).</h4>

<h3>Method Kontrol Nilai</h3>
<pre><img width="535" height="122" alt="image" src="https://github.com/user-attachments/assets/650f6f77-e089-42b2-bce2-fd96837bef13" /></pre>
<h4>Dua method ini digunakan untuk menambah atau mengurangi nilai dengan batas valid.Dengan cara ini, tidak ada risiko nilai menjadi < 0 atau > 100.
  Ini membuat program lebih aman dan konsisten, karena perubahan nilai hanya lewat mekanisme resmi (controlled access).</h4>

<h3>Method Tampilan Informasi</h3>
<pre><img width="292" height="59" alt="image" src="https://github.com/user-attachments/assets/70d5fc43-e629-4ca4-9f40-656e9e2f66c8" /></pre>
<h4>Berfungsi untuk menampilkan informasi mahasiswa ke konsol. Dapat digunakan untuk pengecekan hasil input.</h4>

<h2>CLASS TEAM</h2>
<h4>Kelas Team berfungsi untuk menyimpan dan mengelola sekelompok objek Student. Disini diterapkan konsep komposisi (composition), di mana Team memiliki (has-a) kumpulan Student.
  Selain itu, program juga menjaga enkapsulasi dengan cara tidak memberikan akses langsung ke struktur data internal (List).</h4>
<h3>Deklarasi Atribut</h3>
<pre><img width="229" height="42" alt="image" src="https://github.com/user-attachments/assets/5f5463b8-b302-4572-8116-0d680823fceb" /></pre>
<h4>members menyimpan daftar objek Student.Bertipe List<Student> agar bisa menampung banyak anggota. 
  Dideklarasikan private untuk menjaga enkapsulasi, supaya tidak diubah langsung dari luar kelas.</h4>

<h3>Konstruktor</h3>
<pre><img width="224" height="46" alt="image" src="https://github.com/user-attachments/assets/a021899f-d8ce-4731-987c-d1ccaa4148b4" /></pre>
<h4>Konstruktor membuat list kosong (ArrayList) saat objek Team pertama kali dibuat. Ini mencegah NullPointerException ketika menambah anggota.</h4>

<h3>Menambahkan Anggota Tim</h3>
<pre><img width="497" height="61" alt="image" src="https://github.com/user-attachments/assets/d122c60e-7573-47ac-b0a9-a5ddb73dabef" /></pre>
<h4>Method ini digunakan untuk menambah anggota baru ke dalam tim. Dilengkapi validasi agar objek Student tidak boleh null, menjaga integritas data tim. 
  Dengan mekanisme ini, hanya data valid yang masuk ke daftar anggota.</h4>

<h3>Akses Data Tim dengan Aman</h3>
<pre><img width="229" height="38" alt="image" src="https://github.com/user-attachments/assets/6fbb0f8b-d4ed-40bd-89d5-c82196bfb307" /></pre>
<h4>Mengembalikan salinan (copy) dari list anggota, bukan list asli.Tujuannya agar kode di luar class tidak bisa langsung memodifikasi daftar anggota internal.
  Ini salah satu penerapan defensive copy, bentuk perlindungan data dalam enkapsulasi.</h4>

<h3>Menampilkan Anggota Tim</h3>
<pre><img width="512" height="84" alt="image" src="https://github.com/user-attachments/assets/8d5bda65-41f8-4040-a43b-fad19e15938f" /></pre>
<h4>Menampilkan daftar seluruh anggota dengan nama dan nilai ke konsol. Memanfaatkan metode getName() dan getScore() dari kelas Student.</h4>
