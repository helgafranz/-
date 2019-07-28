/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ratuvehiclesloanltd;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class RatuVehiclesLoanLtd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner x = new Scanner(System.in);
        String type, kondisi, tahun;
        int lama;
        double hutang, bunga1, bunga = 0, angsur, sisa, sisa1, dp, persendp, dphutang = 0;
        double angsur1, total = 0, totbunga, bayar;
        DateFormat dateyears = new SimpleDateFormat("yyyy");
        Date dateobj = new Date();
        System.out.println();
        System.out.println("Credit Simulator Program");
        System.out.println("=============================================================================");
        System.out.print("Jenis Kendaraan (Motor / Mobil)  = ");
        type = x.nextLine();
        System.out.print("Kondisi Kendaraan (Bekas / Baru) = ");
        kondisi = x.nextLine();
        System.out.print("Tahun Kendaraan                  = ");
        tahun = x.nextLine();
        System.out.print("Jumlah Pinjaman                  = ");
        hutang = x.nextDouble();
        System.out.print("Tenor Cicilan (Max 6x)           = ");
        lama = x.nextInt();
        System.out.print("Jumlah DP (Baru >= 35% dan Bekas >= 25%) = ");
        dp = x.nextDouble();
        System.out.println();
        if ((kondisi.equals("Baru") && (tahun.equals(dateyears.format(dateobj))))) {
        persendp = hutang * 0.35;
        if (hutang >= 1000000000) {
        System.out.println("Jumlah pinjaman tidak boleh lebih dari sama dengan 1 Miliar");
        }
        else {
        if (lama > 5) {
        System.out.println("Tenor cicilan tidak boleh lebih dari 5x");
        } else {
            if (dp < persendp) {
            System.out.println("DP Kendaraan Baru harus lebih dari atau sama dengan 35% ("+ persendp +") dari total pinjaman");
            } else {
            for (int a = 1; a <= lama; a++){
            dphutang = hutang - dp;
            angsur = dphutang / lama;
            sisa = dphutang - angsur * a;

if (type.equals("Mobil")) {
    if (a == 1) {
    bunga = 8;  
    }
    else if (a % 2 == 0) {
    bunga = bunga + 0.1;
    } else {
    bunga = bunga + 0.5;
    }
} else {
    if (a == 1) {
    bunga = 9;  
    }
    else if (a % 2 == 0) {
    bunga = bunga + 0.1;
    } else {
    bunga = bunga + 0.5;
    }
}

            bunga1 = bunga * 10 / 100 * dphutang;
            bayar = bunga1 + angsur;
            total += bayar;
            System.out.println("Tahun ke - " + a);
            System.out.println("----------------------------");
            System.out.printf("Suku Bunga    = %.2f", bunga);
            System.out.println(" percent");
            System.out.printf("Besar Bunga   = %.2f", bunga1);
            System.out.println(" Rupiah");
            System.out.printf("Bayar         = %.2f", bayar);
            System.out.println(" Rupiah");
            System.out.printf("Sisa Pinjaman = %.2f", sisa);
            System.out.println(" Rupiah");
            System.out.println("----------------------------");
        }
        System.out.println("=============================================================================");
        System.out.println("Jenis Kendaraan   = " + type);
        System.out.println("Kondisi Kendaraan = " + kondisi);
        System.out.println("Tahun Kendaraan   = " + tahun);
        System.out.printf("Jumlah DP         = %.2f", dp);
        System.out.println(" Rupiah");
        System.out.printf("Pinjaman awal     = %.2f", hutang);
        System.out.println(" Rupiah");
        System.out.printf("Total Pinjaman - DP = %.2f", dphutang);
        System.out.println(" Rupiah");
        System.out.printf("Total Pengembalian (total pinjaman - dp + bunga dari tahun  1 - " + lama + ") = %.2f", total);
        System.out.println(" Rupiah");
        System.out.println();
                }
            }
        }
        } else if ((kondisi.equals("Bekas"))) {
          persendp = hutang * 0.25;
        if (hutang >= 1000000000) {
        System.out.println("Jumlah pinjaman tidak boleh lebih dari sama dengan 1 Miliar");
        }
        else {
        if (lama > 5) {
        System.out.println("Tenor cicilan tidak boleh lebih dari 5x");
        } else {
          if (dp < persendp) {
          System.out.println("DP Kendaraan Bekas harus lebih dari atau sama dengan 25% ("+ persendp +") dari total pinjaman");
          } else {
        for (int a = 1; a <= lama; a++) {
            dphutang = hutang - dp;
            angsur = dphutang / lama;
            sisa = dphutang - angsur * a;
            bunga = dphutang / (sisa + angsur);

if (type.equals("Mobil")) {
    if (a == 1) {
    bunga = 8;  
    }
    else if (a % 2 == 0) {
    bunga = bunga + 0.1;
    } else {
    bunga = bunga + 0.5;
    }
} else {
    if (a == 1) {
    bunga = 9;  
    }
    else if (a % 2 == 0) {
    bunga = bunga + 0.1;
    } else {
    bunga = bunga + 0.5;
    }
}
            
            bunga1 = bunga * 10 / 100 * dphutang;
            bayar = bunga1 + angsur;
            total += bayar;
            System.out.println("Tahun ke - " + a);
            System.out.println("----------------------------");
            System.out.printf("Suku Bunga    = %.2f", bunga);
            System.out.println(" percent");
            System.out.printf("Besar Bunga   = %.2f", bunga1);
            System.out.println(" Rupiah");
            System.out.printf("Bayar         = %.2f", bayar);
            System.out.println(" Rupiah");
            System.out.printf("Sisa Pinjaman = %.2f", sisa);
            System.out.println(" Rupiah");
            System.out.println("----------------------------");
        }
        System.out.println("=============================================================================");
        System.out.println("Jenis Kendaraan   = " + type);
        System.out.println("Kondisi Kendaraan = " + kondisi);
        System.out.println("Tahun Kendaraan   = " + tahun);
        System.out.printf("Jumlah DP         = %.2f", dp);
        System.out.println(" Rupiah");
        System.out.printf("Pinjaman awal     = %.2f", hutang);
        System.out.println(" Rupiah");
        System.out.printf("Total Pinjaman - DP = %.2f", dphutang);
        System.out.println(" Rupiah");
        System.out.printf("Total Pengembalian (total pinjaman - dp + bunga dari tahun  1 - " + lama + ") = %.2f", total);
        System.out.println(" Rupiah");
        System.out.println();
                }
            }
        }
        } else {
            System.out.println("Kendaraan baru harus tahun keluaran terbaru");
        }
    }
}
    
    

