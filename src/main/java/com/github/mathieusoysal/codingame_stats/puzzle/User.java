package com.github.mathieusoysal.codingame_stats.puzzle;

/**
 * 
 * User class represents a contributor or a moderator of a CodinGame's puzzle.
 * 
 * @author Mathieu Soysal
 */
public class User {
    private int userId;
    private String pseudo;
    private String publicHandle;

    User(int userId, String pseudo, String publicHandle) {
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

    /**
     * @return the userId
     */
    public int getUserId() {
        return userId;
    }

    /**
     * @return the pseudo
     */
    public String getPseudo() {
        return pseudo;
    }

    /**
     * @return the publicHandle
     */
    public String getPublicHandle() {
        return publicHandle;
    }

}