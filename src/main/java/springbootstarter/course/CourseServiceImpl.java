package springbootstarter.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl {
	
	@Autowired
	private CourseRepository courseRepository;

	public List<Course> getAllCourses(String topicId) {
		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicId(topicId).forEach(courses::add);
		return courses;
	}

	public Course getCourse(String id) {
		//return courses.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return courseRepository.findById(id).orElse(null);
	}

	public void addCourse(Course course) {
		courseRepository.save(course);
	}

	public void update(Course course) {
		courseRepository.save(course);
	}

	public void deleteCourseById(String id) {
		// TODO Auto-generated method stub
		courseRepository.deleteById(id);
	}

}
