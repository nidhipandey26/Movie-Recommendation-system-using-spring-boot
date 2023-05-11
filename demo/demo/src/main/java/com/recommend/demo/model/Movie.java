package com.recommend.demo.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.File;

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private String mtype;
    private File image;
    private String city;
    private String address;
    private String pincode;
    private String rating;
    private String response;

    public void setCity(String city) {
        this.city = city;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }

    public String getPincode() {
        return pincode;
    }

    public String getRating() {
        return rating;
    }

    public String getResponse() {
        return response;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setMtype(String mtype) {
        this.mtype = mtype;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getMtype() {
        return mtype;
    }

    public void setImage(File image) {
        this.image = image;
    }

    public File getImage() {
        return image;
    }
}
