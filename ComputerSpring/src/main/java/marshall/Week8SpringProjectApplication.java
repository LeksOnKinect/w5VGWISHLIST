package marshall;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import marshall.beans.Computer;
import marshall.controller.BeanConfiguration;
import marshall.repository.ComputerRepository;


@SpringBootApplication
public class Week8SpringProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Week8SpringProjectApplication.class, args);
		
	}
	
	@Autowired
	ComputerRepository repo;

	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Computer c = appContext.getBean("computer", Computer.class);
		c.setPrice(1750.99);
		repo.save(c);
		
		Computer d = new Computer("Intel Workspace", 'I', (short) 2021, 2999.99);
		repo.save(d);
		
		List<Computer> allMyComputers = repo.findAll();
		for(Computer people: allMyComputers) {
			System.out.println(people.toString());
		}
		
		((AbstractApplicationContext) appContext).close();
	
	}

}