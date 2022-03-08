public class Student extends Person{
	//additional data
			private String stu_id;
			private double gpa;
			private String grade;

	        public Student(){
	            super();
	            this.stu_id = "";
	            this.gpa = 0.0;
	            this.grade = "";
	        }
			
			//fully loaded constructor
			public Student(String n, int a, String s, boolean v, String s_i, double gp, String g) {
				super(n, v, a, s);
				
				//local data
				this.stu_id = s_i;
				this.gpa = gp;
				this.grade = g;
			}
			
			//copy constructor
			public Student(Student stu) {
				super(stu.getName(), stu.getAlive(), stu.getAge(), stu.getSsn());//use getter method of superclass here
				
				this.stu_id = stu.getStudentID();//use the getter method of derived class here
				this.gpa = stu.getGPA();
				this.grade = stu.getGrade();
			}
			
			//set methods
			public void setStudentID(String alt_id) {
				this.stu_id = alt_id;
			}
			public void setGPA(double gp) {
				this.gpa = gp;
			}
			public void setGrade(String g) {
				this.grade = g;
			}
			
			//get methods
			public String getStudentID() {
				return this.stu_id;
			}
			public double getGPA() {
				return this.gpa;
			}
			public String getGrade() {
				return this.grade;
			}
			
			//toString method
			public String toString() {
				String output = super.toString();
				
				output += "Student Info:\nStudent ID: " + this.stu_id + "\nGPA: " + this.gpa + "\nGrade: " + this.grade + "\n\n";
				
				return output;
			}
}

