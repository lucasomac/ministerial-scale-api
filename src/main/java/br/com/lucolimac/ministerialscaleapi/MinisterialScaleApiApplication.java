package br.com.lucolimac.ministerialscaleapi;

import br.com.lucolimac.ministerialscaleapi.models.Scale;
import br.com.lucolimac.ministerialscaleapi.repository.ScaleRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.stream.LongStream;

@SpringBootApplication
public class MinisterialScaleApiApplication {
    private static final Logger logger = LoggerFactory.getLogger(MinisterialScaleApiApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(MinisterialScaleApiApplication.class, args);
    }

//    @Bean
//    CommandLineRunner init(ScaleRepository repository) {
//        return args -> {
//            repository.deleteAll();
//            LongStream.range(1, 11)
//                    .mapToObj(i -> {
//                        Scale scale = new Scale();
//                        scale.setMinister("Minister " + i);
//                        scale.setHour(LocalTime.now());
//                        scale.setDate(LocalDate.now());
//                        return scale;
//                    })
//                    .map(repository::save)
//                    .forEach(System.out::println);
//        };
//    }
}
