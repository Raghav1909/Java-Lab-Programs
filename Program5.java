class Worker {
    String name;
    double salary_rate;

    Worker(String name, double salary_rate) {
        this.name = name;
        this.salary_rate = salary_rate;
    }
}

class DailyWorker extends Worker {

    DailyWorker(String name, double salary_rate) {
        super(name, salary_rate);
    }

    void comPay(int days) {
        double salary;
        salary = days * 24 * salary_rate;
        System.out.println("Salary of " + name + " is " + salary);
    }
}

class SalariedWorker extends Worker {
    SalariedWorker(String name, double salary_rate) {
        super(name, salary_rate);
    }

    void comPay() {
        double salary;
        salary = 40 * salary_rate;
        System.out.println("Salary of " + name + " is " + salary);
    }

}

public class Program5 {
    public static void main(String[] args) {
        DailyWorker d = new DailyWorker("ABC", 100);
        SalariedWorker s = new SalariedWorker("XYZ", 200);
        d.comPay(30);
        s.comPay();
    }
}