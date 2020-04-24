package technicalBlog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class DemoApplication {
    public static void main(String...x)
    {
        SpringApplication.run(DemoApplication.class,x);
    }
}
