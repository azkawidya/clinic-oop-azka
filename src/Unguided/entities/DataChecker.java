/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided.entities;

/**
 *
 * @author AZKA_WIDYA
 */
public class DataChecker {
    public static boolean isValidId(String id) {
        if (id == null || id.isEmpty()) { // Jika ID kosong atau null, langsung dianggap tidak valid
            return false;
        }
        return id.matches("D-\\d{3}|P-\\d{3}"); // Memeriksa apakah ID sesuai dengan pola yang diizinkan
    }
    
    /**
     * Memeriksa apakah nama hanya mengandung huruf dan spasi.
     * Nama tidak boleh mengandung angka atau karakter khusus.
     * @param name Nama yang akan diperiksa.
     * @return true jika nama valid, false jika mengandung angka atau karakter lain.
     */
    public static boolean isValidName(String name) {
        return name != null && name.matches("[A-Za-z ]+"); 
    }
}
