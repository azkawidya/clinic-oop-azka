/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Unguided;
import Unguided.entities.*;
import java.util.Date;
/**
 *
 * @author AZKA_WIDYA
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek Doctor
        Doctor doctor = new Doctor("D-001", "Dr. Jake", "Cardiology");

        // Membuat dua objek Patient
        Patient patient1 = new Patient("P-101", "Jonathan Dean", "Hypertension");
        Patient patient2 = new Patient("P-102", "Rory Anastasha", "Diabetes");

        // Membuat objek Appointment untuk masing-masing pasien
        Appointment appointment1 = new Appointment(doctor, patient1, new Date());
        Appointment appointment2 = new Appointment(doctor, patient2, new Date());

        // Menampilkan informasi dokter
        System.out.println("Doctor: " + doctor.getName() + " (" + doctor.getSpecialty() + ")");

        // Menampilkan informasi pasien
        System.out.println("Patient 1: " + patient1.getName() + " (Diagnosis: " + patient1.getDiagnosis() + ")");
        System.out.println("Patient 2: " + patient2.getName() + " (Diagnosis: " + patient2.getDiagnosis() + ")");

        // Menampilkan informasi jadwal temu
        System.out.println("Appointment 1 Date: " + appointment1.getDate());
        System.out.println("Appointment 2 Date: " + appointment2.getDate());

        // Menampilkan total jumlah diagnosis
        System.out.println("Total Diagnoses: " + Patient.getDiagnosisCount());
    }
}
