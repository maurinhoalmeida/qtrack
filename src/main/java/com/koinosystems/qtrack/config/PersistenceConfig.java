package com.koinosystems.qtrack.config;

import org.springframework.context.annotation.Configuration;

/**
 *
 * @author mauro.almeida
 * 
 */
@Configuration
//@EnableTransactionManagement
//@EnableTransactionManagement
//@ImportResource("classpath:spring-data-context.xml")
public class PersistenceConfig {

	
	/*@Bean(destroyMethod = "shutdown")
	public GraphDatabaseService graphDatabaseService() {
		return new EmbeddedGraphDatabase("target/graph.db");
	}*/

	
	/*@Bean
	public DataSource dataSource() {
		//JndiDataSourceLookup jndiDataSource = new JndiDataSourceLookup();
		//return jndiDataSource.getDataSource("jdbc/koinosystems");
	}

	@Bean
	public LocalSessionFactoryBean  sessionFactory() {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		sessionFactory.setPackagesToScan(new String[]{"com.koinosystems.entity"});
		Properties props = new Properties();
		props.put(org.hibernate.cfg.Environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
		props.put(org.hibernate.cfg.Environment.SHOW_SQL, "false");
		props.put(org.hibernate.cfg.Environment.FORMAT_SQL, "true");
		props.put(org.hibernate.cfg.Environment.USE_REFLECTION_OPTIMIZER, true);
		props.put(org.hibernate.cfg.Environment.CACHE_REGION_FACTORY, org.hibernate.cache.ehcache.EhCacheRegionFactory.class.getName());
		props.put(org.hibernate.cfg.Environment.USE_QUERY_CACHE, true);
		props.put(org.hibernate.cfg.Environment.USE_SECOND_LEVEL_CACHE, true);
		props.put(org.hibernate.cfg.Environment.HBM2DDL_AUTO, "update");
		sessionFactory.setHibernateProperties(props);
		sessionFactory.setNamingStrategy(new ImprovedNamingStrategy());
		return sessionFactory;
	}

	@Bean
	public HibernateTransactionManager transactionManager() {
		HibernateTransactionManager txManager = new HibernateTransactionManager();
		txManager.setSessionFactory(sessionFactory().getObject());
		return txManager;
	}

	@Bean
	public PersistenceExceptionTranslationPostProcessor exceptionTranslation(){
		return new PersistenceExceptionTranslationPostProcessor();
	}

	@Bean
	public DatabasePopulator databasePopulator(DataSource dataSource) {
		ResourceDatabasePopulator populator = new ResourceDatabasePopulator();
		populator.setContinueOnError(true);
		populator.setIgnoreFailedDrops(true);
		// populator.addScript(new ClassPathResource("/derby-sql/dml/myschema-ddl.sql"));
		// populator.addScript(new ClassPathResource("/derby-sql/dml/mydata-dml.sql"));
		try {
			populator.populate(dataSource.getConnection());
		} catch (SQLException ignored) {
			ignored.printStackTrace();
		}
		return populator;
	}*/

}
