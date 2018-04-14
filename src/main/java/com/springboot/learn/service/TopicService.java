package com.springboot.learn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.learn.entity.Topic;
import com.springboot.learn.repository.TopicRepository;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepo;
	
	public Iterable<Topic> getAllToics() {
		return topicRepo.findAll();
	}

	public Topic getTopic(Integer id) {
		return topicRepo.findOne(id);
	}

	public Topic addTopic(Topic topic) {
		return topicRepo.save(topic);
	}

	public void deleteTopic(Integer id) {
		topicRepo.delete(id);
	}

	public Topic updateTopic(Topic topic) {
		if(!topicRepo.exists(topic.getId())){
			return topicRepo.save(topic);
		}
		return null;
	}

	public void deleteAllTopic() {
		topicRepo.deleteAll();
	}
}
