package uz.pdp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import uz.pdp.beans.Employee;

@Configuration
public class MyConfig {

    @Bean()
    @Scope("prototype")
    public Employee employee() {
        return new Employee("Abdelmajid", 21);
    }

}


