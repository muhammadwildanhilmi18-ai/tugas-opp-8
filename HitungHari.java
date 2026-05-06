/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author muham
 */
public class HitungHari {

    public int hitung(int tahun, String bulan) {

        switch (bulan) {
            case "Januari": return 31;
            case "Februari":
                // cek tahun kabisat
                if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
                    return 29;
                } else {
                    return 28;
                }
            case "Maret": return 31;
            case "April": return 30;
            case "Mei": return 31;
            case "Juni": return 30;
            case "Juli": return 31;
            case "Agustus": return 31;
            case "September": return 30;
            case "Oktober": return 31;
            case "November": return 30;
            case "Desember": return 31;
            default: return 0;
        }
    }
}