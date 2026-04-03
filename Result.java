interface Exam{

    double percentage_cal(double marks1, double marks2);

}

class Student{

    String name;
    int roll_no;
    double marks1;
    double marks2;

    Student(String name, int roll_no, double marks1, double marks2){

        this.name = name;
        this.roll_no = roll_no;
        this.marks1 = marks1;
        this.marks2 = marks2;

    }

    void show(){

        System.out.println("Name: " + name);
        System.out.println("Roll no: " + roll_no);
        System.out.println("Marks1: " + marks1);
        System.out.println("Marks2: " + marks2);

    }

}

class Result extends Student implements Exam{


    Result(String name, int roll_no, double marks1, double marks2){
        super(name, roll_no, marks1, marks2);
    }

    public double percentage_cal(double marks1, double marks2){
        return ((marks1+marks2)/200)*100;
    }

    public static void main(String[] args) {
        
        Result r = new Result("Anik Biswas", 16, 98, 89.0);
        
        r.show();
        System.out.println("Percentage: " + r.percentage_cal(98,89.0));
    }


}
