package com.example;

import com.example.entity.es.Topic.EsTopic;
import com.example.mapper.TopicRepository;
import com.example.service.TopicService;
import com.example.service.impl.EsTopicService;
import com.example.service.impl.TopicServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class MyProjectBackendApplicationTests {

    @Autowired
    TopicRepository topicRepository;

    @Autowired
    TopicService topicService;

    @Autowired
    EsTopicService esTopicService;



    @Test
    void contextLoads() {
        long t = System.currentTimeMillis();
        System.out.println(topicService.listTopicByPageInElastic(0, 1));
        System.out.println(System.currentTimeMillis() - t);


    }

    @Test
    void Test(){
        long t = System.currentTimeMillis();
        System.out.println(topicService.listTopicByPage(0, 1));
        System.out.println(System.currentTimeMillis() - t);
    }
}
