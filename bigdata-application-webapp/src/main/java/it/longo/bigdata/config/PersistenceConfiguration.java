package it.longo.bigdata.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = {"it.longo.bigdata.commons.repository"})
@EnableAspectJAutoProxy
public class PersistenceConfiguration {

}
