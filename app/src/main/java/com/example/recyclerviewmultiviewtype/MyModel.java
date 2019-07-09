package com.example.recyclerviewmultiviewtype;

import java.util.List;

public class MyModel {
    private String type;
    private String data;
    private List<Movie> movie;

    public MyModel(String type,String data) {
        this.type = type;
        this.data = data;
    }

    public MyModel(String type, List<Movie> movie) {
        this.type = type;
        this.movie = movie;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<Movie> getMovie() {
        return movie;
    }

    public void setMovie(List<Movie> movie) {
        this.movie = movie;
    }
}
