package org.project;

import java.util.ArrayList;
import java.util.List;

public class CinemaApplicationRun {
    public static void main( String[] args ) {
        Cinema movie1 = new Cinema("movie1", "genre1", 2);
        Cinema movie2 = new Cinema("movie2", "genre2", 2);
        Cinema movie3 = new Cinema("movie3", "genre3", 2);
        Cinema movie4 = new Cinema("movie4", "genre4", 2);
        Cinema movie5 = new Cinema("movie5", "genre5", 2);
        Viewer viewer1 = new Viewer("viewer1", 18, List.of(movie1));
        Viewer viewer2 = new Viewer("viewer2", 19, List.of(movie1, movie2));
        Viewer viewer3 = new Viewer("viewer3", 20, List.of(movie1, movie2, movie3));
        Viewer viewer4 = new Viewer("viewer4", 21, List.of(movie1, movie2, movie3, movie4));
        Viewer viewer5 = new Viewer("viewer5", 22, List.of(movie1, movie2, movie3, movie4, movie5));
        ArrayList<Viewer> viewers = new ArrayList<>();
        viewers.add(viewer1);
        viewers.add(viewer2);
        viewers.add(viewer3);
        viewers.add(viewer4);
        viewers.add(viewer5);
        System.out.println(ViewerStatistics.averageAge(viewers));
    }
}
