package com.programming.techie.OnlineLibrary.dto;

public class JournalDto {

    private int j_id;
    private String j_title;
    private String j_writer;
    private String user_type;
    private String content;

    public int getJ_id() {
        return j_id;
    }

    public void setJ_id(int j_id) {
        this.j_id = j_id;
    }

    public String getJ_title() {
        return j_title;
    }

    public void setJ_title(String j_title) {
        this.j_title = j_title;
    }

    public String getJ_writer() {
        return j_writer;
    }

    public void setJ_writer(String j_writer) {
        this.j_writer = j_writer;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
