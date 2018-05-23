package springbootstarter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import springbootstarter.topic.Topic;

public interface CourseRepository extends CrudRepository<Course, String> {
	
	/*List<Course> findByName(String name);
	List<Course> findByDescription(String description);*/
	
	List<Course> findByTopicId(String topicId);
}
