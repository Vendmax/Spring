package com.example.spring;

import com.example.spring.repository.ExternalRepository;
import com.example.spring.service.Flow;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;


@Slf4j
@ComponentScan
@EnableAspectJAutoProxy
@PropertySource("classpath:application.properties")
public class Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Application.class);

        ExternalRepository externalRepository = applicationContext.getBean(ExternalRepository.class);

        log.info("Result external repository: {}", externalRepository.getInfo());

        homeworkOne(applicationContext);
    }

    private static void homeworkOne(AnnotationConfigApplicationContext applicationContext) {
        Flow flow = applicationContext.getBean(Flow.class);
        flow.run(1);
        flow.run(2);
        flow.run(2);
        flow.run(3);
        flow.run(4);
        applicationContext.close();
    }

}
