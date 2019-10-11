package run.fgf45.javaer.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import run.fgf45.javaer.entity.Landlord;
import run.fgf45.javaer.entity.Student;

public class Test01 {

    @Test
    public void test01(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Landlord landlord = (Landlord) context.getBean("landlord", Landlord.class);
        landlord.service();
    }

    @Test
    public void test02(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) context.getBean("student", Student.class);
        student.showLandlord();
    }

}
