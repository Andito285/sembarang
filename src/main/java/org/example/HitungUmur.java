package org.example;

import java.util.Scanner;

public class HitungUmur {
    private static final int TAHUN_SEKARANG = 2024;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan tahun lahir Anda: ");
        int tahunLahir = getTahunLahir(scanner);

        int umur = getUmur(tahunLahir);

        getHasil(umur);
        scanner.close();
    }

    private static void getHasil(int umur) {
        System.out.println("Umur Anda adalah: " + umur + " tahun");
    }

    private static int getUmur(int tahunLahir) {
        int umur = getTahunSekarang() - tahunLahir;
        return umur;
    }

    private static int getTahunLahir(Scanner scanner) {
        int tahunLahir = scanner.nextInt();
        return tahunLahir;
    }

    private static int getTahunSekarang() {
        return TAHUN_SEKARANG;
    }
}
