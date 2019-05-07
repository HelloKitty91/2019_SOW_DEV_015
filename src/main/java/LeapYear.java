public class LeapYear {

    public boolean isLeapYear(Integer year){
        if(year<1582){
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
