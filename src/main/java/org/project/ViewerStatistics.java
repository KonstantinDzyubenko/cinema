package org.project;

import java.util.List;

public class ViewerStatistics {
    public static double averageAge(List<Viewer> viewers) {
        int sum = 0;
        for (Viewer viewer : viewers) {
            sum += viewer.getAge();
        }
        return (double) sum / viewers.size();
    }
}
