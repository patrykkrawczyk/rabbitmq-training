package pro.patrykkrawczyk.rabbitmq.training.lab1.sender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SenderApplication implements CommandLineRunner {

    private static final long DURATION = 10000;

    public static void main(String[] args) {
        SpringApplication.run(SenderApplication.class, args);
    }

    @Autowired
    private ConfigurableApplicationContext ctx;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Ready, running for " + DURATION + "ms");
        Thread.sleep(DURATION);
        ctx.close();
    }
}
