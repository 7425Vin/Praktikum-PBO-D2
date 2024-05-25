## Praktikum PBO D2
- Nama : Vincentius Setyawan Widyahadi
- NIM  : 24060122120006

path proyek 1:
Prak10/Modul/Gui/src/main/java

path proyek 2:
Prak10/Modul/GuiProyek2/src/main/java

path proyek 3:
Prak10/Modul/GuiProyek3/src/main/java

path proyek 4:
Prak10/Modul/GuiProyek4/src/main/java

## 'List'
**Karakteristik:**

* **'List'** adalah koleksi yang terurut dan mengizinkan elemen duplikat.
* Mempertahankan urutan penyisipan.
* Elemen dapat diakses dengan indeks integer.

**Kelebihan:**

* Mudah digunakan ketika Anda perlu mempertahankan urutan elemen tertentu.
* Mengizinkan duplikat, yang berguna dalam banyak skenario di mana elemen yang sama dapat muncul beberapa kali.
* Menyediakan akses terindeks ke elemen, membuatnya efisien untuk mengambil elemen di posisi tertentu.

**Kekurangan:**

* Dapat berisi elemen duplikat, yang mungkin tidak diinginkan dalam aplikasi tertentu.
* Pencarian elemen bisa lebih lambat dibandingkan dengan set jika list besar dan tidak terurut.

## 'Set'
**Karakteristik:**

* **'Set'** adalah koleksi yang tidak terurut dan tidak mengizinkan elemen duplikat.
* Sering digunakan untuk memastikan bahwa koleksi tidak mengandung duplikat.
* Implementasi berbasis hash (seperti **'HashSet'**) menyediakan kinerja waktu konstan untuk operasi dasar (tambah, hapus, cek).

**Kelebihan:**

* Secara otomatis mencegah duplikat, yang berguna ketika Anda memerlukan koleksi elemen unik.
* Umumnya menyediakan pencarian lebih cepat dibandingkan dengan list karena sifat hash-nya.

**Kekurangan:**

* Tidak mempertahankan urutan; urutan elemen tidak dijamin.
* Tidak dapat mengakses elemen dengan indeks, yang dapat membuat operasi tertentu lebih rumit.

## 'Map'
**Karakteristik:**

* **'Map'** adalah koleksi pasangan kunci-nilai, di mana setiap kunci unik.
* Memetakan kunci ke nilai, memungkinkan pengambilan nilai yang cepat berdasarkan kunci yang terkait.
* Urutan elemen tidak dijamin dalam **'HashMap'** (meskipun ada implementasi berurutan seperti **'LinkedHashMap'**).

**Kelebihan:**

* Menyediakan akses berbasis kunci yang efisien ke nilai.
* Berguna untuk array asosiatif atau kamus, di mana Anda perlu mengasosiasikan kunci unik dengan nilai tertentu.

**Kekurangan:**

* Kunci harus unik, sehingga tidak bisa menyimpan beberapa nilai untuk kunci yang sama tanpa menggunakan koleksi sebagai nilai.
* Tidak mempertahankan urutan kunci (kecuali menggunakan implementasi berurutan tertentu).
