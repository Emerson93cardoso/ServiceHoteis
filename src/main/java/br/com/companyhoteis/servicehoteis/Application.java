package br.com.companyhoteis.servicehoteis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "br.com.companyhoteis.servicehoteis.*")
@EnableJpaRepositories
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }

}
