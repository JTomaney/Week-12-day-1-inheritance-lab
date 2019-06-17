import TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Jeb", "784ydf92h", 26000);
    }
    

    @Test
    public void developerHasName() {
        assertEquals("Jeb", developer.getName());
    }

    @Test
    public void canChangeName() {
        developer.setname("Harold");
        assertEquals("Harold", developer.getName());
    }

    @Test
    public void cantSetNameNull() {
        developer.setname(null);
        assertEquals("Jeb", developer.getName());
    }

    @Test
    public void developerHasNiNumber() {
        assertEquals("784ydf92h", developer.getNiNumber());
    }

    @Test
    public void developerHasSalary() {
        assertEquals(26000.00, developer.getSalary(), 0.1);
    }

    @Test
    public void developerCanRaiseSalary() {
        developer.raiseSalary(2000.00);
        assertEquals(28000.00, developer.getSalary(), 0.1);
    }

    @Test
    public void cantRaiseSalaryByNegative() {
        developer.raiseSalary(-4000.00);
        assertEquals(26000.00, developer.getSalary(), 0.1);
    }

    @Test
    public void developercanGetBonus() {
        assertEquals(260.00, developer.payBonus(), 0.1);
    }

}
