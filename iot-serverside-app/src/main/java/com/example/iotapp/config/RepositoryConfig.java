
package com.example.iotapp.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;;

@Configuration
@EnableJpaRepositories(basePackages = "com.example.iotapp.repository")
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.example.iotapp.entity"})
public class RepositoryConfig {

}