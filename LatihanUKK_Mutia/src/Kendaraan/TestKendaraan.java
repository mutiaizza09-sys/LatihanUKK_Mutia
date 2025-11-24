/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kendaraan;

/**
 *
 * @author Mutia
 */
public class TestKendaraan {
    public static void main(String[] args) {
        Kendaraan kendaraan= new Kendaraan();
        
        kendaraan.setNoPolisi("M 2509 BP");
        kendaraan.setMerk("Ferrari");
        kendaraan.setTahun(2025);
        
        System.out.println("=====Data Kendaraan");
        System.out.println("No.polisi : " + kendaraan.getNoPolisi());
        System.out.println("Merk Mobil: " + kendaraan.getMerk());
        System.out.println("Tahun     : " + kendaraan.getTahun());
    }
}
