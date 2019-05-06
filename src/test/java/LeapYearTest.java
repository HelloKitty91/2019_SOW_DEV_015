import org.junit.Test;

import static org.junit.Assert.*;

public class LeapYearTest {

    @Test
    public void test_isLeapYear_whenDivisibleBy400_shouldReturnTrue(){
        LeapYear leapYear = new LeapYear();
        Boolean isLeap = leapYear.isLeapYear(2000);
        assertTrue(isLeap);
    }

    @Test
    public void test_isLeapYear_whenDivisibleBy100ButNotBy400_shouldReturnFalse(){
        LeapYear leapYear = new LeapYear();
        Boolean isLeap = leapYear.isLeapYear(2100);
        assertFalse(isLeap);
    }

}