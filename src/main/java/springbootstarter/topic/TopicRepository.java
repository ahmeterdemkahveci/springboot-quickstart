package springbootstarter.topic;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {
	
	/*List<Topic> getAllTopics();
	
	Topic getTopicById(String id);
	
	void addTopic(Topic topic);
	
	void update(String id,Topic topic);
	
	void deleteTopicById(String id);*/
	
}
