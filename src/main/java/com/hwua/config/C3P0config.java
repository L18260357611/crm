package com.hwua.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class C3P0config {
    @Bean
    @ConfigurationProperties("jdbc.datasource")
    public DataSource c3p0config(){
        return new ComboPooledDataSource();
    }
}
