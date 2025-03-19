/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided.entities;

/**
 *
 * @author AZKA_WIDYA
 */
public class Patient {
    private String id;             // ID unik pasien
    private String name;           // Nama pasien
    private String diagnosis;      // Diagnosis pasien
    private static int diagnosisCount = 0; // Menghitung total diagnosis pasien
    
    // Konstruktor untuk inisialisasi objek Patient
    public Patient(String id, String name, String diagnosis) {
        this.id = id;
        this.name = name;
        this.diagnosis = diagnosis;
        // Menambah diagnosis counter setiap kali pasien dibuat
        diagnosisCount++; 
    }
    
    // Getter untuk mendapatkan ID pasien
    public String getId() {
        return id;
    }
    
    // Getter untuk mendapatkan nama pasien
    public String getName() {
        return name;
    }
    
    // Getter untuk mendapatkan diagnosis pasien
    public String getDiagnosis() {
        return diagnosis;
    }
    
    // Method untuk mendapatkan total jumlah diagnosis
    public static int getDiagnosisCount() {
        return diagnosisCount;
    }
}
