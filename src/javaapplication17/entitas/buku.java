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
public class buku {
    private String idBuku;
    private String genre;
    private String judul;
    private String penerbit;

    public buku(String idBuku, String genre, String judul, String penerbit) {
        this.idBuku = idBuku;
        this.genre = genre;
        this.judul = judul;
        this.penerbit = penerbit;
    }

    public buku() {
    }

    public String getIdBuku() {
        return idBuku;
    }

    public void setIdBuku(String idBuku) {
        this.idBuku = idBuku;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }
    
    
    
    
}


