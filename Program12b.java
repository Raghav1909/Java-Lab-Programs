enum days {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

class DayOfWeek {
    boolean workDay(days day) {
        if (day == days.SATURDAY || day == days.SUNDAY)
            return false;
        return true;
    }
}

public class Program12b {
    public static void main(String[] args) {
        DayOfWeek d = new DayOfWeek();
        System.out.println(d.workDay(days.FRIDAY));
        System.out.println(d.workDay(days.SUNDAY));

    }
}
