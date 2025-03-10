import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CodeTest {
    @Test
    public void testPerson() {
        Person p = new Person("John", "Brown", "Black", 20, 5.5, 150);
        assertEquals("John", p.getName());
        assertEquals("Brown", p.getEyeColor());
        assertEquals("Black", p.getHairColor());
        assertEquals(20, p.getAge());
        assertEquals(5.5, p.getHeight());
        assertEquals(150, p.getWeight());
    }

    @Test
    public void testEmployee() {
        Employee p = new Employee("John", "Brown", "Black", 20, 5.5, 150, "Software Engineer", 100000);
        assertEquals("John", p.getName());
        assertEquals("Brown", p.getEyeColor());
        assertEquals("Black", p.getHairColor());
        assertEquals(20, p.getAge());
        assertEquals(5.5, p.getHeight());
        assertEquals(150, p.getWeight());
        assertEquals("Software Engineer", p.getJobTitle());
        assertEquals(100000, p.getSalary());
    }
}
