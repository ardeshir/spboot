import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Application {

    @RequestMapping("/")

    String home() {
        return "<html><head><title>Spring Boot</title></head><body><h1>Hello SpringBoot</h1></body></html>";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

}

/** command to change the default port

[root@univrs javacode]# mvn spring-boot:run -Drun.jvmArguments='-Dserver.port=8090'

*/
