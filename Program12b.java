enum dayOfWeek {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

class DayOfWeek {
    boolean workDay(dayOfWeek day) {
        if (day == dayOfWeek.SATURDAY || day == dayOfWeek.SUNDAY)
            return false;
        return true;
    }
}

public class Program12b {
    public static void main(String[] args) {
        DayOfWeek d = new DayOfWeek();
        System.out.println(d.workDay(dayOfWeek.FRIDAY));
        System.out.println(d.workDay(dayOfWeek.SUNDAY));

    }
}
