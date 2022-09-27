package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor1 = new Visitor(30, 200.60, 30.50);
        visitor2 = new Visitor(17, 109.89, 12.50);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void canRide(){
        assertEquals(true, rollerCoaster.isAllowedTo(visitor1));
    }

    @Test
    public void cannotRide(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitor2));
    }

    @Test
    public void chargedIfSmall(){
        assertEquals(4.50, rollerCoaster.charge(visitor2), 0);
    }

    @Test
    public void tallCuntPrice(){
        assertEquals(9.00, rollerCoaster.charge(visitor1), 0);
    }
}
