import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Bob", "0883992983", 28000.00, "Stationery");
    }

    @Test
    public void managerHasName() {
        assertEquals("Bob", manager.getName());
    }

    @Test
    public void canChangeName() {
        manager.setname("Harold");
        assertEquals("Harold", manager.getName());
    }

    @Test
    public void cantSetNameNull() {
        manager.setname(null);
        assertEquals("Bob", manager.getName());
    }

    @Test
    public void managerHasNiNumber() {
        assertEquals("0883992983", manager.getNiNumber());
    }

    @Test
    public void managerHasSalary() {
        assertEquals(28000.00, manager.getSalary(), 0.1);
    }

    @Test
    public void managerHasDeptName() {
        assertEquals("Stationery", manager.getDeptName());
    }

    @Test
    public void managerCanRaiseSalary() {
        manager.raiseSalary(2000.00);
        assertEquals(30000.00, manager.getSalary(), 0.1);
    }

    @Test
    public void cantRaiseSalaryByNegative() {
        manager.raiseSalary(-4000.00);
        assertEquals(28000.00, manager.getSalary(), 0.1);
    }

    @Test
    public void managercanGetBonus() {
        assertEquals(280.00, manager.payBonus(), 0.1);
    }

}
