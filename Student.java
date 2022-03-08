public class Student extends Person{
	//additional data
			private String stu_id;
			private double gpa;


	        public Student(){
	            super();
	            this.stu_id = "";
	            this.gpa = 0.0;

	        }
			
			//fully loaded constructor
			public Student(String n, int a, String s, boolean v, String s_i, double gp) {
				super(n, v, a, s);
				
				//local data
				this.stu_id = s_i;
				this.gpa = gp;

			}
			
			//copy constructor
			public Student(Student stu) {
				super(stu.getName(), stu.getAlive(), stu.getAge(), stu.getSsn());//use getter method of superclass here
				
				this.stu_id = stu.getStudentID();//use the getter method of derived class here
				this.gpa = stu.getGPA();

			}
			
			//set methods
			public void setStudentID(String alt_id) {
				this.stu_id = alt_id;
			}
			public void setGPA(double gp) {
				this.gpa = gp;
			}
			
			
			//get methods
			public String getStudentID() {
				return this.stu_id;
			}
			public double getGPA() {
				return this.gpa;
			}
			
			
			//toString method
			public String toString() {
				String output = super.toString();
				
				output += "Student Info:\nStudent ID: " + this.stu_id + "\nGPA: " + this.gpa;
				
				return output;
			}
}

