package es.upm.miw.forge.ecp2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class UserTest {

    private User user;

    @Before
    public void before() {
        user = new User(147, "Carlos", "Blanco");
    }

    @Test
    public void testUser() {
        assertEquals(147, user.getNumber());
        assertEquals("Carlos", user.getName());
        assertEquals("Blanco", user.getFamilyName());
    }
    

    

}
