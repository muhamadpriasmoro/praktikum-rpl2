/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.parkiran;

import com.parkiran.controller.ParkiranController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author priasmoro_50421874
 */

@SpringBootApplication
public class Parkiran implements CommandLineRunner{
    @Autowired
    private ParkiranController parkController;
    
    public static void main (String[] args){
        SpringApplication.run(Parkiran.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        parkController.tampilkanMenu();
    }   
}
