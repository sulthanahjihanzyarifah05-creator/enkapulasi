<h1>ENKAPULASI</h1>
<h4>.</h4>

<h2>1. CLASS STUDENT</h2>
<h4>Program ini merupakan contoh enkapsulasi (encapsulation) dalam pemrograman berorientasi objek (OOP).Kelas Student menyembunyikan (men-private) data sensitif seperti name dan score, 
  serta menyediakan akses terkontrol melalui getter, setter, dan method khusus agar nilai tetap valid (0–100).</h4>
<h3>a. Deklarasi Atribut</h3>
<pre><img width="222" height="59" alt="image" src="https://github.com/user-attachments/assets/48b5637b-7149-4ee5-aaa5-237d72730e3a" /></pre>
<h4>Atribut diset private agar tidak bisa diakses langsung dari luar class. Konsep enkapsulasi, yaitu melindungi data dari manipulasi langsung.</h4>

<h3>b. Konstruktur</h3>
<pre><img width="468" height="97" alt="image" src="https://github.com/user-attachments/assets/173d1a62-c9ea-4693-9f3e-44ead9485f2f" /></pre>
<h4>Constructor digunakan untuk menginisialisasi objek Student.Di sini terdapat validasi nilai, jika score di luar rentang 0–100,
  program melempar exception (IllegalArgumentException), sehingga data tetap aman.</h4>

<h3>c. Getter Dan Setter</h3>
<pre><img width="350" height="68" alt="image" src="https://github.com/user-attachments/assets/a27945bb-3c9d-4f3d-a32d-c1df3090fe7f" /></pre>
<h4>getName() dan getScore() digunakan untuk membaca nilai properti.setName() memungkinkan perubahan nama.Tidak ada setScore()
  karena pengubahan nilai score hanya boleh lewat metode khusus (lihat poin berikut).</h4>

<h3>d. Method Kontrol Nilai</h3>
<pre><img width="535" height="122" alt="image" src="https://github.com/user-attachments/assets/650f6f77-e089-42b2-bce2-fd96837bef13" /></pre>
<h4>Dua method ini digunakan untuk menambah atau mengurangi nilai dengan batas valid.Dengan cara ini, tidak ada risiko nilai menjadi < 0 atau > 100.
  Ini membuat program lebih aman dan konsisten, karena perubahan nilai hanya lewat mekanisme resmi (controlled access).</h4>

<h3>e. Method Tampilan Informasi</h3>
<pre><img width="292" height="59" alt="image" src="https://github.com/user-attachments/assets/70d5fc43-e629-4ca4-9f40-656e9e2f66c8" /></pre>
<h4>Berfungsi untuk menampilkan informasi mahasiswa ke konsol. Dapat digunakan untuk pengecekan hasil input.</h4>

<h2>2. CLASS TEAM</h2>
<h4>Kelas Team berfungsi untuk menyimpan dan mengelola sekelompok objek Student. Disini diterapkan konsep komposisi (composition), di mana Team memiliki (has-a) kumpulan Student.
  Selain itu, program juga menjaga enkapsulasi dengan cara tidak memberikan akses langsung ke struktur data internal (List).</h4>
<h3>a. Deklarasi Atribut</h3>
<pre><img width="229" height="42" alt="image" src="https://github.com/user-attachments/assets/5f5463b8-b302-4572-8116-0d680823fceb" /></pre>
<h4>members menyimpan daftar objek Student.Bertipe List<Student> agar bisa menampung banyak anggota. 
  Dideklarasikan private untuk menjaga enkapsulasi, supaya tidak diubah langsung dari luar kelas.</h4>

<h3>b. Konstruktor</h3>
<pre><img width="224" height="46" alt="image" src="https://github.com/user-attachments/assets/a021899f-d8ce-4731-987c-d1ccaa4148b4" /></pre>
<h4>Konstruktor membuat list kosong (ArrayList) saat objek Team pertama kali dibuat. Ini mencegah NullPointerException ketika menambah anggota.</h4>

