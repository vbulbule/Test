package com.vitthal.java.collection.comparatordemo;

import java.util.Comparator;

public class EmpIDComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {

        Employee e1 = (Employee) o1;
        Employee e2 = (Employee) o2;

        if(e1.empID == e2.empID)
            return 0;
        else if (e1.empID > e2.empID) {
            return 1;
        }
        else
            return -1;

    }
}
