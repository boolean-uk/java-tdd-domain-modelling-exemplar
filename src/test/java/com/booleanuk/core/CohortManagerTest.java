package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class CohortManagerTest {
    CohortManager manager;

    public CohortManagerTest() {
        ArrayList<String> withCohorts = new ArrayList<String>();
        withCohorts.add("Cohort 8");
        withCohorts.add("Cohort 9");
        withCohorts.add("Cohort 10");
        withCohorts.add("C-Sharp");
        withCohorts.add("Java");
        this.manager = new CohortManager(withCohorts);
    }

    @Test
    public void searchForExistingName() {
        Assertions.assertTrue(this.manager.search("Java"));
    }

    @Test
    public void searchForMissingName() {
        Assertions.assertFalse(this.manager.search("Python"));
    }
}
