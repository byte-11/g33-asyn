package uz.pdp.g33properitiesandasyn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
public class ApplicationConfig {

//    @Bean
//    public TaskExecutor taskExecutor() {
//        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
//        executor.setThreadNamePrefix("custom-executor");
//        executor.setCorePoolSize(5);
//        executor.setMaxPoolSize(20);
//        executor.setKeepAliveSeconds(30);
//        return executor;
//    }
}
