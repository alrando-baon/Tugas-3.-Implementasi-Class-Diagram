# Tugas-3.-Implementasi-Class-Diagram
Implementasi Class Diagram dan cuplikan program
            Nama dan NIM Anggota Kelompok
            

## Penjelasan Program

Program ini merupakan simulasi sederhana dari sebuah game RPG (Role-Playing Game) yang dibuat menggunakan konsep **Object-Oriented Programming (OOP)** dalam bahasa Java.

Program terdiri dari beberapa class yang saling berhubungan, yaitu:

### 1. Game_RPG
Class ini berfungsi sebagai pengelola utama game.
- Menyimpan informasi seperti judul dan versi game
- Mengelola data player dan character
- Memiliki method:
  - `Manages()` → mengatur resource game
  - `Maintains()` → menjaga kondisi game
  - `save_progres()` → menyimpan progres permainan

---

### 2. Character
Merupakan class dasar (superclass) untuk semua karakter dalam game.
- Memiliki atribut dasar seperti tipe karakter
- Method:
  - `Used()` → menandakan karakter digunakan
  - `Appearance()` → mengatur tampilan karakter

---

### 3. Player
Class turunan dari Character yang merepresentasikan pemain.
- Atribut:
  - Nama, Level, Health, Attack
- Method:
  - `Move()` → pergerakan player
  - `AttackEnemy()` → menyerang musuh
  - `useItem()` → menggunakan item

---

### 4. Enemy
Class turunan dari Character yang merepresentasikan musuh.
- Atribut:
  - Bot (nama musuh), Health
- Method:
  - `method(String type)` → menampilkan tipe musuh

---

### 5. Battle
Class yang mengatur proses pertarungan.
- Method:
  - `StartBattle()` → memulai pertarungan
  - `Endbattle()` → mengakhiri pertarungan

---

### 6. Map
Class yang merepresentasikan peta permainan.
- Atribut:
  - Nama map, ukuran
- Method:
  - `loadMap()` → memuat peta

---

### 7. Inventory
Class untuk menyimpan item milik player.
- Atribut:
  - Kapasitas inventory
- Method:
  - `addItem()` → menambah item
  - `Removeitem()` → menghapus item

---

### 8. Item
Class yang merepresentasikan item dalam game.
- Atribut:
  - Nama item, tipe, efek
- Method:
  - `use()` → menggunakan item

---

### 9. Main
Merupakan class utama yang menjalankan program.
Alur program:
1. Membuat objek game
2. Membuat player dan enemy
3. Memuat map
4. Memulai battle
5. Player bergerak dan menyerang
6. Battle selesai
7. Progress disimpan

---

## 🔄 Alur Singkat Program
Program dimulai dari class `Main`, kemudian:
- Game diinisialisasi
- Player dan enemy dibuat
- Map dimuat
- Pertarungan dimulai
- Player melakukan aksi (move & attack)
- Pertarungan selesai
- Progress game disimpan
