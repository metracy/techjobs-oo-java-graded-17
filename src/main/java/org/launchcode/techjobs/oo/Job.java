package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job (){
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }
    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
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

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    //Getters

    public int getId() {
        return id;
    }

    public String getName() {return name;}

    public Employer getEmployer() {return employer;}

    public Location getLocation() {return location;}

    public PositionType getPositionType() {return positionType;}

    public CoreCompetency getCoreCompetency() {return coreCompetency;}

    // Setters

    public void setName(String value) {
        this.name = value; // This broke things needs set to value not name
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency){
        this.coreCompetency = coreCompetency;
    }

    public String toString(){
        // Jay suggested throwing in ternary operations a while back in GA6 so going to implement that
        String result = "\n";
        result = "ID: " + id + "\n";

        result += "Name: " + ((name == null || name.equals("")) ? "Data not available" : name) + "\n";
        result += "Employer:  " + ((employer == null || name.equals("")) ? "Data not available" : employer) + "\n";
        result += "Location: " + ((location == null || location.equals("")) ? "Data not available" : location) + "\n";
        result += "Position Type: " + ((positionType == null || positionType.equals("")) ? "Data not available" : positionType) + "\n";
        result += "Core Competency: " + ((coreCompetency == null || coreCompetency.equals("")) ? "Data not available" : coreCompetency) + "\n";

        return result.toString();
    }


}
