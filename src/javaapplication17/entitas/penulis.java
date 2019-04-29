/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17.entitas;

/**
 *
 * @author irfan
 */
public class penulis {
    private String idPenulis;
    private String nama;
    private String lahir;

    public penulis(String idPenulis, String nama, String lahir) {
        this.idPenulis = idPenulis;
        this.nama = nama;
        this.lahir = lahir;
    }

    public penulis() {
    }

    public String getIdPenulis() {
        return idPenulis;
    }

    public void setIdPenulis(String idPenulis) {
        this.idPenulis = idPenulis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getLahir() {
        return lahir;
    }

    public void setLahir(String lahir) {
        this.lahir = lahir;
    }

    
    
    
}
