package com.springboot.learn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.learn.entity.Topic;
import com.springboot.learn.service.TopicService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="http://localhost:4200")
public class TopicController {
	
	@Autowired
	TopicService topicService;
	
	@GetMapping("/topics")
	public List<Topic> getAllTopics(){
		return topicService.getAllToics();
	}
	
	@GetMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id){
		return topicService.getTopic(id);
	}
	
	@PostMapping(value="/topics")
	public void addTopic(@RequestBody Topic topic){
		topicService.addTopic(topic);
	}
	
	@DeleteMapping(value="/topics/{id}")
	public void deleteTopic(@PathVariable String id){
		topicService.deleteTopic(id);
	}
	
	@DeleteMapping(value="/topics")
	public void deleteAllTopic(){
		topicService.deleteAllTopic();
	}
	
	@PutMapping(value="/topics/")
	public void updateTopic(@RequestBody Topic topic){
		topicService.updateTopic(topic);
	}

}
