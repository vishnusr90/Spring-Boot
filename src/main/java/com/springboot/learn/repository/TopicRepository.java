package com.springboot.learn.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.learn.entity.Topic;

public interface TopicRepository extends CrudRepository<Topic, Integer> {

}
