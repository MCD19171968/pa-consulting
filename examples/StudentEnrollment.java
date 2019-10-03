package uk.ac.belfastmet.examples;

public class StudentEnrollment {

	public static void main(String[] args) {

		Student student1 = new Student("Michael", 22);
		Student student2 = new Student("John", 21);
		Student student3 = new Student("Bob", 20);

		System.out.println(Student.numberOfStudents);
		System.out.println(Student.getNumberOfStudents());

	}

}
