package springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicRestController {
	
	@RequestMapping("/topic")
	public String getAllTopics(){
		
		return "All Topics are returned!!!";
	}
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopic() {
		return Arrays.asList(				
				new Topic("1", "Bio", "Biology"),
				new Topic("2", "Math","Mathematics"),
				new Topic("3","Chem","Chemistry")
				);
		
	}
	
}
