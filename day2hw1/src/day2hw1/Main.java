package day2hw1;public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1,"Java Kamp�","2 ay s�recek Java Kamp�",
				new Instructor("Engin Demiro�", "Yaz�l�m Geli�tirici"), true);
		
		Course course2 = new Course(2,"C# Kamp�","2 ay s�recek C# Kamp�",
				new Instructor("Engin Demiro�", "Yaz�l�m Geli�tirici"), true);
		
		CourseManager courseManager = new CourseManager();
		courseManager.register(course1);
		courseManager.addWishList(course2);
		
		courseManager.registeredCourses();
		courseManager.wishedCourses();
		
		
		

	}

}
