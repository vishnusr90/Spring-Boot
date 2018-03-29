package com.springboot.learn.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.learn.entity.Topic;

@Service
public class TopicService {
	
	List<Topic> topics = Arrays.asList(
				new Topic(1, "Java"),
				new Topic(2, "Spring"),
				new Topic(3, "Hibernate")
			);

	public List<Topic> getAllCourses() {
		return this.topics;
	}

	public Topic getTopic(int id) {
		
		for(Topic topic : topics){
			if(topic.getId() == id)
				return topic;
		}
		return null;
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

}
