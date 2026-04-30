import java.util.*;

interface Department {
    void printDept();
}

class Hostel {
    String hostelName, hostelLocation;
    int rooms;

    void getHostel(String h, String l, int r) {
        hostelName = h;
        hostelLocation = l;
        rooms = r;
    }

    void printHostel() {
        System.out.println(hostelName + " " + hostelLocation + " " + rooms);
    }
}

class Student extends Hostel implements Department {
    String studentName, regdNo, elective;
    double avgMarks;

    void getData(String n, String r, String e, double m) {
        studentName = n;
        regdNo = r;
        elective = e;
        avgMarks = m;
    }

    void printData() {
        System.out.println(studentName + " " + regdNo + " " + elective + " " + avgMarks);
        printHostel();
    }

    public void printDept() {
        System.out.println("CSE Department");
    }
}

public class StudentInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();

        while (true) {
            System.out.println("1 Add 2 Search 3 Display 4 Exit");
            int ch = sc.nextInt();
            sc.nextLine();

            if (ch == 1) {
                Student s = new Student();
                System.out.print("Name: ");
                String n = sc.nextLine();
                System.out.print("Regd: ");
                String r = sc.nextLine();
                System.out.print("Elective: ");
                String e = sc.nextLine();
                System.out.print("Marks: ");
                double m = sc.nextDouble();
                sc.nextLine();

                s.getData(n, r, e, m);
                s.getHostel("H1", "Campus", 100);
                list.add(s);

            } else if (ch == 2) {
                System.out.print("Enter regd: ");
                String r = sc.nextLine();
                for (Student s : list) {
                    if (s.regdNo.equals(r)) {
                        s.printData();
                        s.printDept();
                    }
                }

            } else if (ch == 3) {
                for (Student s : list) {
                    s.printData();
                    s.printDept();
                }

            } else {
                break;
            }
        }
    }
}