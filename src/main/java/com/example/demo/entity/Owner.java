package com.example.demo.entity;

import com.example.demo.enums.Gender;
import com.example.demo.enums.PetType;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "owner_table")
public class Owner {
    @Id
    private int id;
    @Column(name = "first_name" , nullable = false)
    private String FirstName;

    @Column(name = "last_name" , nullable = false)
    private String LastName;

    @Enumerated(value = EnumType.STRING)
    @Column(  nullable = false)
    private Gender gender;


    @Column( nullable = false)
    private String city;
    @Column( nullable = false)
    private String state;
    @Column( name = "mobile" , nullable = false , length = 10)
    private String mobileNumber;

    @Column(name = "email_id", nullable = false , unique = true)
    private String emailId;

    @Column(name = "pet_id" , nullable = false)
    private int petid;

    @Override
    public String toString() {
        return "Owner{" +
                "id=" + id +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", gender=" + gender +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", emailId='" + emailId + '\'' +
                ", petid=" + petid +
                ", petName='" + petName + '\'' +
                ", petBirthDate=" + petBirthDate +
                ", petGender=" + petGender +
                ", petType=" + petType +
                '}';
    }

    @Column(name = "pet_name" ,  nullable = false)
    private String petName;
    @Column( name = "pet_date_of_birth", nullable = false)
    private LocalDate petBirthDate;

    public Gender getPetGender() {
        return petGender;
    }

    public void setPetGender(Gender petGender) {
        this.petGender = petGender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public int getPetid() {
        return petid;
    }

    public void setPetid(int petid) {
        this.petid = petid;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public LocalDate getPetBirthDate() {
        return petBirthDate;
    }

    public void setPetBirthDate(LocalDate petBirthDate) {
        this.petBirthDate = petBirthDate;
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }
    @Enumerated(value = EnumType.STRING)
    @Column( name = "pet_gender", nullable = false)
    private Gender petGender;
    @Enumerated(value = EnumType.STRING)
    @Column(name = "pet_type" , nullable = false )
    private PetType petType;




}
