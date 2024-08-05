package com.example.mapper;

import com.example.entity.es.Topic.EsTopic;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepository extends ElasticsearchRepository<EsTopic, Integer> {


}
