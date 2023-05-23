//package com.angel.bpitest;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.web.client.RestTemplateBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.web.client.RestTemplate;
//
//@SpringBootApplication
//public class GenderizeTestApplication {
//
//    private static final Logger log = LoggerFactory.getLogger(GenderizeTestApplication.class);
//
//    public static void main(String[] args) {
//        SpringApplication.run(GenderizeTestApplication.class, args);
//    }
//
//    @Bean
//    public RestTemplate restTemplate(RestTemplateBuilder builder){
//        return builder.build();
//    }
//
//    @Bean
//    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
//        return args -> {
//            Genderize genderize = restTemplate.getForObject(
//                    "https://api.genderize.io/?name=angel", Genderize.class);
//            log.info(genderize.toString());
//        };
//    }
//}
