import org.junit.Before;
import org.junit.Test;

import java.time.Year;

import static org.junit.Assert.*;

public class LeapYearTest {

    private LeapYear leapYear;

    @Before
    public void setUp() throws Exception{
        leapYear = new LeapYear();
    }

    private boolean isLeapYear(Year year) {
        return leapYear.isLeapYear(year);
    }

    @Test
    public void test_isLeapYear_whenDivisibleBy400_shouldReturnTrue(){
        assertTrue(isLeapYear(Year.of(2000)));
    }

    @Test
    public void test_isLeapYear_whenDivisibleBy100ButNotBy400_shouldReturnFalse(){
        assertFalse(isLeapYear(Year.of(2100)));
    }

    @Test
    public void test_isLeapYear_whenDivisibleBy4ButNotBy100_shouldReturnTrue(){
        assertTrue(isLeapYear(Year.of(2008)));
    }

    @Test
    public void test_isLeapYear_whenNotDivisibleBy4_shouldReturnFalse(){
        assertFalse(isLeapYear(Year.of(2019)));
    }

    @Test
    public void test_isLeapYear_whenDivisibleBy4000_shouldReturnFalse(){
        assertFalse(isLeapYear(Year.of(16000)));
    }

    @Test
    public void test_isLeapYear_forInvalidYearLike0_shouldReturnFalse(){
        assertFalse(isLeapYear(Year.of(0)));
    }

    @Test
    public void test_isLeapYear_forInvalidYearLikeNegativeNumber_shouldReturnFalse(){
        assertFalse(isLeapYear(Year.of(-1)));
    }
}