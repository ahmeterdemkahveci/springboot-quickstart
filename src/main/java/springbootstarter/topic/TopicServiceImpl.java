package springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicServiceImpl implements TopicService{

	List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("1", "Bio", "Biology"),
			new Topic("2", "Math", "Mathematics"), new Topic("3", "Chem", "Chemistry")));

	public List<Topic> getAllTopics() {
		return topics;
	}

	public Topic getTopicById(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void update(String id, Topic topic) {
		// TODO Auto-generated method stub
		// topics.stream().filter(t->t.getId().equals(id)).map(top->new
		// Topic(topic.getId(),topic.getCode(),topic.getDescription())).collect(Collectors.toCollection(ArrayList::new));

		for (int i = 0; i < topics.size(); i++) {
			if (topic.getId().equals(topics.get(i).getId())) {
				topics.set(i, topic);
				return;
			}
		}

	}

	public void deleteTopicById(String id) {
		// TODO Auto-generated method stub
		topics.removeIf(t -> t.getId().equals(id));
	}

}
