package com.sampleapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableAsync
public class SampleApp {

  private static final Logger logger = LoggerFactory.getLogger(SampleApp.class);

  public static void main(String[] args) {
    logger.info("Starting SampleApp Application...");
    SpringApplication.run(SampleApp.class, args);
    logger.info("SampleApp Application started successfully.");
  }
}
