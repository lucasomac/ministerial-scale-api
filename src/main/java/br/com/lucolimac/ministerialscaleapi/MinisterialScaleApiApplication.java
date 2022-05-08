package br.com.lucolimac.ministerialscaleapi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableWebMvc
@EnableSwagger2
@SpringBootApplication
public class MinisterialScaleApiApplication {
    private static final Logger logger = LoggerFactory.getLogger(MinisterialScaleApiApplication.class);

    public static void main(String[] args) {
        logger.info("Iniciando aplicação...");
        SpringApplication.run(MinisterialScaleApiApplication.class, args);
        logger.info("A aplicação Scale está rodando!");
    }
}
