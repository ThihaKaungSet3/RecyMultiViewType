package com.example.recyclerviewmultiviewtype;

public class Movie {
    private String name;
    private int cover;

    public Movie(String name, int cover) {
        this.name = name;
        this.cover = cover;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCover() {
        return cover;
    }

    public void setCover(int cover) {
        this.cover = cover;
    }
}
