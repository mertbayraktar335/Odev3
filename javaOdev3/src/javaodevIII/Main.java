package javaodevIII;

public class Main {

	public static void main(String[] args) {
		
	Student student1 = new Student();
	
	student1.id="1";
	student1.setName("Mert Bayraktar");
	student1.Pass="xxxxxxxxxxxxx";
	student1.setUserName("XXXXX");
	student1.setStudentNum("1233");
	
	Instructor instructor1 = new Instructor();
	
	instructor1.id="2";
	instructor1.setname("Engin Demiroğ");
	instructor1.Pass="xxxxxxxxxxxxx";
	
	
	
    Course course1 = new Course();
    
    course1.setName("Java");
	
	
	UserManager usermanager =new UserManager();
	
	usermanager.addUser(instructor1);
	System.out.println("***********************************");
    
    InstructorManager instructormanager1 = new InstructorManager();
    
    instructormanager1.addCourse(course1);
    System.out.println("***********************************");
    instructormanager1.addTask();
    System.out.println("***********************************");
    
    StudentManager studentmanager = new StudentManager();
    
    studentmanager.updatePass();
    System.out.println("***********************************");
    studentmanager.addCourse(course1);
    System.out.println("***********************************");

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
			
	
	
	
	
	 
     

	}

}
