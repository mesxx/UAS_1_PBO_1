/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mesanfaz.uas_pbo_1;

/**
 *
 * @author mesanfaz
 */
public class UAS_PBO_1 {
    public static void main(String[] args) {
        /*
        Polimorfisme adalah prinsip dalam pemrograman berorientasi objek (OOP) 
        yang memungkinkan class memiliki banyak method yang berbeda, meskipun namanya sama.
        */
        Person personOne = new PersonHandler();
        personOne.setUsername("Ichsan");
        personOne.setPassword("123456789");
        
        String getPersonOne = personOne.getPerson();
        System.out.println(getPersonOne);
        
        Person personTwo = new PersonHandler();
        personTwo.setUsername("Fauzan");
        personTwo.setPassword("987654321");
        
        String getPersonTwo = personTwo.getPerson();
        System.out.println(getPersonTwo);
    }
}
