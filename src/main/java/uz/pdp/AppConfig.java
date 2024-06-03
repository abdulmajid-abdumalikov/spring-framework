package uz.pdp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("uz.pdp")
public class AppConfig {

    @Bean
    public Transform transform() {
        return new Transform();
    }

    @Bean
    public TransformAspect transformAspect() {
        return new TransformAspect();
    }
}
