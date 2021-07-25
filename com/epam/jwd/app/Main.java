package com.epam.jwd.app;

import com.epam.jwd.model.Point;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger LOG = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        LOG.info("Program start!");
        if(args.length < 1){
            LOG.error("Not enough arguments");
            return;
        }
        int n = Integer.parseInt(args[0]);
        if(n < 1){
            LOG.error("The number of points must not be less than 1");
        }
        Point[] points = new Point[n];
        for (int i = 0; i < points.length; i++) {
            Point point = new Point(Math.random(),Math.random());
            points[i] = point;
            LOG.trace(point.toString());
        }
        LOG.info("Program end");
    }
}