package com.qbtrance.djarray.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import java.util.Objects;

@Entity
@Table
public class Dj {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String alsoKnownAs;
    private String soundcloud;
    private String mixcloud;
    private String facebook;
    private String picture;
    private int viewed;

    public Dj(){}

    public Dj(String firstName, String lastName, String email, String alsoKnownAs,
              String soundcloud, String mixcloud, String facebook,
              String picture, int viewed) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.alsoKnownAs = alsoKnownAs;
        this.soundcloud = soundcloud;
        this.mixcloud = mixcloud;
        this.facebook = facebook;
        this.picture = picture;
        this.viewed = viewed;
    }

    public int getId() {
        return id;
    }

//   Commented to avoid id to be set manually.
//   public void setId(int id) {
//        this.id = id;
//    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAlsoKnownAs() {
        return alsoKnownAs;
    }

    public void setAlsoKnownAs(String alsoKnownAs) {
        this.alsoKnownAs = alsoKnownAs;
    }

    public String getSoundcloud() {
        return soundcloud;
    }

    public void setSoundcloud(String soundcloud) {
        this.soundcloud = soundcloud;
    }

    public String getMixcloud() {
        return mixcloud;
    }

    public void setMixcloud(String mixcloud) {
        this.mixcloud = mixcloud;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
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
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", alsoKnownAs='" + alsoKnownAs + '\'' +
                ", soundcloud='" + soundcloud + '\'' +
                ", mixcloud='" + mixcloud + '\'' +
                ", facebook='" + facebook + '\'' +
                ", picture='" + picture + '\'' +
                ", viewed=" + viewed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dj dj = (Dj) o;
        return id == dj.id &&
                viewed == dj.viewed &&
                Objects.equals(firstName, dj.firstName) &&
                Objects.equals(lastName, dj.lastName) &&
                Objects.equals(email, dj.email) &&
                Objects.equals(alsoKnownAs, dj.alsoKnownAs) &&
                Objects.equals(soundcloud, dj.soundcloud) &&
                Objects.equals(mixcloud, dj.mixcloud) &&
                Objects.equals(facebook, dj.facebook) &&
                Objects.equals(picture, dj.picture);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, email, alsoKnownAs,
                soundcloud, mixcloud, facebook, picture, viewed);
    }
}
