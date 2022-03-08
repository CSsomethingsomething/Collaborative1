public class Main {
 public static void main (String []args) {
	 //3 Professors
	 Professor p1 = new Professor ("Mathematics", "Differential Ideas", "Full Professor", true, "4013941", 5000, 13, "Daniel", true, 46, "219-41-5195");
	 Professor p2 = new Professor ("Physics", "Quantum Gravity", "Associate Professor", true, "9512012", 4300, 8, "Timothy", true, 36, "410-51-6912");
	 Professor p3 = new Professor ("Arquitecture", "Heritage Conservation", "Full Professor", true, "1923191", 4700, 18, "Cleo", true, 49, "613-12-6129");

	 System.out.println(p1);
	 System.out.println(p2);
	 System.out.println(p3);
	 
	 //4 Students
	 Student s1 = new Student ("Amy", 18, "311-51-5195", true, "9135918", 3.6);
	 Student s2 = new Student ("Richard", 19, "516-22-6192", true, "1058276", 3.7);
	 Student s3 = new Student ("Theo", 18, "951-58-2518", true, "5019285", 3.2);
	 Student s4 = new Student ("Grace", 18, "515-59-5187", true, "4023922", 3.3);
	 
	 System.out.println(s1);
	 System.out.println(s2);
	 System.out.println(s3);
	 System.out.println(s4);
	 
	 //3 courses
	  College_Student[] ls1 = new College_Student [3];
	   ls1 [0] = new College_Student("Amy", 18, "311-51-5195", true, "9135918", 3.6, "Biology", "B+");
	   ls1 [1] = new College_Student("Richard", 19, "516-22-6192", true, "1058276", 3.7, "Computer Science", "A");
	   ls1 [2] = new College_Student("Theo", 18, "951-58-2518", true, "5019285", 3.2, "Philosophy", "B");
	   
	 Course math = new Course("MATH125", "125", "Daniel", ls1);
	 
	 
	 College_Student[] ls2 = new College_Student [2];
	   ls2 [0] = new College_Student("Amy", 18, "311-51-5195", true, "9135918", 3.6, "Biology", "B+");
	   ls2 [1] = new College_Student("Grace", 18, "515-59-5187", true, "4023922", 3.3, "Graphics Design", "B+");
	   
	 Course phys = new Course("PHYS120", "120", "Timothy", ls2);
	 
	 
	 College_Student[] ls3 = new College_Student [2];
	   ls3 [0] = new College_Student("Richard", 19, "516-22-6192", true, "1058276", 3.7, "Computer Science", "A");
	   ls3 [1] = new College_Student("Theo", 18, "951-58-2518", true, "5019285", 3.2, "Philosophy", "B");
	   
	 Course arch = new Course("ARCH111", "111", "Cleo", ls3);
	 
	 System.out.println(math);
	 System.out.println(phys);
	 System.out.println(arch);
	 
	 //2 departments
	 
	 Professor p4 = new Professor ("Physics", "Particle Physics", "Full Professor", true, "1952916", 6000, 20, "Martin", true, 55, "512-61-1293");
	 Professor[] f1 = new Professor [3];
	  f1 [0] = new Professor(p4);
	  f1 [1] = new Professor(p1);
	  f1 [2] = new Professor(p2);
	  
	 Course[] c1 = new Course [2];
	  c1 [0] = new Course(math);
	  c1 [1] = new Course(phys);
	 
	 Department d1 = new Department(p4, f1, c1);
	 
	 
	 Professor p5 = new Professor("Arquitecture", "Arquitectural Theory", "Full Professor", true, "4105182", 5700, 24, "Sharon", true, 58, "629-20-1851");
	 Professor[] f2 = new Professor [2];
	  f2 [0] = new Professor(p5);
	  f2 [1] = new Professor(p3);
	  
	 Course[] c2 = new Course [1];
	  c2 [0] = new Course(arch); 
	  
	 Department d2 = new Department(p5, f2, c2);
	 
	 
	 //System.out.println(d1); 
	 System.out.println(d2);
	 
 }
}
