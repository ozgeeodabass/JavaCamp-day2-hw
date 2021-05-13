package day2hw1;

public class Course {
	int id;
	String courseTitle;
	String description;
	Instructor instructor;
	boolean isFree;
	
	public Course(int id, String courseTitle, String description,
			Instructor instructor, boolean isFree) {
		this.id=id;
		this.courseTitle=courseTitle;
		this.description=description;
		this.instructor=instructor;
		this.isFree= isFree;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getInstructor() {
		return instructor.getName();
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	public boolean isFree() {
		return isFree;
	}

	public void setFree(boolean isFree) {
		this.isFree = isFree;
	}

	

}
