package com.example.feignTest.model;

import java.util.List;

public class Cep {

    private String cep;
    private String state;
    private String city;
    private String neighborhood;
    private String street;
    private String service;

    private List<String> Location;

    public Cep() {
    }

    public Cep(String cep, String state, String city, String neighborhood, String street, String service) {
        this.cep = cep;
        this.state = state;
        this.city = city;
        this.neighborhood = neighborhood;
        this.street = street;
        this.service = service;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }


    public static final class builder {
        private String cep;
        private String state;
        private String city;
        private String neighborhood;
        private String street;
        private String service;
        private List<String> Location;

        private builder() {
        }

        public static builder aCep() {
            return new builder();
        }

        public builder cep(String cep) {
            this.cep = cep;
            return this;
        }

        public builder state(String state) {
            this.state = state;
            return this;
        }

        public builder city(String city) {
            this.city = city;
            return this;
        }

        public builder neighborhood(String neighborhood) {
            this.neighborhood = neighborhood;
            return this;
        }

        public builder street(String street) {
            this.street = street;
            return this;
        }

        public builder service(String service) {
            this.service = service;
            return this;
        }

        public builder Location(List<String> Location) {
            this.Location = Location;
            return this;
        }


        public Cep build() {
            Cep cep = new Cep();
            cep.setState(state);
            cep.setCity(city);
            cep.setNeighborhood(neighborhood);
            cep.setStreet(street);
            cep.setService(service);
            cep.Location = this.Location;
            return cep;
        }
    }
}
