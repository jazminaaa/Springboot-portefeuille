package tn.esprit.examen.ZammaliYassmine4SIM3Springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableAspectJAutoProxy
@EnableScheduling
@SpringBootApplication
public class ZammaliYassmine4SIM3SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZammaliYassmine4SIM3SpringbootApplication.class, args);
    }

}
