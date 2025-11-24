/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mutia
 */

import java.util.Scanner;

public class PendaftaranGYM {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        String lagi;

        System.out.println("===== PENDAFTARAN ANGGOTA GYM =====");

        do {
            System.out.print("Masukkan nama anggota: ");
            String nama = scanner.nextLine();

            total++;

            System.out.print("Daftar anggota lagi? (ya/tidak): ");
            lagi = scanner.nextLine();

        } while (lagi.equalsIgnoreCase("ya"));

        System.out.println("----------------------------------------");
        System.out.println("Total anggota yang didaftarkan: " + total);
    }
}