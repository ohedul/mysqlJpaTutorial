package bd.ohedulalam.mysqlJpaTutorial.repository;

import bd.ohedulalam.mysqlJpaTutorial.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Integer> {
}
