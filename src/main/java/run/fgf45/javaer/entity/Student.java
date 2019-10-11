package run.fgf45.javaer.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component("student")
public class Student {

    @Autowired
    private Landlord landlord;

    @Value("mary")
    private String name;
    @Value("1")
    private Integer id;
    @Value("male")
    private String gender;

    public void showLandlord(){
        this.landlord.service();
    }

}
