package main;
import org.springframework.data.repository.CrudRepository;

public interface ManagerRepository extends CrudRepository<Person, Integer>{

    Person findLastByName(String name);
}
