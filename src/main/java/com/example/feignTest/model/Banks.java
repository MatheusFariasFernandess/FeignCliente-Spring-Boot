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
    private String message;
    private String type;

    public Banks() {
    }

    public Banks(Integer id, String ispb, String name, Integer code, String fullName, String message, String type) {
        this.id = id;
        this.ispb = ispb;
        this.name = name;
        this.code = code;
        this.fullName = fullName;
        this.message = message;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public static final class builder {
        private Integer id;
        private String ispb;
        private String name;
        private Integer code;
        private String fullName;
        private String message;
        private String type;

        private builder() {
        }

        public static builder aBanks() {
            return new builder();
        }

        public builder id(Integer id) {
            this.id = id;
            return this;
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

        public builder message(String message) {
            this.message = message;
            return this;
        }

        public builder type(String type) {
            this.type = type;
            return this;
        }

        public Banks build() {
            Banks banks = new Banks();
            banks.setId(id);
            banks.setIspb(ispb);
            banks.setName(name);
            banks.setCode(code);
            banks.setFullName(fullName);
            banks.setMessage(message);
            banks.setType(type);
            return banks;
        }
    }
}