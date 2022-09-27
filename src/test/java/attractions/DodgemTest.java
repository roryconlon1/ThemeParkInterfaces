package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        visitor1 = new Visitor(30, 200.60, 30.50);
        visitor2 = new Visitor(11, 109.89, 12.50);

    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void normalPrice(){
        assertEquals(4.50, dodgems.charge(visitor1), 0);
    }

    @Test
    public void weansPrice(){
        assertEquals(2.75, dodgems.charge(visitor2), 0);
    }

}
