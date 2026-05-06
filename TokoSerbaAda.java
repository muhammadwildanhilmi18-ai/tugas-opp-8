/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author muham
 */
import java.util.Scanner;

public class TokoSerbaAda {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("TOKO SERBA ADA");
        System.out.println("**********************");

        System.out.print("Masukkan Item Barang : ");
        int n = input.nextInt();

        String[] kode = new String[n];
        String[] nama = new String[n];
        int[] harga = new int[n];
        int[] jumlah = new int[n];
        int[] bayar = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nData ke " + (i + 1));

            System.out.print("Masukkan Kode        : ");
            kode[i] = input.next();

            System.out.print("Masukkan Jumlah Beli : ");
            jumlah[i] = input.nextInt();

            switch (kode[i]) {
                case "a001":
                    nama[i] = "Buku";
                    harga[i] = 3000;
                    break;
                case "a002":
                    nama[i] = "Pensil";
                    harga[i] = 4000;
                    break;
                case "a003":
                    nama[i] = "Pulpen";
                    harga[i] = 5000;
                    break;
                default:
                    nama[i] = "Tidak Ada";
                    harga[i] = 0;
            }

            bayar[i] = harga[i] * jumlah[i];
        }

        System.out.println("\nTOKO SERBA ADA");
        System.out.println("======================================================================");
        System.out.printf("%-3s %-6s %-15s %-10s %-12s %-12s\n",
                "No", "Kode", "Nama Barang", "Harga", "Jumlah", "Bayar");
        System.out.println("======================================================================");

        int total = 0;

        for (int i = 0; i < n; i++) {
            System.out.printf("%-3d %-6s %-15s %-10d %-12d %-12d\n",
                    (i + 1),
                    kode[i],
                    nama[i],
                    harga[i],
                    jumlah[i],
                    bayar[i]);

            total += bayar[i];
        }

        System.out.println("======================================================================");
        System.out.printf("%-48s : %d\n", "Total Bayar", total);
        System.out.println("======================================================================");
    }
}