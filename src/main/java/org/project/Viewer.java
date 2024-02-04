package org.project;

public class Viewer {
    private String nickname;
    private int age;
    private int watchedMoviesCount;

    public Viewer(String nickname, int age, int watchedMoviesCount) {
        setNickname(nickname);
        setAge(age);
        setWatchedMoviesCount(watchedMoviesCount);
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

    public int getWatchedMoviesCount() {
        return watchedMoviesCount;
    }

    public void setWatchedMoviesCount(int watchedMoviesCount) {
        if (watchedMoviesCount < 0) {
            throw new IllegalArgumentException("Watched movies count must be greater than zero");
        }
        this.watchedMoviesCount = watchedMoviesCount;
    }
}
