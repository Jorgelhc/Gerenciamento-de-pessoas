package learning.example.gerenciamentoDePessoas.repository;

import learning.example.gerenciamentoDePessoas.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {
}
