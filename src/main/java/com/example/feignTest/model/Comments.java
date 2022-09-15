package com.example.feignTest.model;

public class Comments
{
    private Integer postId;
    private Integer id;
    private String name;
    private String email;
    private String body;

    public Comments() {
    }

    public Comments(Integer postId, Integer id, String name, String email, String body) {
        this.postId = postId;
        this.id = id;
        this.name = name;
        this.email = email;
        this.body = body;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }


    public static final class builder {
        private Integer postId;
        private Integer id;
        private String name;
        private String email;
        private String body;

        private builder() {
        }

        public static builder aComments() {
            return new builder();
        }

        public builder postId(Integer postId) {
            this.postId = postId;
            return this;
        }

        public builder id(Integer id) {
            this.id = id;
            return this;
        }

        public builder name(String name) {
            this.name = name;
            return this;
        }

        public builder email(String email) {
            this.email = email;
            return this;
        }

        public builder body(String body) {
            this.body = body;
            return this;
        }

        public Comments build() {
            Comments comments = new Comments();
            comments.setPostId(postId);
            comments.setId(id);
            comments.setName(name);
            comments.setEmail(email);
            comments.setBody(body);
            return comments;
        }
    }
}
