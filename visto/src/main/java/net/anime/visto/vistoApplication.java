package net.anime.visto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class vistoApplication {

	public static void main(String[] args) {
		SpringApplication.run(vistoApplication.class, args);
	}

}