<h3>c. Menambahkan Anggota Tim</h3>
<pre><img width="497" height="61" alt="image" src="https://github.com/user-attachments/assets/d122c60e-7573-47ac-b0a9-a5ddb73dabef" /></pre>
<h4>Method ini digunakan untuk menambah anggota baru ke dalam tim. Dilengkapi validasi agar objek Student tidak boleh null, menjaga integritas data tim. 
  Dengan mekanisme ini, hanya data valid yang masuk ke daftar anggota.</h4>

<h3>d. Akses Data Tim dengan Aman</h3>
<pre><img width="229" height="38" alt="image" src="https://github.com/user-attachments/assets/6fbb0f8b-d4ed-40bd-89d5-c82196bfb307" /></pre>
<h4>Mengembalikan salinan (copy) dari list anggota, bukan list asli.Tujuannya agar kode di luar class tidak bisa langsung memodifikasi daftar anggota internal.
  Ini salah satu penerapan defensive copy, bentuk perlindungan data dalam enkapsulasi.</h4>

<h3>e. Menampilkan Anggota Tim</h3>
<pre><img width="512" height="84" alt="image" src="https://github.com/user-attachments/assets/8d5bda65-41f8-4040-a43b-fad19e15938f" /></pre>
<h4>Menampilkan daftar seluruh anggota dengan nama dan nilai ke konsol. Memanfaatkan metode getName() dan getScore() dari kelas Student.</h4>

<h2>3. CLASS IMMUTABLESTUDENT</h2>
<h4>Kelas ImmutableStudent adalah versi tidak dapat diubah (immutable) dari kelas Student. Setelah objek dibuat, nilai dan nama tidak bisa dimodifikasi. 
  Konsep ini sering digunakan untuk menjaga konsistensi data dan keamanan thread (thread-safety).</h4>

<h3>a. Deklarasi Kelas</h3>
<pre><img width="251" height="17" alt="image" src="https://github.com/user-attachments/assets/02feb773-2305-4d4e-ba2b-1e969d015585" /></pre>
<h4>Kata kunci final membuat kelas ini tidak bisa diwariskan (no subclass).Ini penting untuk menjaga agar sifat “immutable”-nya tidak rusak oleh subclass yang menambahkan setter atau perubahan data.</h4>

<h3>b. Atribut Final</h3>
<pre><img width="172" height="29" alt="image" src="https://github.com/user-attachments/assets/b57e81f1-f551-4135-a05d-75f959007ada" /></pre>
<h4>Semua atribut dideklarasikan private dan final. Artinya nilai hanya bisa diisi sekali di constructor saja, tidak bisa diubah setelahnya.
  Ini inti dari konsep immutability.</h4>

<h3>c. Constructor dengan Validasi</h3>
<pre><img width="457" height="101" alt="image" src="https://github.com/user-attachments/assets/47c16164-c2a0-40fc-bdf5-beb662c80481" /></pre>
<h4>Konstruktor memastikan nilai score tetap berada di rentang 0–100. Jika nilai di luar batas, program melempar exception. Ini menjaga agar data dalam objek selalu valid sejak pertama kali dibuat.</h4>

<h3>d. Getter (Tanpa Setter)</h3>
<pre><img width="286" height="26" alt="image" src="https://github.com/user-attachments/assets/de435991-4a3a-4015-a222-fc7f1d90a550" /></pre>
<h4>Hanya ada getter, tanpa setter. Nilai tidak bisa diubah dari luar class, karakteristik utama objek immutable.</h4>

<h3>e. Membuat Objek Baru dengan Nilai Baru</h3>
<pre><img width="329" height="85" alt="image" src="https://github.com/user-attachments/assets/ffa207f0-6ba4-4b0e-a5c2-3b392f6e2b1e" /></pre>
<h4>method ini membuat objek baru dengan nilai score yang diperbarui. Jika hasil penjumlahan melebihi 100 atau kurang dari 0, nilainya akan disesuaikan ke batas terdekat (100 atau 0).
  Dengan cara ini, objek lama tetap tidak berubah, menjaga prinsip immutability.</h4>

<h3>f. Menampilkan Informasi</h3>
<pre><img width="268" height="67" alt="image" src="https://github.com/user-attachments/assets/a54c97b1-2756-4a5b-bf45-22d6b86c4495" /></pre>
<h4>Method sederhana untuk menampilkan data ke konsol</h4>

