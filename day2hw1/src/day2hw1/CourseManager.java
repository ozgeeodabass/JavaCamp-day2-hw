package day2hw1;

import java.util.ArrayList;

public class CourseManager {
	ArrayList<Course> myCourses;
	ArrayList<Course> wishList;
	
	
	public CourseManager() {
		myCourses= new ArrayList<Course>();
		wishList= new ArrayList<Course>();
		
	}
	public void register(Course course) {
		System.out.println(course.getCourseTitle()+"'na kayıt yapıldı");
		myCourses.add(course);
		
	}
	public void addWishList(Course course) {
		System.out.println(course.getCourseTitle()+" istek listesine eklendi");
		wishList.add(course);
	}
	
	public void registeredCourses() {
		for (Course course : myCourses) {
			System.out.println("Registered Courses: ");
			 System.out.println(course.getInstructor() +" "+ course.getCourseTitle() +"\n");
		}
	}
	
	public void wishedCourses() {
		for (Course course : wishList) {
			System.out.println("Wish List:");
			System.out.println(course.getInstructor() +" "+ course.getCourseTitle()+ "\n");
		}
	}
	
	

}
