public class College_Student extends Student{
    private String major;
    private double gpa;

    // probably constructors and accessors here

    public College_Student(){
        super();
        this.major = "";
        this.gpa = 0.0;
    }

    
    public College_Student(String n, int a, String s, boolean v, String s_i, double gp, String g, String major, double gpa){
        super(n, a, s, v, s_i, gp, g);
        this.major = major;
        this.gpa = gpa;
    }

    public College_Student(College_Student studentBase){
        super(studentBase.getName(), studentBase.getAge(), studentBase.getSsn(), studentBase.getAlive(), studentBase.getStudentID(), studentBase.getGPA(), studentBase.getGrade());
        this.major = studentBase.getMajor();
        this.gpa = studentBase.getGPA();
    }

    public String getMajor(){
        return this.major;
    }

    public double getGpa(){
        return this.gpa;
    }

    public void setMajor(String arg){
        this.major = arg;
    }

    public void setGpa(double arg){
        this.gpa = arg;
    }

    public String toString(){
        return "Student id: " + this.major + "\ngpa: " + this.gpa;
    }
}



