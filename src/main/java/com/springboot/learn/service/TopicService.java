package com.springboot.learn.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.springboot.learn.entity.Topic;
import com.springboot.learn.exception.TopicNotFoundException;

@Service
public class TopicService {
	
	List<Topic> topics = Arrays.asList(
				new Topic(1, "Java"),
				new Topic(2, "Spring"),
				new Topic(3, "Hibernate")
			);

	public List<Topic> getAllToics() {
		return this.topics;
	}

	public Topic getTopic(int id) {
		
		Optional<Topic> topic =  topics.stream()
									     .filter(t -> t.getId() == id)
									     .findAny();
		
		if(!topic.isPresent())
			throw new TopicNotFoundException(String.valueOf(id));
		
		return topic.get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

}
