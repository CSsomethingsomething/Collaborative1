public class Department {
    //data
	private Professor chair;
	private Professor[] faculty;
	private Course[] courses;

	public Department(){
		this.chair = new Professor();
		this.faculty = new Professor[]{};
		this.courses = new Course[]{};
	}
	public Department(Department depin){

		this.chair = new Professor(depin.getChair());
		Professor[] facultyargin = depin.getFaculty();
		this.faculty = new Professor[facultyargin.length];
		for(int i = 0; i < facultyargin.length; i++){
			this.faculty[i] = new Professor(facultyargin[i]);
		}
		Course[] courseargin = depin.getCourses();
		this.courses = new Course[courseargin.length];
		for(int i = 0; i < courseargin.length; i++){
			this.courses[i] = new Course(courseargin[i]);
		}
	}
	public Department(Professor profin, Professor[] profsin, Course[] coursesin){
		this.chair = new Professor(profin);

		this.faculty = new Professor[profsin.length]; 
		for(int i = 0; i < profsin.length; i++){
			this.faculty[i] = new Professor(profsin[i]);
		}
		this.courses = new Course[coursesin.length];
		for(int i = 0; i < coursesin.length; i++){
			this.courses[i] = new Course(coursesin[i]);
		}
	}

	public Professor getChair(){
		return this.chair;
	}
	public Professor[] getFaculty(){
		return this.faculty;
	}
	public Course[] getCourses(){
		return this.courses;
	}

	public void setChair(Professor argin){
		this.chair = new Professor(argin);
	}
	public void setFaculty(Professor[] argin){
		this.faculty = new Professor[argin.length];
		for(int i = 0; i < argin.length; i++){
			this.faculty[i] = new Professor(argin[i]);
		}
	}
	public void setCourses(Course[] argin){
		this.courses = new Course[argin.length];
		for(int i = 0; i < argin.length; i++){
			this.courses[i] = new Course(argin[i]);
		}
	}

	public String toString(){
		String retstring = "Chair: " + this.chair.toString() + "\nFaculties:\n";
		for(int i = 0; i < this.faculty.length; i++){
			retstring += this.faculty[i].toString() + "\n";
		}
		retstring += "Courses:\n";
		for(int i = 0; i < this.courses.length; i++){
			 System.out.println(this.courses[i]); 
			retstring += this.courses[i].toString() + "\n";
		}
		return retstring;
	}
}
