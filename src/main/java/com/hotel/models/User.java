package com.hotel.models;

public abstract class User {
    private final String id;
    private final String name;
    private final String email;

    protected User(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Getters only - keeping core ID immutable is a "clean" practice
    public String getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
}