import Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Gene", "8ydhe7", 50000.00, "Legal", 4000000.00);
    }
    

    @Test
    public void directorHasName() {
        assertEquals("Gene", director.getName());
    }

    @Test
    public void canChangeName() {
        director.setname("Harold");
        assertEquals("Harold", director.getName());
    }

    @Test
    public void cantSetNameNull() {
        director.setname(null);
        assertEquals("Gene", director.getName());
    }

    @Test
    public void directorHasNiNumber() {
        assertEquals("8ydhe7", director.getNiNumber());
    }

    @Test
    public void directorHasSalary() {
        assertEquals(50000.00, director.getSalary(), 0.1);
    }

    @Test
    public void directorCanRaiseSalary() {
        director.raiseSalary(2000.00);
        assertEquals(52000.00, director.getSalary(), 0.1);
    }

    @Test
    public void cantRaiseSalaryByNegative() {
        director.raiseSalary(-4000.00);
        assertEquals(50000.00, director.getSalary(), 0.1);
    }

    @Test
    public void directorcanGetBonus() {
        assertEquals(500.00, director.payBonus(), 0.1);
    }

    @Test
    public void directorCanGetBudget() {
        assertEquals(4000000.00, director.getBudget(), 0.1);
    }
}
