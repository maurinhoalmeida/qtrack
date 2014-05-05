package com.koinosystems.qtrack.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 *
 * @author mauro.almeida
 * 
 */
@Configuration
@ComponentScan(basePackages = {"com.koinosystems.qtrack"})
@PropertySource("classpath:webapp.properties")
@Import({PersistenceConfig.class, AspectConfig.class})
public class RootConfig {

	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}

}
