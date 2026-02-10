package in.dsoft;

import in.dsoft.beans.Getservices;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoappApplication {

	public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoappApplication.class, args);
        Getservices service = context.getBean(Getservices.class);

        service.getname(101);

	}

}
