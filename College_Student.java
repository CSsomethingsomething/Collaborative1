public class College_Student extends Student{
    private String major;
    private String grade;
    // probably constructors and accessors here
    

    public College_Student(){
        super();
        this.major = "";
        this.grade = "";
    }

    
    public College_Student(String n, int a, String s, boolean v, String s_i, double gp, String major,  String g){
        super(n, a, s, v, s_i, gp);
        this.major = major;
        this.grade = g;
    }

    public College_Student(College_Student studentBase){
        super(studentBase.getName(), studentBase.getAge(), studentBase.getSsn(), studentBase.getAlive(), studentBase.getStudentID(), studentBase.getGPA());
        this.major = studentBase.getMajor();
        this.grade = studentBase.getGrade();

    }

    public String getMajor(){
        return this.major;
    }

    public void setMajor(String arg){
        this.major = arg;
    }

    public void setGrade(String g) {
        this.grade = g;
    }
    public String getGrade() {
        return this.grade;
    }


    public String toString(){
        return "Student id: " + this.major + "\ngrade: " + this.grade;
    }
}



