package com.qbtrance.djarray.model;

import org.springframework.boot.autoconfigure.web.ResourceProperties;

import javax.persistence.*;

@Entity
@Table
public class Dj {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String fname;
    private String lname;
    private String email;
    private String aka;
    private String sc;
    private String mc;
    private String fb;
    private String picture;
    private int viewed;

    public Dj(){}

    public Dj(int id, String fname, String lname, String email, String aka, String sc, String mc, String fb, String picture, int viewed) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.aka = aka;
        this.sc = sc;
        this.mc = mc;
        this.fb = fb;
        this.picture = picture;
        this.viewed = viewed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAka() {
        return aka;
    }

    public void setAka(String aka) {
        this.aka = aka;
    }

    public String getSc() {
        return sc;
    }

    public void setSc(String sc) {
        this.sc = sc;
    }

    public String getMc() {
        return mc;
    }

    public void setMc(String mc) {
        this.mc = mc;
    }

    public String getFb() {
        return fb;
    }

    public void setFb(String fb) {
        this.fb = fb;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public int getViewed() {
        return viewed;
    }

    public void setViewed(int viewed) {
        this.viewed = viewed;
    }

    @Override
    public String toString() {
        return "Dj{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", email='" + email + '\'' +
                ", aka='" + aka + '\'' +
                ", sc='" + sc + '\'' +
                ", mc='" + mc + '\'' +
                ", fb='" + fb + '\'' +
                ", picture='" + picture + '\'' +
                ", viewed=" + viewed +
                '}';
    }
}
