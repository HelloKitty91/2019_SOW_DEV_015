public class LeapYear {

    public static final int GREGORIAN_CALENDAR_INTRODUCED_YEAR = 1582;

    public boolean isLeapYear(Integer year){
        if(year < GREGORIAN_CALENDAR_INTRODUCED_YEAR){
            return false;
        }else
            return ((isMultipleOf400(year) && !isMultipleOf4000(year)) || (isMultipleOf4(year) && !isMultipleOf100(year) && !isMultipleOf4000(year)));
    }

    private boolean isMultipleOf4(Integer year) {
        return year%4==0;
    }

    private boolean isMultipleOf100(Integer year) {
        return year%100==0;
    }

    private boolean isMultipleOf400(Integer year) {
        return year%400==0;
    }

    private boolean isMultipleOf4000(Integer year) {
        return year%4000==0;
    }

}
