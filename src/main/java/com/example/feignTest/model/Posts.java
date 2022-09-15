package com.example.feignTest.model;

public class Posts {

    private Integer userId;

    private Integer id;

    private String title;
    private String body;

    public Posts() {
    }

    public Posts(Integer userId, Integer id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
        private String title;
        private String body;

        private builder() {
        }

        public static builder aPosts() {
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

        public builder title(String title) {
            this.title = title;
            return this;
        }

        public builder body(String body) {
            this.body = body;
            return this;
        }

        public Posts build() {
            Posts posts = new Posts();
            posts.setUserId(userId);
            posts.setId(id);
            posts.setTitle(title);
            posts.setBody(body);
            return posts;
        }
    }
}
