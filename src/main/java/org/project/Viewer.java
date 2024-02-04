package org.project;

import java.util.List;

public class Viewer {
    private String nickname;
    private int age;
    private List<Cinema> watchedMovies;
    private int watchedMoviesCount;

    public Viewer(String nickname, int age, List<Cinema> watchedMovies) {
        setNickname(nickname);
        setAge(age);
        setWatchedMovies(watchedMovies);
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        if (nickname == null || nickname.equals("")) {
            throw new IllegalArgumentException("Nickname must be not empty");
        }
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Invalid age");
        }
        this.age = age;
    }

    public List<Cinema> getWatchedMovies() {
        return watchedMovies;
    }

    public void setWatchedMovies(List<Cinema> watchedMovies) {
        if (watchedMovies == null) {
            throw new IllegalArgumentException("Movies list cannot be null");
        }
        this.watchedMovies = watchedMovies;
        this.watchedMoviesCount = watchedMovies.size();
    }

    public int getWatchedMoviesCount() {
        return watchedMoviesCount;
    }
}
