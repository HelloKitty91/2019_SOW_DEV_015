import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LeapYearTest {

    private LeapYear leapYear;
    private Boolean expectedResult;
    private Integer year;

    @Before
    public void setUp() throws Exception{
        leapYear = new LeapYear();
    }

    public LeapYearTest(Integer year, Boolean expectedResult){
        this.year = year;
        this.expectedResult = expectedResult;
    }

    private boolean isLeapYear(Integer year) {
        return leapYear.isLeapYear(year);
    }

    @Test
    public void test_isLeapYear_whenDivisibleBy400_shouldReturnTrue(){
        assertTrue(isLeapYear(2000));
    }

    @Test
    public void test_isLeapYear_whenDivisibleBy100ButNotBy400_shouldReturnFalse(){
        assertFalse(isLeapYear(2100));
    }

    @Test
    public void test_isLeapYear_whenDivisibleBy4ButNotBy100_shouldReturnTrue(){
        assertTrue(isLeapYear(2008));
    }

    @Test
    public void test_isLeapYear_whenNotDivisibleBy4_shouldReturnFalse(){
        assertFalse(isLeapYear(2019));
    }

    @Test
    public void test_isLeapYear_whenDivisibleBy4000_shouldReturnFalse(){
        assertFalse(isLeapYear(16000));
    }

    @Test
    public void test_isLeapYear_forInvalidYearLike0_shouldReturnFalse(){
        assertFalse(isLeapYear(0));
    }

    @Test
    public void test_isLeapYear_forInvalidYearLikeNegativeNumber_shouldReturnFalse(){
        assertFalse(isLeapYear(-1));
    }

    @Test
    public void test_isLeapYear_forYearBeforeGregorianCalendar1582_shouldReturnFalse(){
        assertFalse(isLeapYear(1580));
    }

    @Parameterized.Parameters
    public static Collection years(){
        return Arrays.asList(new Object[][]{
                {1600, true}  ,
                {1700, false} ,
                {1800, false} ,
                {1900, false} ,
                {2012, true}  ,
                {2016, true}  ,
                {2020, true}  ,
                {2017, false} ,
                {2018, false} ,
                {4000, false} ,
                {0000, false}
        });
    }

    @Test
    public void testIfLeapYearOrNot(){
        assertEquals(expectedResult, isLeapYear(year));
    }

}