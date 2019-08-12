package io.nextwaave.authservice.config.mongodb;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "io.nextwaave.authservice.repository")
public class MongoConfig {
    //
}
