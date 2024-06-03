package uz.pdp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import uz.pdp.beans.Emp;
import uz.pdp.beans.Employee;
import uz.pdp.beans.Person;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello PDP");
//        ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("ioc-config.xml");
//        Person person1 = container.getBean(Person.class);
//        System.out.println("person1 " + person1);
//        Person person2 = container.getBean(Person.class);
//        System.out.println("person2 " + person2);
//        person2.setAge(22);
//        System.out.println("person1 " + person1);
//        System.out.println("person2 " + person2);

//        AnnotationConfigApplicationContext container2 = new AnnotationConfigApplicationContext(MyConfig.class);
//        Employee employee = container2.getBean(Employee.class);
//        System.out.println(employee);

        AnnotationConfigApplicationContext container3 = new AnnotationConfigApplicationContext("uz.pdp.beans");
        Emp emp = container3.getBean(Emp.class);
        System.out.println(emp);
    }
}