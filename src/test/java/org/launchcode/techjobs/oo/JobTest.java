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
        assertEquals("IDs don't match",false,job_t4.equals(job_t5)); // this broke it!!!!!!!!!! errant "
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job_t6 = new Job();
        String job_t6_String = job_t6.toString();

        assertTrue("Job description should start with a newline", job_t6_String.startsWith(System.lineSeparator()));
        assertTrue("Job description should end with a newline", job_t6_String.endsWith(System.lineSeparator()));
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job job_t8 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        String lineSep = System.lineSeparator();
        String resulteder = lineSep + "ID: " + job_t8.getId() + lineSep +
                "Name: Data not available" + lineSep +
                "Employer: Data not available" + lineSep +
                "Location: Data not available" + lineSep +
                "Position Type: Data not available" + lineSep +
                "Core Competency: Data not available" + lineSep;

        assertEquals(resulteder, job_t8.toString());
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job job_t9 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
        String lineSep = System.lineSeparator();

        String result_t9 = lineSep + "ID: " + job_t9.getId() + "\n" +
                "Name: Web Developer" + "\n" +
                "Employer: LaunchCode" +  "\n" +
                "Location: St. Louis" +  "\n" +
                "Position Type: Front-end developer" +  "\n" +
                "Core Competency: JavaScript" + "\n";

        assertEquals(result_t9, job_t9.toString());
    }





}
