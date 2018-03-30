package com.springboot.learn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.learn.entity.Topic;
import com.springboot.learn.service.TopicService;

@RestController
public class TopicController {
	
	@Autowired
	TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics(){
		return topicService.getAllToics();
	}
	
	@GetMapping("/topics/{id}")
	public Topic getTopic(@PathVariable int id){
		return topicService.getTopic(id);
	}
	
	@RequestMapping(value="/topics", method=RequestMethod.POST)
	public void addTopic(@RequestBody Topic topic){
		topicService.addTopic(topic);
	}

}
