package org.launchcode.techjobs.oo;


import org.junit.Test;
import static org.junit.Assert.*; // had to change dependency to get this to load https://junit.org/junit4/javadoc/4.13/org/junit/Assert.html#assertNotEquals(double,%20double,%20double)

public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId() {
    Job job_t1 = new Job();
    Job job_t2 = new Job();
    assertNotEquals("Empty Job not equal",job_t1.getId(), job_t2.getId());
    }
    @Test
    public void testJobConstructorSetsAllFields() {
        Job job_t3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue("Name Type Correct",job_t3.getName() instanceof String);
        assertTrue(job_t3.getEmployer() instanceof Employer);
        assertTrue(job_t3.getLocation() instanceof Location);
        assertTrue(job_t3.getPositionType() instanceof PositionType);
        assertTrue(job_t3.getCoreCompetency() instanceof CoreCompetency);
        System.out.println(job_t3.getName());
        assertEquals("Name is correct","Product tester", job_t3.getName());
        assertEquals("Employer is correct","ACME",job_t3.getEmployer().getValue());
        assertEquals("Location is correct","Desert",job_t3.getLocation().getValue());
        assertEquals("Position is correct","Quality control",job_t3.getPositionType().getValue());
        assertEquals("CoreCompetency is correct","Persistence",job_t3.getCoreCompetency().getValue());
    }
    @Test
    public void testJobsForEquality() {
        Job job_t4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job_t5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

}
