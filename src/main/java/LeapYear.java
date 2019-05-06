import java.time.Year;

public class LeapYear {

    public boolean isLeapYear(Year year){
        int integerValueOfYear = Integer.parseInt(String.valueOf(year));
        return ((isMultipleOf400(integerValueOfYear) && !isMultipleOf4000(integerValueOfYear)) || (isMultipleOf4(integerValueOfYear) && !isMultipleOf100(integerValueOfYear) && !isMultipleOf4000(integerValueOfYear)));
    }

    private boolean isMultipleOf4(int year) {
        return year%4==0;
    }

    private boolean isMultipleOf100(int year) {
        return year%100==0;
    }

    private boolean isMultipleOf400(int year) {
        return year%400==0;
    }

    private boolean isMultipleOf4000(int year) {
        return year%4000==0;
    }

}
