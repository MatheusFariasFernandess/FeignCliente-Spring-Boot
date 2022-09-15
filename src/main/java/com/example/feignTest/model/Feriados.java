package com.example.feignTest.model;

public class Feriados {
    private Integer ano;

    private String date;

    private String type;

    private String name;

    private String fullName;

    public Feriados() {
    }

    public Feriados(Integer ano, String date, String type, String name, String fullName) {
        this.ano = ano;
        this.date = date;
        this.type = type;
        this.name = name;
        this.fullName = fullName;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


    public static final class builder {
        private Integer ano;
        private String date;
        private String type;
        private String name;
        private String fullName;

        private builder() {
        }

        public static builder aFeriados() {
            return new builder();
        }

        public builder ano(Integer ano) {
            this.ano = ano;
            return this;
        }

        public builder date(String date) {
            this.date = date;
            return this;
        }

        public builder type(String type) {
            this.type = type;
            return this;
        }

        public builder name(String name) {
            this.name = name;
            return this;
        }

        public builder fullName(String fullName) {
            this.fullName = fullName;
            return this;
        }

        public Feriados build() {
            Feriados feriados = new Feriados();
            feriados.setAno(ano);
            feriados.setDate(date);
            feriados.setType(type);
            feriados.setName(name);
            feriados.setFullName(fullName);
            return feriados;
        }
    }
}
