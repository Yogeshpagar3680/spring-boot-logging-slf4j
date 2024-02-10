package in.ineuron;

import in.ineuron.beans.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = "applicationContext.xml")
public class SpringBootLoggingSl4jApplication {
	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringBootLoggingSl4jApplication.class, args);

		Student student = context.getBean(Student.class);
		System.out.println(student);

		student.preparation("java");

		((ConfigurableApplicationContext) context).close();
	}
}
