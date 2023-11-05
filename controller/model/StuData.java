package stu.controller.model;

import java.util.HashSet;
import java.util.Set;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import stu.entity.Courses;
import stu.entity.Years;
// import stu.entity.Geo;
import stu.entity.Students;

@Data
@NoArgsConstructor
public class StuData {

	private Long years;
//	private String contributorName;
//	private String contributorEmail;
	private Set<StudentResponse> students = new HashSet<>();

	public StuData(Years year) {
		years = year.getYear();
		//contributorName = year.getContributorName();
		//contributorEmail = year.getContributorEmail();

		for (Students student : year.getStudents()) {
			students.add(new StudentResponse(student));
		}
	}

	@Data
	@NoArgsConstructor
	static class StudentResponse {

		private Long studentID;
		private String studentName;
//		private Geo geoloc;
		private Set<String> courses = new HashSet<>();

		StudentResponse(Students students) {
			studentID = students.getStudentID();
			studentName = students.getStudentName();

//			geoloc = new Geo(petPark.getGeoloc());

			for (Courses course : students.getCourses()) {
				courses.add(course.getCourse());

			}

		}

	}

}
