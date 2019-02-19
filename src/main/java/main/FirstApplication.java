package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstApplication implements CommandLineRunner {


    @Autowired
    PersonRepository personRepository;

    public static void main(String[] args) {
        SpringApplication.run(FirstApplication.class,args);
    }

    @Override
    public void run(String... args) throws Exception {
        Person person = new Person();
        person.setName("John");
        personRepository.save(person);

        Person personFromDb = personRepository.findFirstByName("John");
        System.out.println(personFromDb);
    }
    
      @Override
    public void run2(String... args) throws Exception {
        Manager person = new Manager();
        person.setlastName("Peter");
        ManagerRepository.save(person);

        Manager personFromDb = ManagerRepository.findLastByName("Peter");
        System.out.println(personFromDb);

    }
}
