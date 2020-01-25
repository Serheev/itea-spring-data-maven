package com.serheev.runner;

import com.serheev.config.AppConfig;
import com.serheev.model.TerminatorQuoter;
import com.serheev.service.CompanyService;
import lombok.RequiredArgsConstructor;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class Runner {
    private static Logger log = Logger.getLogger(Runner.class);

    @Autowired
    static CompanyService service;

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        context.getBean(TerminatorQuoter.class).sayQuote();
service.hashCode();
//        context.close();
    }
}
