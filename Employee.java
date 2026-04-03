interface Gross {
    double calculateGross(double basic);
}

class Salary {
    double basic = 30000;

    void showBasic() {
        System.out.println("Basic Salary: " + basic);
    }
}

class Employee extends Salary implements Gross {

    double hra = 0.2;
    double da = 0.1;

    public double calculateGross(double basic) {
        return basic + (basic * hra) + (basic * da);
    }

    void display() {
        showBasic();
        double gross = calculateGross(basic);
        System.out.println("Gross Salary: " + gross);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.display();
    }
}