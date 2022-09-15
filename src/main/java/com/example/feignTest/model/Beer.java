package com.example.feignTest.model;

public class Beer {

    private Integer id;

    private String name;

    private String tagline;

    private String first_brewed;

    private String description;

    public Beer() {
    }

    public Beer(Integer id, String name, String tagline, String first_brewed, String description) {
        this.id = id;
        this.name = name;
        this.tagline = tagline;
        this.first_brewed = first_brewed;
        this.description = description;
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

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public String getFirst_brewed() {
        return first_brewed;
    }

    public void setFirst_brewed(String first_brewed) {
        this.first_brewed = first_brewed;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public static final class builder {
        private Integer id;
        private String name;
        private String tagline;
        private String first_brewed;
        private String description;

        private builder() {
        }

        public static builder aBeer() {
            return new builder();
        }

        public builder id(Integer id) {
            this.id = id;
            return this;
        }

        public builder name(String name) {
            this.name = name;
            return this;
        }

        public builder tagline(String tagline) {
            this.tagline = tagline;
            return this;
        }

        public builder first_brewed(String first_brewed) {
            this.first_brewed = first_brewed;
            return this;
        }

        public builder description(String description) {
            this.description = description;
            return this;
        }

        public Beer build() {
            Beer beer = new Beer();
            beer.setId(id);
            beer.setName(name);
            beer.setTagline(tagline);
            beer.setFirst_brewed(first_brewed);
            beer.setDescription(description);
            return beer;
        }
    }
}
