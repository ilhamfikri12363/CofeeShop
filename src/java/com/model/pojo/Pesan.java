package com.model.pojo;
// Generated Sep 30, 2019 6:39:29 PM by Hibernate Tools 4.3.1



/**
 * Pesan generated by hbm2java
 */
public class Pesan  implements java.io.Serializable {


     private Integer idPesan;
     private String email;
     private String nama;
     private String pesan;

    public Pesan() {
    }

    public Pesan(String email, String nama, String pesan) {
       this.email = email;
       this.nama = nama;
       this.pesan = pesan;
    }
   
    public Integer getIdPesan() {
        return this.idPesan;
    }
    
    public void setIdPesan(Integer idPesan) {
        this.idPesan = idPesan;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNama() {
        return this.nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getPesan() {
        return this.pesan;
    }
    
    public void setPesan(String pesan) {
        this.pesan = pesan;
    }




}


