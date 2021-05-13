package day2hw1;public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1,"Java Kampı","2 ay sürecek Java Kampı",
				new Instructor("Engin Demiroğ", "Yazılım Geliştirici"), true);
		
		Course course2 = new Course(2,"C# Kampı","2 ay sürecek C# Kampı",
				new Instructor("Engin Demiroğ", "Yazılım Geliştirici"), true);
		
		CourseManager courseManager = new CourseManager();
		courseManager.register(course1);
		courseManager.addWishList(course2);
		
		courseManager.registeredCourses();
		courseManager.wishedCourses();
		
		
		

	}

}
