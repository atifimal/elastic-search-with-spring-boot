package com.atifimal.basic.elasticsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
@EnableElasticsearchRepositories(basePackages = "com.atifimal.basic.elasticsearch.repository")
public class ElasticSearchWithSpringDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElasticSearchWithSpringDataApplication.class, args);
    }

}
