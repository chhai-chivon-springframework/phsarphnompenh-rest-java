/*package com.phsarphnompenh.rest.configurations;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import javax.sql.DataSource;

@Configuration
@MapperScan({ "com.phsarphnompenh.rest.repositories" })
@PropertySource(value = { "classpath:configuration.properties" })
public class WebConfiguration {
	
	@Autowired
	private Environment environment;

	@Bean
	public DataSource getDataSource(){
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(environment.getProperty("MOL.dataSource.driverClassName"));
		dataSource.setUrl(environment.getProperty("MOL.dataSource.url"));
		dataSource.setUsername(environment.getProperty("MOL.dataSource.username"));
		dataSource.setPassword(environment.getProperty("MOL.dataSource.password"));
		return dataSource;
	}
	
	@Bean
	public DataSourceTransactionManager transactionManager(){
		return new DataSourceTransactionManager(getDataSource());
	}

	@Bean()
	public SqlSessionFactoryBean  sqlSessionFactory(){
		SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		sessionFactory.setDataSource(getDataSource());
		return sessionFactory;
	}
}
*/