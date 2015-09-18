package ua.com.csltd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by valeriy_solyanik
 * on 18.09.2015.
 */
@SpringBootApplication
@EnableScheduling
@ComponentScan({"applicationContext.xml" })
//@ImportResource({"classpath:applicationContext.xml" })
public class Application {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class);
	}
}