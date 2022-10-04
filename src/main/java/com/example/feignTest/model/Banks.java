package com.example.feignTest.model;

import javax.persistence.*;

@Entity
@Table(name = "bank_tb")
public class Banks {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String ispb;
    private String name;
    private Integer code;
    private String fullName;

    public Banks() {
    }

    public Banks(String ispb, String name, Integer code, String fullName) {
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


    public void setCode(Integer code) {
        this.code = code;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCode() {
        return code;
    }

    public static final class builder {
        private String ispb;
        private String name;
        private Integer code;
        private String fullName;

        private builder() {
        }

        public static builder aBanks() {
            return new builder();
        }

        public builder ispb(String ispb) {
            this.ispb = ispb;
            return this;
        }

        public builder name(String name) {
            this.name = name;
            return this;
        }

        public builder code(Integer code) {
            this.code = code;
            return this;
        }

        public builder fullName(String fullName) {
            this.fullName = fullName;
            return this;
        }

        public Banks build() {
            Banks banks = new Banks();
            banks.setIspb(ispb);
            banks.setName(name);
            banks.setCode(code);
            banks.setFullName(fullName);
            return banks;
        }
    }
}