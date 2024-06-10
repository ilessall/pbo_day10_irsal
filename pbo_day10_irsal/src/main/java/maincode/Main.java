/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maincode;

import com.asset.Mobil;
import com.asset.MobilMewah;

/**
 *
 * @author A-8
 */
public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil();
        System.out.println("Merk mobil = " + mobil1.getMerk());
        Mobil mobil2 = new Mobil("Hitam", 2000000,230,"Avanza");
        System.out.println("Merk mobil2 = " + mobil2.getMerk());
        Mobil mobil3 = new Mobil("Putih","Sigra");
        System.out.println("Merk mobil3 = " + mobil3.getMerk());
        Mobil mobil4 = new Mobil("Italia");
        System.out.println("Merk mobil4 = " + mobil4.getMerk());
        mobil4.getInfo();
        mobil4.setHarga(700000);
        mobil4.getInfo();
        
        Mobil mobilMewah2 = new MobilMewah(800000.0, "Lamborgini");
        mobilMewah2.getInfo();
        mobil4.gasPol();
    }
}
