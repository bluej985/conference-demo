package com.pluralsight.conferencedemo.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfiguration {
    @Bean
    public DataSource dataSource() {
        DataSourceBuilder builder = DataSourceBuilder.create();
        builder.url("jdbc:postgresql://localhost:5433/debt_payoff");
        builder.username("postgres");
        builder.password("Fa5aDeTBLPc8");
        System.out.println("My custom datasource bean has been initialized and set");
        return builder.build();
    }
}
