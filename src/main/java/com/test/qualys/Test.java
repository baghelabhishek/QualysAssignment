package com.test.qualys;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class Test {

    public static void main(String[] args) {
        Table<String, String, Integer> universityCourseSeatTable = HashBasedTable.create();
        universityCourseSeatTable.put("Mumbai", "Chemical", 120);
        universityCourseSeatTable.put("Mumbai", "IT", 60);
        universityCourseSeatTable.put("Harvard", "Electrical", 60);
        universityCourseSeatTable.put("Harvard", "IT", 120);

        int seatCount = universityCourseSeatTable.get("Mumbai", "IT");
        Integer seatCountForNoEntry = universityCourseSeatTable.get("Harvard", "IT");


        System.out.println("row one "+seatCount);
        System.out.println("row 2 "+seatCountForNoEntry);
    }
}
