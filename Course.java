public class Course {
	/*the basic features of a course*/
	//data
	public String courseName;
	private String courseNumber;
	public String instructorName;
	private College_Student[] listCStudents;
	
	/*construct a course object (TWO constructors)*/
	public Course(String course, String number, String instructor, College_Student[] cstudents) {
		this.courseName = course;
		this.courseNumber = number;
		this.instructorName = instructor;
		
		this.listCStudents = new College_Student[cstudents.length];//allocate memory space
			for(int i = 0; i < cstudents.length; i++) {
				this.listCStudents[i] = new College_Student(cstudents[i]);
			}
		
	}
	//copy constructor
	public Course(Course c) {
		//error checking
		if(c == null || c.courseName.equals("") || c.courseNumber.equals("") || c.instructorName.equals("") || c.listCStudents == null) {
			System.out.println("Invalid course object! Stop!");
			System.exit(0);
		}
		this.courseName = c.courseName;
		this.courseNumber = c.courseNumber;
		this.instructorName = c.instructorName;
		this.listCStudents = c.getStudents();
		
	}
	//set methods
	public void setListStudents(College_Student[] cstudents) {
		//this.students = students; NOT GOOD!!!!
		this.listCStudents = new College_Student[cstudents.length];//request memory space
		for(int i = 0; i < cstudents.length; i++) {
			this.listCStudents[i] = new College_Student(cstudents[i]);
		}
	}
	
	public void setCourseName(String course) {
		this.courseName = course;
	}
	
	public void setCourseNumber(String number) {
		this.courseNumber = number;
	}
	
	public void setInstructorName(String instructor) {
		this.instructorName = instructor;
	}
	
	//get methods
	public College_Student[] getStudents() {
		College_Student[] temp = new College_Student[this.listCStudents.length];//request space in memory using internal data
			for(int j = 0; j < temp.length; j++) {
				temp[j] = new College_Student(this.listCStudents[j]);
			}
			return temp;	
	}
	
	public String getCourseName() {
		return this.courseName;
	}
	
	public String getCourseNumber() {
		return this.courseNumber;
	}
	
	public String getInstructorNmae() {
		return this.instructorName;
	}
	
	//toString method
	
	public String toString() {
		String output = "";
		output += "\nCourse Info:\nCourse Name: " + this.courseName;
		output += "\nCourse Number: " + this.courseNumber;
		output += "\nInstructor Name: " + this.instructorName;
		output += "\n\nStudent List: \n";
				for(int k = 0; k < this.listCStudents.length; k++) {
					output += "Student #" + (k + 1) + " Info:\n" + this.listCStudents[k].toString() + "\n";
		}
		
		return output;
	}
}
