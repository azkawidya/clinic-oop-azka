/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided.entities;
import java.util.Date;
/**
 *
 * @author AZKA_WIDYA
 */
public class Appointment {
    private Doctor doctor; // Dokter yang menangani janji temu
    private Patient patient; // Pasien yang memiliki janji temu
    private Date date; // Tanggal janji temu
    
    // Konstruktor untuk inisialisasi objek Appointment
    public Appointment(Doctor doctor, Patient patient, Date date) {
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
    }
    
    // Getter untuk mendapatkan objek dokter yang terlibat dalam appointment
    public Doctor getDoctor() {
        return doctor;
    }
    
    // Getter untuk mendapatkan objek pasien yang terlibat dalam appointment
    public Patient getPatient() {
        return patient;
    }
    
    // Getter untuk mendapatkan tanggal appointment
    public Date getDate() {
        return date;
    }
}
