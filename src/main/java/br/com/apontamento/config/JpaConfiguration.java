package br.com.apontamento.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
public class JpaConfiguration {
	
	
	@Bean
	public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {
		
		LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
		JpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
		factoryBean.setJpaVendorAdapter(adapter);
		
		
		DriverManagerDataSource source = new DriverManagerDataSource();
		source.setUsername("root");
		source.setPassword("");
		source.setUrl("jdbc:mysql://localhost:3306/apontamento");
		source.setDriverClassName("com.mysql.jdbc.Driver");
        factoryBean.setDataSource(source);
		
        
        Properties props = new Properties();
        
        props.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
        props.setProperty("hibernate.show_sql", "true");
        props.setProperty("hibernate.hbm2ddl.auto", "update");
        factoryBean.setJpaProperties(props);

        factoryBean.setPackagesToScan("br.com.apontamento.models");
        
        return factoryBean;
	}
	
	
/*	@Bean
	public JpaTransactionManager transactionManager(EntityManagerFactory emf) {
		
		return new JpaTransactionManager(emf);
	}*/
	

}