<h2>4. CLASS MAIN</h2>
<h4>Kelas Main berfungsi sebagai driver class untuk menjalankan dan menguji fungsionalitas dari: 
  ~Student dan Team → versi mutable (data bisa berubah)
  ~ImmutableStudent → versi immutable (data tidak bisa diubah)</h4>

<h3>a. Membuat tiga objek Student</h3>
<pre><img width="400" height="65" alt="image" src="https://github.com/user-attachments/assets/b46ad78e-dc12-451a-bd9a-43db5bd45d1f" /></pre>
<h4>Objek Student ini mutable, jadi nilainya bisa diubah lewat setter jika tersedia</h4>

<h3>b. objek Team dan menambahkan anggota</h3>
<pre><img width="173" height="91" alt="image" src="https://github.com/user-attachments/assets/6a9d2259-c6be-46fb-a97b-de48a8d8da90" /></pre>
<h4>Data dimasukkan ke dalam struktur data (mungkin ArrayList) di dalam Team dan Menampilkan daftar anggota,Output menampilkan semua anggota dan nilai mereka</h4>

<h3>c. objek immutable</h3>
<pre><img width="419" height="41" alt="image" src="https://github.com/user-attachments/assets/6e8a86e8-2c38-436d-b7c4-e4afcadc11bc" /></pre>
<h4>nilai tetap</h4>

<h3>d. Tambah nilai 10</h3>
<pre><img width="290" height="49" alt="image" src="https://github.com/user-attachments/assets/29545a2c-00df-49f5-9927-47fe2199d84b" /></pre>
<h4>im2 adalah objek baru (bukan hasil modifikasi im1). Nilainya menjadi 95, tapi im1 tetap 85.</h4>

<h3>f. Menampilkan Hasil</h3>
<pre><img width="325" height="268" alt="image" src="https://github.com/user-attachments/assets/1a1675e0-9f70-4934-bf07-45ab41c91f74" /></pre>

<h4> 1. Otput Student dan Team</h4>
  <h4>Ini berasal dari method displayTeam() di kelas Team.
  Program menampilkan seluruh anggota tim yang sudah ditambahkan melalui addMember().
  objek Student dapat dimanipulasi dan disimpan bersama dalam satu wadah (Team) yaitu penerapan enkapsulasi dan relasi antar objek (komposisi)</h4>
  <pre><img width="304" height="86" alt="image" src="https://github.com/user-attachments/assets/09f82625-889d-4482-8d07-fc3ec6fca499" /></pre>

<h4>2. Output ImmutableStudent</h4>
 <h4> Ini hasil dari membuat objek ImmutableStudent im1 = new ImmutableStudent("Asep cah bagus", 85);
  Method displayInfo() menampilkan nama dan nilai awalnya, yaitu Asep cah bagus (85).</h4>
  <pre><img width="240" height="47" alt="image" src="https://github.com/user-attachments/assets/90010bf2-d244-4b3b-ae04-fbeea85511f2" /></pre>

<h4>Di sini program memanggil withAddedScore(10).Tapi karena ImmutableStudent tidak bisa diubah (immutable), method ini tidak mengubah objek im1,
  melainkan membuat objek baru (im2) dengan nilai 85 + 10 = 95. Saat im2.displayInfo() dijalankan, yang tampil adalah versi baru (nilai 95). </h4>
  <pre><img width="183" height="48" alt="image" src="https://github.com/user-attachments/assets/fa14ffab-874b-4e60-88e6-468fe165b220" /></pre>

<h4>Baris ini menunjukkan bahwa objek im1 tetap memiliki nilai 85, walaupun kita sudah “menambah nilai”. Ini membuktikan prinsip immutability (objek tidak dapat diubah setelah dibuat).</h4>
<pre><img width="302" height="59" alt="image" src="https://github.com/user-attachments/assets/eb6f6c68-7d2c-4ff6-a8a1-e5f6eb688de3" /></pre>

<h4>ImmutableStudent melindungi data agar tidak bisa diubah secara langsung. Setiap perubahan menghasilkan objek baru, bukan memodifikasi yang lama.
  Hal ini berguna untuk keamanan data dan mencegah efek samping dalam program besar.</h4>


