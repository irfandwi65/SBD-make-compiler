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
public class menulis {
    private String idBuku;
    private String idPenulis;

    public menulis(String idBuku, String idPenulis) {
        this.idBuku = idBuku;
        this.idPenulis = idPenulis;
    }

    public menulis() {
    }

    public String getIdBuku() {
        return idBuku;
    }

    public void setIdBuku(String idBuku) {
        this.idBuku = idBuku;
    }

    public String getIdPenulis() {
        return idPenulis;
    }

    public void setIdPenulis(String idPenulis) {
        this.idPenulis = idPenulis;
    }
    
    
}
