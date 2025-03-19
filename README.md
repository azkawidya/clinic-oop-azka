<h1 align="center">Clinic Management System</h1>

Clinic Management System adalah aplikasi berbasis Java OOP yang digunakan untuk mengelola **Doctor, Patient, dan Appointment** di sebuah klinik. Program ini menggunakan prinsip **encapsulation**, **class relationships**, dan **structured packages** untuk memastikan data tetap terorganisir dan mudah dikelola.  

### **Key Features**  
- **Doctor Management**: Menyimpan data dokter, termasuk ID, nama, dan spesialisasi.  
- **Patient Management**: Merekam informasi pasien, termasuk ID, nama, dan diagnosis.  
- **Appointment Scheduling**: Menjadwalkan janji temu antara dokter dan pasien.  
- **Data Validation**: Memastikan ID dokter dan pasien sesuai format yang benar.  
- **Diagnosis Counter**: Menghitung jumlah total diagnosis yang telah dicatat.  

---

## **Project Structure**  
```
clinic-oop-azka/
├── src/
│   ├── Guided/             
│   ├── Unguided/           
│   │   ├── entities/       
│   │   │   ├── Doctor.java       
│   │   │   ├── Patient.java     
│   │   │   ├── Appointment.java  
│   │   │   ├── DataChecker.java  
│   ├── Main.java           
└── README.md 
```

---

### **1. Doctor.java**  
Menyimpan informasi tentang dokter yang bekerja di klinik.  
- `id` → ID dokter (format: D-XXX).  
- `name` → Nama dokter.  
- `specialty` → Spesialisasi dokter.  

**Metode:**  
- `getId()`: Mengembalikan ID dokter.  
- `getName()`: Mengembalikan nama dokter.  
- `getSpecialty()`: Mengembalikan spesialisasi dokter.  
---

### **2. Patient.java**  
Mengelola informasi pasien dan diagnosis yang diberikan oleh dokter.  
- `id` → ID pasien (format: P-XXX).  
- `name` → Nama pasien.  
- `diagnosis` → Diagnosis pasien.  
- `diagnosisCount` → Menghitung jumlah diagnosis yang dibuat.  

**Metode:**  
- `getId()`: Mengembalikan ID pasien.  
- `getName()`: Mengembalikan nama pasien.  
- `getDiagnosis()`: Mengembalikan diagnosis pasien.  
- `getDiagnosisCount()`: Mengembalikan jumlah total diagnosis yang telah dicatat.  
---

### **3. Appointment.java**  
Menghubungkan dokter dan pasien dalam sistem janji temu.  
- `doctor` → Dokter yang menangani pasien.  
- `patient` → Pasien yang memiliki janji temu.  
- `date` → Tanggal janji temu.  

**Metode:**  
- `getDoctor()`: Mengembalikan dokter dalam janji temu.  
- `getPatient()`: Mengembalikan pasien dalam janji temu.  
- `getDate()`: Mengembalikan tanggal janji temu.  

---

### **4. DataChecker.java**  
Memvalidasi data sebelum digunakan dalam sistem.  
- `isValidId(String id)`: Memeriksa apakah ID sesuai format yang benar (`D-XXX` atau `P-XXX`).  
- `isValidName(String name)`: Memeriksa apakah nama hanya berisi huruf dan spasi.  

---

### **5. Main.java**  
Mengatur jalannya sistem klinik dengan menyediakan fitur-fitur utama.  
- Meregistrasi dokter dan pasien.  
- Memvalidasi data pasien sebelum diproses.  
- Menjadwalkan janji temu antara pasien dan dokter.  
- Menampilkan daftar dokter, pasien, janji temu, serta total diagnosis.  

---
### **Output:**  

![image](https://github.com/user-attachments/assets/978c9a84-8041-4712-82b0-821e22b00441)

Pada output ini, ditampilkan informasi seorang dokter bernama **Dr. Jake** yang memiliki spesialisasi di bidang **kardiologi**. Selain itu, sistem juga mencatat dua pasien, yaitu **Jonathan Dean** yang didiagnosis dengan **hipertensi** dan **Rory Anastasha** yang didiagnosis dengan **diabetes**.  Selanjutnya, program menampilkan jadwal janji temu untuk kedua pasien tersebut. Janji temu ini tercatat pada **Rabu, 19 Maret 2025 pukul 20:21:21 WIB**, yang menunjukkan bahwa sistem dapat mencatat dan menampilkan waktu dengan format yang jelas. Selain itu, sistem juga menghitung jumlah total diagnosis yang telah diberikan dokter, yaitu sebanyak dua diagnosis sesuai dengan jumlah pasien yang terdaftar.  

---
### **Kesimpulan**  


Sistem ini memastikan bahwa setiap data pasien terverifikasi dan tervalidasi sebelum diproses, sehingga mencegah kesalahan input data melalui mekanisme validasi yang terstruktur. Dengan output yang terorganisir dengan baik, sistem ini menyajikan informasi dokter, termasuk nama dan spesialisasi, serta data pasien seperti nama dan diagnosis dengan jelas. Fitur **Appointment** mencatat tanggal dan waktu konsultasi secara akurat, memastikan bahwa setiap interaksi dokter-pasien terdokumentasi dengan baik. Selain itu, **Diagnosis Counter** secara otomatis mencatat jumlah diagnosis yang telah diberikan. Sistem ini menjaga keamanan data dengan membatasi akses langsung ke informasi pasien yang sensitif dengan menerapkan prinsip **Object-Oriented Programming (OOP)**, **encapsulation**, **class relationships**, dan **structured packages**.
