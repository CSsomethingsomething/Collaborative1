public class College_Student extends Student{
    // up to you ken if you wanna keep these public or make them private
    
    public String stu_id;
    public double gpa;

    // probably constructors and accessors here

    public College_Student(){
        super();
        this.stu_id = "";
        this.gpa = 0.0;
    }

    
    public College_Student(String n, int a, String s, boolean v, String s_i, double gp, String g, String stuid, double gpa){
        super(n, a, s, v, s_i, gp, g);
        this.stu_id = stuid;
        this.gpa = gpa;
    }

    public College_Student(College_Student studentBase){
        super(studentBase.getName(), studentBase.getAge(), studentBase.getSsn(), studentBase.getAlive(), studentBase.getStuId(), studentBase.getGPA(), studentBase.getGrade());
        this.stu_id = studentBase.getStuId();
        this.gpa = studentBase.getGPA();
    }

    public String getStuId(){
        return this.stu_id;
    }

    public double getGpa(){
        return this.gpa;
    }

    public void setStuId(String arg){
        this.stu_id = arg;
    }

    public void setGpa(double arg){
        this.gpa = arg;
    }

    public String toString(){
        return "Student id: " + this.stu_id + "\ngpa: " + this.gpa;
    }
}
