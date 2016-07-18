/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

/**
 *
 * @author Jose
 */
public class cUsuario {
    private String userName;
    private String password;
    private String name;
    private String lastName;
    private int rol;

    public cUsuario(String userName, String password, String name, String lastName, int rol) {
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.lastName = lastName;
        this.rol = rol;
    }

    public cUsuario(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
    
    public cUsuario() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }
    
    
}
