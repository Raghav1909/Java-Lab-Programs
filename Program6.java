interface Student {
    void displayGrade();

    void attendance(int percentage);
}

class UG_students implements Student {
    String USN, name;
    int m1, m2, m3;

    public void displayGrade() {
        double avg = (m1 + m2 + m3) / 3;
        if (avg > 60)
            System.out.println("Distinction");

        else if (avg < 60 && avg >= 40)
            System.out.println("FC");

        else
            System.out.println("Fail");
    }

    public void attendance(int percentage) {
        if (percentage > 75)
            System.out.println("Student is eligible to take exam");
        else
            System.out.println("Student is not eligible to take exam");
    }
}

class PG_students implements Student {
    String USN, name;
    int m1, m2, m3;

    public void displayGrade() {
        double avg = (m1 + m2 + m3) / 3;
        if (avg > 75)
            System.out.println("Distinction");

        else if (avg < 75 && avg >= 60)
            System.out.println("FC");

        else
            System.out.println("Fail");
    }

    public void attendance(int percentage) {
        if (percentage > 85)
            System.out.println("Student is eligible to take exam.");
        else
            System.out.println("Student is not eligible to take exam.");
    }
}

public class Program6 {
    public static void main(String[] args) {
        UG_students ug = new UG_students();
        PG_students pg = new PG_students();
        ug.displayGrade();
        pg.displayGrade();
        ug.attendance(30);
        pg.attendance(100);
    }
}