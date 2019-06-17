import TechStaff.DbAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DbAdminTest {

    DbAdmin dbAdmin;

    @Before
    public void before() {
        dbAdmin = new DbAdmin("Jeb", "784ydf92h", 26000);
    }


    @Test
    public void dbAdminHasName() {
        assertEquals("Jeb", dbAdmin.getName());
    }

    @Test
    public void canChangeName() {
        dbAdmin.setname("Harold");
        assertEquals("Harold", dbAdmin.getName());
    }

    @Test
    public void cantSetNameNull() {
        dbAdmin.setname(null);
        assertEquals("Jeb", dbAdmin.getName());
    }

    @Test
    public void dbAdminHasNiNumber() {
        assertEquals("784ydf92h", dbAdmin.getNiNumber());
    }

    @Test
    public void dbAdminHasSalary() {
        assertEquals(26000.00, dbAdmin.getSalary(), 0.1);
    }

    @Test
    public void dbAdminCanRaiseSalary() {
        dbAdmin.raiseSalary(2000.00);
        assertEquals(28000.00, dbAdmin.getSalary(), 0.1);
    }

    @Test
    public void cantRaiseSalaryByNegative() {
        dbAdmin.raiseSalary(-4000.00);
        assertEquals(26000.00, dbAdmin.getSalary(), 0.1);
    }

    @Test
    public void dbAdmincanGetBonus() {
        assertEquals(260.00, dbAdmin.payBonus(), 0.1);
    }

}
