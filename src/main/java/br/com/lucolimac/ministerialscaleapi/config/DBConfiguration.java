package br.com.lucolimac.ministerialscaleapi.config;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("spring.datasource")
@SuperBuilder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DBConfiguration {
    private String url;
    private String username;
    private String password;
    private String driverClassName;

    @Profile("dev")
    @Bean
    public String developmentDatabaseConnection() {
        System.out.println("DB Connection for DEV - H2");
        System.out.println(driverClassName);
        System.out.println(url);
        return "DB connection for DEV - H2";
    }

    @Profile("prd")
    @Bean
    public String productionDatabaseConnection() {
        System.out.println("DB Connection for PROD - PostgreSql on Heroku");
        System.out.println(driverClassName);
        System.out.println(url);
        return "DB connection for PROD - PostgreSql on Heroku";
    }
}