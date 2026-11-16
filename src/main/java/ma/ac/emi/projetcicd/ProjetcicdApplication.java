package ma.ac.emi.projetcicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class ProjetcicdApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjetcicdApplication.class, args);
    }

    @Bean
    test(){
        System.out.println("modification");
    }

    test2() {System.out.println("modification 2");}

}
