/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mesanfaz.uas_pbo_1;

/**
 *
 * @author mesanfaz
 */
public class PersonHandler implements Person {
    private String username;
    private String password;
    private String role;
    
    public PersonHandler(){
        this.role = "user";
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public String getPerson(){
        return "username: " + username + ", password: " + password + ", role: " + role;
    }
}
