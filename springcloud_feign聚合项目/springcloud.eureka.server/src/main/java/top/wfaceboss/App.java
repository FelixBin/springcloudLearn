package top.wfaceboss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication // 启动springboot
@EnableEurekaServer // 开启eureka
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
