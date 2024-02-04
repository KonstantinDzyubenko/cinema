package org.project;

import java.util.ArrayList;

public class CinemaApplicationRun {
    public static void main( String[] args ) {
        Viewer viewer1 = new Viewer("viewer1", 18, 1);
        Viewer viewer2 = new Viewer("viewer2", 19, 2);
        Viewer viewer3 = new Viewer("viewer3", 20, 3);
        Viewer viewer4 = new Viewer("viewer4", 21, 4);
        Viewer viewer5 = new Viewer("viewer5", 22, 5);
        ArrayList<Viewer> viewers = new ArrayList<>();
        viewers.add(viewer1);
        viewers.add(viewer2);
        viewers.add(viewer3);
        viewers.add(viewer4);
        viewers.add(viewer5);
        System.out.println(ViewerStatistics.averageAge(viewers));
    }
}
