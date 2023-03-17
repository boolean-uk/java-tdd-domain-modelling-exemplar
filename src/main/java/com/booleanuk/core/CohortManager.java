package com.booleanuk.core;

import java.util.ArrayList;

public class CohortManager {

    ArrayList<String> cohorts;

    public CohortManager(ArrayList<String> groups) {
        this.cohorts = groups;
    }

    public boolean search(String name) {
        return this.cohorts.contains(name);
    }


}
