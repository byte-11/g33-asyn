package uz.pdp.g33properitiesandasyn.config;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties("server")
@Getter
@Setter
@ToString
public class ServerProperties {
//    private Application application;

//    private List<String> applicationLanguages;

    private List<Application> applications;

    private String helloMessage;
}
