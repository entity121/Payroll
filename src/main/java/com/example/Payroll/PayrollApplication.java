package com.example.Payroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories("com.example.Payroll.*")
@ComponentScan(basePackages = { "com.example.Payroll.*" })
@EntityScan("com.example.Payroll.*") 
@SpringBootApplication
public class PayrollApplication {

    static String line = "\n\n#####################################\n\n";
    
    

  public static void main(String... args) {
    SpringApplication.run(PayrollApplication.class, args);
  }

}
