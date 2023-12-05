

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
    private ClockTime clockTim1;
    private ClockTime clockTim2;

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
        clockTim1 = new ClockTime(1, 30, 0);
        clockTim2 = new ClockTime(1, 30, 0);
        clockTim1.toString();
        
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

    @Test
    public void to11AM()
    {
        clockTim1.setHour(11);
        clockTim1.setMinute(0);
        clockTim1.setSecond(0);
        assertEquals("11:00:00", clockTim1.toString());
    }
}



