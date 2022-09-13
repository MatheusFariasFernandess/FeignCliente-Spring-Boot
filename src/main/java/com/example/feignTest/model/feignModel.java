package com.example.feignTest.model;

public class feignModel {

    private Integer userId;

    private Integer id;

    private String tittle;
    private String body;

    public feignModel() {
    }

    public feignModel(Integer userId, Integer id, String tittle, String body) {
        this.userId = userId;
        this.id = id;
        this.tittle = tittle;
        this.body = body;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }


    public static final class builder {
        private Integer userId;
        private Integer id;
        private String tittle;
        private String body;

        private builder() {
        }

        public static builder afeignModel() {
            return new builder();
        }

        public builder userId(Integer userId) {
            this.userId = userId;
            return this;
        }

        public builder id(Integer id) {
            this.id = id;
            return this;
        }

        public builder tittle(String tittle) {
            this.tittle = tittle;
            return this;
        }

        public builder body(String body) {
            this.body = body;
            return this;
        }

        public feignModel build() {
            feignModel feignModel = new feignModel();
            feignModel.setUserId(userId);
            feignModel.setId(id);
            feignModel.setTittle(tittle);
            feignModel.setBody(body);
            return feignModel;
        }
    }
}
