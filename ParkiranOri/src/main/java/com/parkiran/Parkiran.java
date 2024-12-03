/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.parkiran;

import com.parkiran.controller.ParkiranController;
import com.parkiran.view.ParkiranGUI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author priasmoro_50421874
 */

@SpringBootApplication
public class Parkiran implements ApplicationRunner {
    @Autowired
    private ParkiranController parkController;
    
    public static void main (String[] args){
        System.setProperty("java.awt.headless", "false");
        ApplicationContext ctx = SpringApplication.run(Parkiran.class, args);
        ParkiranController controller = ctx.getBean(ParkiranController.class);
        ParkiranGUI park =  new ParkiranGUI(controller);
        park.setVisible(true);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        
    }   
}
