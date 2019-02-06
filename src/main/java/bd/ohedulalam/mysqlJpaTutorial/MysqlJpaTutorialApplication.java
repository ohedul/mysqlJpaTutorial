package bd.ohedulalam.mysqlJpaTutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "bd.ohedulalam.mysqlJpaTutorial.repository")
@SpringBootApplication
public class MysqlJpaTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(MysqlJpaTutorialApplication.class, args);
	}

}

