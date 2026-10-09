# Latihan Pewarisan (Inheritance); Bentuk, BujurSangkar, Lingkaran, Silinder
Latihan tentang pewarisan kelas (Exercise 1, 2, dan 3).

## Hierarki Kelas
Bentuk
├── BujurSangkar
└── Lingkaran
    └── Silinder

## Daftar Kelas

| Kelas | Induk | Atribut | Method utama |
|---|---|---|---|
| `Bentuk` | - | `warna` | `getWarna()`, `setWarna()`, `printInfo()` |
| `BujurSangkar` | `Bentuk` | `sisi` | `getSisi()`, `setSisi()`, `hitungLuas()`, `printInfo()` |
| `Lingkaran` | `Bentuk` | `radius`, `PHI` (konstanta kelas) | `getRadius()`, `setRadius()`, `hitungLuas()`, `printInfo()` |
| `Silinder` | `Lingkaran` | `tinggi` | `getTinggi()`, `setTinggi()`, `hitungVolume()`, `printInfo()` |

## Format Output `printInfo()`
- Bentuk: `Bentuk berwarna [warna]`
- BujurSangkar: `Bujursangkar berwarna [warna], luas = [luas]`
- Lingkaran: `Lingkaran [warna], luas = [luas]`
- Silinder: `Silinder warna [warna], volume = [volume]`

## Contoh Output
Bentuk berwarna merah
Bujursangkar berwarna biru, luas = 25.0
Lingkaran hijau, luas = 153.93804002589985
Silinder warna kuning, volume = 1539.3804002589986
Bujursangkar berwarna hitam, luas = 64.0

## Struktur File
.
├── Bentuk.java
├── BujurSangkar.java
├── Lingkaran.java
├── Silinder.java
├── Main.java        # program demo
└── README.md