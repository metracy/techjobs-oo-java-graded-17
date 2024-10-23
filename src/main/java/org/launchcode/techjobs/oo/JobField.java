package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {
    private static int nextId = 1;
    private int id;
    private String value;

    public JobField() {id = nextId++;}

    public JobField(String value) {
        this();
        this.value = value;
    }

    public int getId() {return id;}
    public String getValue() {return value;}
    public void setValue(String value) {this.value = value;}

    @Override
    public boolean equals(Object o) {  // Two objects are = if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Job job)) return false;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return value;
    }




}
