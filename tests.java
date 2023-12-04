

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class tests.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class tests
{
    /**
     * Default constructor for test class tests
     */
    public tests()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void isDif()
    {
        TestClockTime testCloc1 = new TestClockTime();
    }

    @Test
    public void isSame()
    {
        ClockTime clockTim1 = new ClockTime(11, 59, 60);
        ClockTime clockTim2 = new ClockTime(12, 0, 0);
        assertEquals(true, clockTim1.equals(clockTim2));
    }
}


