package Demo.ThirdParty.RestTemplateConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


@Configuration
public class RestTemplateconfi {
    @Bean
public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
