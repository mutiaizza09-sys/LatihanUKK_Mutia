/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perusahaan;

/**
 *
 * @author Mutia
 */
public class Karyawan {
    
    private String nip;
    private String nama;
    private String divisi;

    public void setNIP(String nip) {
        this.nip = nip;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setDivisi(String divisi) {
        this.divisi = divisi;
    }

    public String getNIP() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public String getDivisi() {
        return divisi;
    }
}