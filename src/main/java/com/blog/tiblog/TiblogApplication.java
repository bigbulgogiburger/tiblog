package com.blog.tiblog;

import com.blog.tiblog.aspect.ShowLogAspect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

@SpringBootApplication
public class TiblogApplication {

	public static void main(String[] args) {
		SpringApplication.run(TiblogApplication.class, args);
	}

}
