package com.example.feignTest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Banks {
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private Integer id;

    private String ispb;
    private String name;
    private Integer code;
    private String fullName;

    public Banks() {
    }

    public Banks(Integer id,String ispb, String name, Integer code, String fullName) {
        this.id=id;
        this.ispb = ispb;
        this.name = name;
        this.code = code;
        this.fullName = fullName;
    }


    public String getIspb() {
        return ispb;
    }

    public void setIspb(String ispb) {
        this.ispb = ispb;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setId(Integer id){
        this.id=id;
    }

    public Integer getId(){
        return this.id;
    }
}
