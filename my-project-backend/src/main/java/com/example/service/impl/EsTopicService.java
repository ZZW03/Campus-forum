package com.example.service.impl;

import com.example.mapper.TopicRepository;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.stereotype.Service;

@Service
public class EsTopicService {

    @Autowired
    TopicRepository topicRepository;

    @Resource
    private ElasticsearchOperations elasticsearchOperations;



}
