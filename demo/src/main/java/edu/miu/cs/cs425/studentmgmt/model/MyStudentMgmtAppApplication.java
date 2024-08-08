package edu.miu.cs.cs425.studentmgmt.model;

import edu.miu.cs.cs425.studentmgmt.model.Entity.ClassRoom;
import edu.miu.cs.cs425.studentmgmt.model.Entity.Course;
import edu.miu.cs.cs425.studentmgmt.model.Entity.Student;
import edu.miu.cs.cs425.studentmgmt.model.Entity.Transcript;
import edu.miu.cs.cs425.studentmgmt.model.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class MyStudentMgmtAppApplication implements CommandLineRunner {

	@Autowired
	private StudentService studentService;

	public static void main(String[] args) {

		SpringApplication.run(MyStudentMgmtAppApplication.class, args);
	}

	public void run(String... args) throws Exception {
		Transcript transcript1 = new Transcript();
		transcript1.setDegreeTitle("Masters in CS");

		ClassRoom classRoom1 = new ClassRoom();
		classRoom1.setBuildingName("McLaughlin building");
		classRoom1.setRoomNumber("M105");

		ClassRoom classRoom2 = new ClassRoom();
		classRoom2.setBuildingName("Verile Hole");
		classRoom2.setRoomNumber("V47B");

		ClassRoom classRoom3 = new ClassRoom();
		classRoom3.setBuildingName("McLaughlin building");
		classRoom3.setRoomNumber("M207");

		Course course1 = new Course();
		course1.setCourse_code("CS401");
		course1.setCourse_name("Modern Programming Practice");

		Course course2 = new Course();
		course2.setCourse_code("CS425");
		course2.setCourse_name("Software Engineering");



		Student student1 = new Student();
		student1.setStudentNumber("000-61-0001");
		student1.setFirstName("Anna");
		student1.setLastName("Lynn");
		student1.setMiddleName("John");
		student1.setCgpa(3.85);
		student1.setDateOfEnrollment(LocalDate.of(2019, 2, 1));
        student1.setTranscript(transcript1);
        student1.setClassRooms(new ArrayList<ClassRoom>(List.of(classRoom1, classRoom2, classRoom3)));
		student1.setCourses(new ArrayList<Course>(List.of(course1, course2)));

		studentService.save(student1);
	}

}
