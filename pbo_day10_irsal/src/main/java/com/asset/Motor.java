/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asset;

/**
 *
 * @author A-8
 */
public class Motor implements KendaranBermotor{

    @Override
    public void gasPol() {
        System.out.println("Gas Sampai 100km/jam");
    }

    @Override
    public void ngerem() {
        System.out.println("Motor Behenti");
    }
    
}
