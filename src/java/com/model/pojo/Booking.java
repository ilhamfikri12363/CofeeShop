package com.model.pojo;
// Generated Sep 30, 2019 6:39:29 PM by Hibernate Tools 4.3.1


import java.sql.Time;
import java.util.Date;


/**
 * Booking generated by hbm2java
 */
public class Booking  implements java.io.Serializable {


     private Integer idBooking;
     private String nama;
     private String meja;
     private Date tanggal;
     private String jam;

    public Booking() {
    }

	
    public Booking(String meja, Date tanggal, String jam) {
        this.meja = meja;
        this.tanggal = tanggal;
        this.jam = jam;
    }
    public Booking(String nama, String meja, Date tanggal, String jam) {
       this.nama = nama;
       this.meja = meja;
       this.tanggal = tanggal;
       this.jam = jam;
    }
   
    public Integer getIdBooking() {
        return this.idBooking;
    }
    
    public void setIdBooking(Integer idBooking) {
        this.idBooking = idBooking;
    }
    public String getNama() {
        return this.nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getMeja() {
        return this.meja;
    }
    
    public void setMeja(String meja) {
        this.meja = meja;
    }
    public Date getTanggal() {
        return this.tanggal;
    }
    
    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }
    public String getJam() {
        return this.jam;
    }
    
    public void setJam(String jam) {
        this.jam = jam;
    }




}


