package pro.patrykkrawczyk.rabbitmq.training.lab2.sender;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

	@Bean
	public Queue hello() {
		return new Queue("tut.hello");
	}
}
