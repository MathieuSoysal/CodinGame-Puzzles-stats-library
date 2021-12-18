package com.github.mathieusoysal.codingame_stats.puzzle;

public class User {
    private int userId;
    private String pseudo;
    private String publicHandle;

    public User(int userId, String pseudo, String publicHandle) {
        this.userId = userId;
        this.pseudo = pseudo;
        this.publicHandle = publicHandle;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + userId;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (userId != other.userId)
            return false;
        return true;
    }

    public int getUserId() {
        return userId;
    }

    public String getPseudo() {
        return pseudo;
    }

    public String getPublicHandle() {
        return publicHandle;
    }

}