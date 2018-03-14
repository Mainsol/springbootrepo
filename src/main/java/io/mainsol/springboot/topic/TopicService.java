package io.mainsol.springboot.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	
	private List<Topic> topics = new ArrayList<> (Arrays.asList(
			
			new Topic("abc","yoyo","yoooooooooo!!"),
			new Topic("def","fdf","afasefae!!!"),
			new Topic("xyz","safa","asfasfasf!!!")
			));
	
	public List<Topic> getAllTopics(){
		
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void newTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(String id, Topic topic) {
		
		for(int i=0; i<topics.size(); i++) {
			
				Topic t= topics.get(i);
				if(t.getId().equals(id)) {
					topics.set(i, topic);
					return;
				}
		}
	}

	public void deleteTopic(String id) {
		
		topics.removeIf(t -> t.getId().equals(id));
		
	}

	
	
}
