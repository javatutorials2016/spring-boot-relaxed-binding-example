package net.javapedia.relaxedbindingexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RelaxedBindingExampleApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(RelaxedBindingExampleApplication.class, args);
    }

@Autowired
ApplicationProperties appProperties;
    @Override
    public void run(String... args) throws Exception {
        System.out.println(appProperties);
    }
}
