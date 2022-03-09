public class Course {
    /*the basic features of a course*/
    //data
    public String courseName;

    public Professor[] instructor;
    private CollegeStudent[] listStudents;

    /*construct a course object (TWO constructors)*/
    public Course(String course, Professor[] inst, CollegeStudent[] students) {
        this.courseName = course;

        this.instructor = new Professor[inst.length];
        for(int q = 0; q < inst.length; q++) {
            this.instructor[q] = new Professor(inst[q]);
        }

        this.listStudents = new CollegeStudent[students.length];//allocate memory space
        for(int i = 0; i < students.length; i++) {
            this.listStudents[i] = new CollegeStudent(students[i]);
        }

    }
    //copy constructor
    public Course(Course c) {
        //error checking
        if(c == null || c.courseName.equals("") || c.listStudents == null) {
            System.out.println("Invalid course object! Stop!");
            System.exit(0);
        }
        this.courseName = c.courseName;

        this.instructor = new Professor[c.instructor.length];
        for(int q = 0; q < c.instructor.length; q++) {
            this.instructor[q] = new Professor(c.instructor[q]);
        }

        this.listStudents = new CollegeStudent[c.listStudents.length];//allocate memory space
        for(int i = 0; i < c.listStudents.length; i++) {
            this.listStudents[i] = new CollegeStudent(c.listStudents[i]);
        }

    }
    //set methods
    public void setListStudents(CollegeStudent[] students) {
        //this.students = students; NOT GOOD!!!!
        this.listStudents = new CollegeStudent[students.length];//request memory space
        for(int i = 0; i < students.length; i++) {
            this.listStudents[i] = new CollegeStudent(students[i]);
        }
    }

    public void setCourseName(String course) {
        this.courseName = course;
    }

    public void setInstructor(Professor[] ins) {
        this.instructor = new Professor[ins.length];
        for(int q = 0; q < ins.length; q++) {
            this.instructor[q] = new Professor(ins[q]);
        }
    }

    //get methods
    public CollegeStudent[] getStudents() {
        CollegeStudent[] temp = new CollegeStudent[this.listStudents.length];//request space in memory using internal data
        for(int j = 0; j < temp.length; j++) {
            temp[j] = new CollegeStudent(this.listStudents[j]);
        }
        return temp;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public Professor[] getInstructor() {
        Professor[] temp = new Professor[this.instructor.length];
        for(int y = 0; y < temp.length; y++) {
            temp[y] = new Professor(this.instructor[y]);
        }
        return temp;
    }

    //toString method

    public String toString() {
        String output = "";
        output += "Course Info:\n\nCourse Name: " + this.courseName + "\n";

        output += "\nInstructors List: ";
        for(int h = 0; h < this.instructor.length; h++) {
            output += "Instructor # " + (h + 1) + this.instructor[h].toString() + "\n\n";
        }
        output += "\nCollege Students List: ";
        for(int k = 0; k < this.listStudents.length; k++) {
            output += "Student # " + (k + 1) + " Info:\n" + this.listStudents[k].toString() + "\n";
        }

        return output;
    }




}
