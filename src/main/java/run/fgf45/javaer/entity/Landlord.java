package run.fgf45.javaer.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component("landlord")
public class Landlord {

    public void service() {
        // 仅仅只是实现了核心的业务功能
        System.out.println("签合同");
        System.out.println("收房租");
    }

}
