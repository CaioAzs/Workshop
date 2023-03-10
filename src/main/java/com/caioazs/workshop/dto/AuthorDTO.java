package com.caioazs.workshop.dto;

import com.caioazs.workshop.models.User;

public class AuthorDTO {

    private String id;
    private String username;

    public AuthorDTO() {
    }

    public AuthorDTO(User user) {
        id = user.getId();
        username = user.getUsername();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
