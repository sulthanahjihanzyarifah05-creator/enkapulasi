<h1>ENKAPULASI</h1>
<h4>.</h4>

<h2>1. CLASS STUDENT</h2>
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

<h2>2. CLASS TEAM</h2>
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

<h2>3. CLASS IMMUTABLESTUDENT</h2>
<h4>Kelas ImmutableStudent adalah versi tidak dapat diubah (immutable) dari kelas Student. Setelah objek dibuat, nilai dan nama tidak bisa dimodifikasi. 
  Konsep ini sering digunakan untuk menjaga konsistensi data dan keamanan thread (thread-safety).</h4>

<h3>Deklarasi Kelas</h3>
<pre><img width="251" height="17" alt="image" src="https://github.com/user-attachments/assets/02feb773-2305-4d4e-ba2b-1e969d015585" /></pre>
<h4>Kata kunci final membuat kelas ini tidak bisa diwariskan (no subclass).Ini penting untuk menjaga agar sifat “immutable”-nya tidak rusak oleh subclass yang menambahkan setter atau perubahan data.</h4>

<h3>Atribut Final</h3>
<pre><img width="172" height="29" alt="image" src="https://github.com/user-attachments/assets/b57e81f1-f551-4135-a05d-75f959007ada" /></pre>
<h4>Semua atribut dideklarasikan private dan final. Artinya nilai hanya bisa diisi sekali di constructor saja, tidak bisa diubah setelahnya.
  Ini inti dari konsep immutability.</h4>

<h3>Constructor dengan Validasi</h3>
<pre><img width="457" height="101" alt="image" src="https://github.com/user-attachments/assets/47c16164-c2a0-40fc-bdf5-beb662c80481" /></pre>
<h4>Konstruktor memastikan nilai score tetap berada di rentang 0–100. Jika nilai di luar batas, program melempar exception. Ini menjaga agar data dalam objek selalu valid sejak pertama kali dibuat.</h4>

<h3>Getter (Tanpa Setter)</h3>
<pre><img width="286" height="26" alt="image" src="https://github.com/user-attachments/assets/de435991-4a3a-4015-a222-fc7f1d90a550" /></pre>
<h4>Hanya ada getter, tanpa setter. Nilai tidak bisa diubah dari luar class, karakteristik utama objek immutable.</h4>

<h3>Membuat Objek Baru dengan Nilai Baru</h3>
<pre><img width="329" height="85" alt="image" src="https://github.com/user-attachments/assets/ffa207f0-6ba4-4b0e-a5c2-3b392f6e2b1e" /></pre>
<h4>method ini membuat objek baru dengan nilai score yang diperbarui. Jika hasil penjumlahan melebihi 100 atau kurang dari 0, nilainya akan disesuaikan ke batas terdekat (100 atau 0).
  Dengan cara ini, objek lama tetap tidak berubah, menjaga prinsip immutability.</h4>

<h3>Menampilkan Informasi</h3>
<pre><img width="268" height="67" alt="image" src="https://github.com/user-attachments/assets/a54c97b1-2756-4a5b-bf45-22d6b86c4495" /></pre>
<h4>Method sederhana untuk menampilkan data ke konsol</h4>
