package com.springboot.learn.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.learn.entity.Topic;

@Service
public class TopicService {
	
	List<Topic> topics = new ArrayList<Topic>();
	{
		topics.add(new Topic("1", "Java"));
		topics.add(new Topic("2", "Pub Sub"));
		topics.add(new Topic("3", "Spring"));
		topics.add(new Topic("4", "Hibernate"));
		topics.add(new Topic("5", "REST"));
		topics.add(new Topic("6", "SQL"));
		topics.add(new Topic("7", "Big Query"));
		topics.add(new Topic("8", "Data flow"));
	
	}

	public List<Topic> getAllToics() {
		return this.topics;
	}

	public Topic getTopic(String id) {

		return topics.stream()
					 .filter(s -> s.getId().equals(id))
					 .findFirst()
					 .get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void deleteTopic(String id) {
		topics.removeIf(t -> t.getId().equals(id));
	}

	public void updateTopic(Topic topic) {
		
		for(int i=0;i<topics.size();i++){
			if(topics.get(i).getId().equals(topic.getId())){
				topics.set(i, topic);
				return;
			}
		}
	}

	public void deleteAllTopic() {
		System.out.println("Before : "+topics.size());
		topics.clear();
		System.out.println("After : "+topics.size());
	}
}
