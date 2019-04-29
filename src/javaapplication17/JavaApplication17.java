/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author irfan
 */
public class JavaApplication17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String bukuCsv = "C:\\Users\\irfan\\Desktop\\TUBES SBD\\sbd\\sbd\\SBD\\src\\CSV\\buku.csv";
        String penulisCsv ="C:\\Users\\irfan\\Desktop\\TUBES SBD\\sbd\\sbd\\SBD\\src\\CSV\\penulis.csv";
        String menulisCsv ="C:\\Users\\irfan\\Desktop\\TUBES SBD\\sbd\\sbd\\SBD\\src\\CSV\\menulis.csv";
        
        String[] arrayBuku = new String[100];
        String[] arrayPenulis = new String[100];
        String[] arrayMenulis = new String[100];
        String[] arrayOut = new String[100];
        
        String line;
        
        try (BufferedReader br = new BufferedReader(new FileReader(bukuCsv))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                arrayBuku = line.split(",");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        
        try (BufferedReader br = new BufferedReader(new FileReader(penulisCsv))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                arrayPenulis = line.split(",");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        
        try (BufferedReader br = new BufferedReader(new FileReader(menulisCsv))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                arrayMenulis = line.split(",");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        
        String a = "BUKU."+ arrayBuku[0]+ "=MENULIS."+arrayMenulis[1]+";";
       // System.out.println(a);
        
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Masukkan Perintah: ");
        String n = reader.nextLine();
        n = n.toUpperCase();
        
        String[] parts = n.split(" ");
        
        boolean idb = false;
        boolean pene = false;
        boolean genr = false;
        boolean jud = false;
        boolean nam = false;
        boolean idp = false;
        boolean lah =false;
        boolean flag1=false;
        boolean flag=false;
        boolean flagJoin = false;
        boolean flagTikom=false;
        
        if ("SELECT".equals(parts[0])){ //perintah select
            if("*".equals(parts[1])){ 
                if("FROM".equals(parts[2]) ){
                       if("BUKU;".equals(parts[3])||"BUKU".equals(parts[3])){
                            flag = true;
                            if(parts.length<=4){
                                flagTikom = true;
                            }
                            if(parts.length>4){
                            if("JOIN".equals(parts[4])){
                                flagJoin = true; // salah disini
                                if ("PENULIS".equals(parts[5]) || "PENULIS;".equals(parts[5])){
                                    flag = true;
                                    if(parts.length>6){
                                    if("ON".equals(parts[6])){
                                        if(("BUKU."+ arrayBuku[0]+ "=MENULIS."+arrayMenulis[1]+";").equals(parts[7]) || ("PENULIS."+ arrayPenulis[0]+"=MENULIS."+arrayMenulis[0]+";").equals(parts[7])){
                                            flag = true;
                                        }else{
                                            flag = false;
                                        }
                                    }
                                    }
                                }else{
                                    flag=false;
                                }
                            }
                            }
                        }else if("PENULIS;".equals(parts[3])||"PENULIS".equals(parts[3])){
                            flag = true;
                            if(parts.length<=4){
                                flagTikom = true;
                            }
                            if(parts.length>4){
                            if("JOIN".equals(parts[4])){
                                flagJoin = true;
                                if ("BUKU;".equals(parts[5]) || "BUKU".equals(parts[5])){
                                    flag = true;
                                    if(parts.length>6){
                                    if("ON".equals(parts[6])){
                                        if("PENULIS.IDPENULIS=MENULIS.IDPENULIS;".equals(parts[7]) || "MENULIS.IDPENULIS=PENULIS.IDPENULIS;".equals(parts[7])){
                                            flag = true;
                                        }else{
                                            flag = false;
                                        }
                                    }
                                    }
                                }else{
                                    flag=false;
                                }
                            }
                            }
                        }else{
                            flag = false;
                        }
                }
//            }else if("IDBUKU".equals(parts[1])){
//                if("FROM".equals(parts[2]) ){
//                    if("BUKU;".equals(parts[3])){
//                           flag = true; 
//                    }
//                }
//            }
//            else if("JUDUL".equals(parts[1])){
//                if("FROM".equals(parts[2]) ){
//                    if("BUKU;".equals(parts[3])){
//                            flag = true;
//                    }
//                }
//            }
//            else if("GENRE".equals(parts[1])){
//                if("FROM".equals(parts[2]) ){
//                    if("BUKU;".equals(parts[3])){
//                            flag = true;
//                    }
//                } 
//            }
//            else if("PENERBIT".equals(parts[1])){
//                if("FROM".equals(parts[2]) ){
//                    if("BUKU;".equals(parts[3])){
//                            flag = true;                       
//                    }
//                }
//            }
//            else if("IDPENULIS".equals(parts[1])){
//                if("FROM".equals(parts[2]) ){
//                    if("PENULIS;".equals(parts[3]) ){
//                            flag = true;    
//                    }
//                }
//            }
//            else if("NAMA".equals(parts[1])){
//                if("FROM".equals(parts[2]) ){
//                    if("PENULIS;".equals(parts[3])){
//                            flag = true;
//                    }
//                }
//            }   
//            else if("LAHIR".equals(parts[1])){
//                if("FROM".equals(parts[2]) ){
//                    if("PENULIS;".equals(parts[3])){
//                            flag = true;
//                    }
//                }
            flag1=true; //penanda apabila bukan "*"
            }else if(!"*".equals(parts[1])){
                String[] parts2 = parts[1].split(",");
                int i=0;
                int k=0;
                while( i < parts2.length && k < parts2.length){ //"i" digunakan untuk mengulang sebanyak jumlah "," "k" digunakan agar menanggulangi looping forever
                    for(int j=0;j<parts2.length;j++){
                        if(("IDBUKU".equals(parts2[i]))){
                           flag1=true;
                           idb=true;
                        }else if(("PENERBIT".equals(parts2[i]))){
                           flag1=true; 
                           pene=true; 
                        }else if(("GENRE".equals(parts2[i]))){
                           flag1=true;
                           genr=true; 
                        }else if(("JUDUL".equals(parts2[i]))){
                           flag1=true;
                           jud=true;
                        }else if(("NAMA".equals(parts2[i]))){
                           flag1=true;
                           nam=true;
                        }else if(("LAHIR".equals(parts2[i])) ){
                           flag1=true;
                           lah=true;
                        }else if(("IDPENULIS".equals(parts2[i]))){
                           flag1=true;
                           idp=true;
                        }
                    }

                    if(flag1==true){
                        i++;
                    }
                    k++;
                }
                
//                System.out.println(i);
//                System.out.println(parts2.length);
//                if(i==parts2.length){
//                    flag1=true;
//                }
//                else{
//                    flag1=false;
//                }
                if("FROM".equals(parts[2])){
                                if("BUKU;".equals(parts[3])||"BUKU".equals(parts[3])){
                                    flag = true;
                                    if(parts.length<=4){
                                        flagTikom = true;
                                    }
                                    if(parts.length>4){
                                    if("JOIN".equals(parts[4])){
                                        flagJoin = true;
                                        if ("PENULIS;".equals(parts[5]) || "PENULIS".equals(parts[5])){
                                            flag = true;
                                            if(parts.length>6){
                                                if("ON".equals(parts[6])){
                                                    if("BUKU.IDBUKU=MENULIS.IDBUKU;".equals(parts[7]) || "MENULIS.IDBUKU=BUKU.IDBUKU;".equals(parts[7])){
                                                        flag = true;
                                                    }else{
                                                        flag = false;
                                                    }
                                                }
                                            }
                                        } 
                                    }
                                    }
                                
                                }else if("PENULIS;".equals(parts[3])||"PENULIS".equals(parts[3])){
                                    flag = true;
                                    if(parts.length<=4){
                                        flagTikom = true;
                                    }
                                    if(parts.length>4){
                                    if("JOIN".equals(parts[4])){
                                        flagJoin = true;
                                        if ("BUKU;".equals(parts[5])){
                                            flag = true;
                                            if(parts.length>6){
                                                if("ON".equals(parts[6])){
                                                    if("PENULIS.IDPENULIS=MENULIS.IDPENULIS;".equals(parts[7]) || "MENULIS.IDPENULIS=PENULIS.IDPENULIS;".equals(parts[7])){
                                                        flag = true;
                                                    }else{
                                                        flag = false;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    }
                                }else{
                                    flag=false;
                                    }
                }else{
                    flag = false;
                }
            }
//        System.out.println(flag);
//        System.out.println(flag1);
//        if(flag == true && flag1 == true){
//            System.out.println("valid");
//        }else{
//            System.out.println("tidak valid");
//        }
        
        
            
                
                if("*".equals(parts[1]) && "BUKU;".equals(parts[3]) && "FROM;".equals(parts[2])){ //jika menggunakan "*" dan from buku; pada perintah sql
                    System.out.println("tabel"+"("+"1"+")"+"="+parts[3]);
                    for(int i=0;i<arrayBuku.length;i++){ //mengulang sebanyak panjang array buku
                        System.out.println(arrayBuku[i]);
                    }
                }else if("*".equals(parts[1]) && "PENULIS;".equals(parts[3])){ //jika menggunakan "*" dan from penulis; pada perintah sql
                    System.out.println("tabel"+"("+"1"+")"+"="+parts[3]);
                    for(int i=0;i<arrayPenulis.length;i++){ //mengulang sebanyak panjang array penulis
                        System.out.println(arrayPenulis[i]);
                    }
                }else if("*".equals(parts[1]) && flagJoin == true && !"PENULIS".equals(parts[5]) ){ //jika menggunakan "*" dan terdapat join
                    System.out.println("tabel"+"("+"1"+")"+"="+parts[3]);
                    System.out.println("tabel"+"("+"2"+")"+"="+parts[5]);
                    for(int i=0;i<arrayPenulis.length;i++){ //mengulang sebanyak panjang array penulis
                        System.out.println(arrayPenulis[i]);
                    }for(int i=0;i<arrayBuku.length;i++){ //mengulang sebanyak panjang array buku
                        System.out.println(arrayBuku[i]);
                    }
                }else if(((!"*".equals(parts[1]) && !"BUKU".equals(parts[3]) && !"PENULIS".equals(parts[3]) &&!"MENULIS".equals(parts[3]))) || flagJoin == true){ //cek apakah ada ";" dan penulisan dari query benar 
                    System.out.println("tabel"+"("+"1"+")"+"="+parts[3]);
                    if (parts.length>4){
                    System.out.println("tabel"+"("+"2"+")"+"="+parts[5]);
                    }
                        for(int i=0;i<7;i++){ //cek semua kemungkinan entitas
                            if(idb == true && flag1 == true){ //jika idBuku terdapat pada statement
                                System.out.println(arrayBuku[0]);
                                idb = false; //dibuat false agar tidak masuk ke proses yang sama
                            }else if(pene == true && flag1 == true){ //jika penerbit terdapat pada statement
                                System.out.println(arrayBuku[2]);
                                pene = false; 
                            }else if(jud == true && flag1 == true){ //jika judul terdapat pada statement
                                System.out.println(arrayBuku[1]);
                                jud = false; 
                            }else if(genr == true && flag1 == true){ //jika genre terdapat pada statement
                                System.out.println(arrayBuku[3]);
                                genr = false; 
                            }else if(idp == true && flag1 == true){ //jika idPenulis terdapat pada statement
                                System.out.println(arrayPenulis[0]); 
                                idp = false; 
                            }else if(nam == true && flag1 == true){ //jika nama terdapat pada statement
                                System.out.println(arrayPenulis[1]);
                                nam = false; 
                            }else if(lah == true && flag1 == true){ //jika lahir terdapat pada statement
                                System.out.println(arrayPenulis[2]);
                                lah = false; 
                            }
                        }
                }else if(flagTikom == true){
                    System.out.println("SQL Error (Missing ;)");
                }else if(flag == false){
                    System.out.println("SQL Error (Syntax Error)");
                }
    }
        if(flag == false)
        {
            System.out.println("SQL Error (Syntax Error)");
        }
                
    }
}