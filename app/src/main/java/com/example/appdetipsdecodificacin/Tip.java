package com.example.appdetipsdecodificacin;

public class Tip {
    private String content;
    private String author;
    private int likes;

    public Tip(String content, String author, int likes) {
        this.content = content;
        this.author = author;
        this.likes = likes;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}

