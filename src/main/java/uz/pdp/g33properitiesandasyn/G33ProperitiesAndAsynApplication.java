package uz.pdp.g33properitiesandasyn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableAsync;
import uz.pdp.g33properitiesandasyn.config.ServerProperties;

@SpringBootApplication
@EnableConfigurationProperties({ServerProperties.class})
public class G33ProperitiesAndAsynApplication implements CommandLineRunner {

    @Autowired
    private ServerProperties serverProperties;

    public static void main(String[] args) {
        SpringApplication.run(G33ProperitiesAndAsynApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        System.out.println("application-languages:" + serverProperties.getApplication().getLanguages());
//        System.out.println("application-languages:" + serverProperties);
    }
}
