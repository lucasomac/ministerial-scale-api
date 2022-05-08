package br.com.lucolimac.ministerialscaleapi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class MinisterialScaleApiApplication {
    private static final Logger logger = LoggerFactory.getLogger(MinisterialScaleApiApplication.class);

    public static void main(String[] args) {
        logger.info("Starting application...");
        SpringApplication.run(MinisterialScaleApiApplication.class, args);
        logger.info("The application is running!");
    }
}
