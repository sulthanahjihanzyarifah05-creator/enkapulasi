<h1>ENKAPULASI</h1>
<h4>Program ini merupakan contoh enkapsulasi (encapsulation) dalam pemrograman berorientasi objek (OOP).Kelas Student menyembunyikan (men-private) data sensitif seperti name dan score, 
  serta menyediakan akses terkontrol melalui getter, setter, dan method khusus agar nilai tetap valid (0–100).</h4>
<h2>CLASS STUDENT</h2>

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
