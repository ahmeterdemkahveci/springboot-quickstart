package springbootstarter.topic;

import java.util.List;

public interface TopicService {
	
	List<Topic> getAllTopics();
	
	Topic getTopicById(String id);
	
	void addTopic(Topic topic);
	
	void update(String id,Topic topic);
	
	void deleteTopicById(String id);
	
}
