package microservice.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroservicTestProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicTestProjectApplication.class, args);
		System.out.println("Microservice test project is running here ======================");
	}

}
