/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided.entities;

/**
 *
 * @author AZKA_WIDYA
 */
public class Doctor {
    private String id;          // ID unik dokter
    private String name;        // Nama dokter
    private String specialty;   // Spesialisasi dokter
    
    // Konstruktor untuk inisialisasi objek Doctor
    public Doctor(String id, String name, String specialty) {
        this.id = id;
        this.name = name;
        this.specialty = specialty;
    }
    
    // Getter untuk mendapatkan ID dokter
    public String getId() {
        return id;
    }
    
    // Getter untuk mendapatkan nama dokter
    public String getName() {
        return name;
    }
    
    // Getter untuk mendapatkan spesialisasi dokter
    public String getSpecialty() {
        return specialty;
    }
}
