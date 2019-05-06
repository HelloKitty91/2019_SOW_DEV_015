public class LeapYear {

    public boolean isLeapYear(int year){
        return ((isMultipleOf400(year) && !isMultipleOf4000(year)) || (isMultipleOf4(year) && !isMultipleOf100(year) && !isMultipleOf4000(year)));
    }

    private boolean isMultipleOf100(int year) {
        return year%100==0;
    }

    private boolean isMultipleOf4(int year) {
        return year%4==0;
    }

    private boolean isMultipleOf4000(int year) {
        return year%4000==0;
    }

    private boolean isMultipleOf400(int year) {
        return year%400==0;
    }

}
