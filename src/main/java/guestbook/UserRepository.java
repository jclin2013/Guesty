package guestbook;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

import guestbook.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Integer> {
  List<User> findAllByWantToEmail(Integer status);
}
