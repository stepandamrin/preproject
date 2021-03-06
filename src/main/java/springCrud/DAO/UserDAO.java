package springCrud.DAO;

import java.util.List;
import springCrud.model.User;

public interface UserDAO {

  List<User> getAllUsers();

  void createUser(User newUser);

  void deleteUser(Long uid);

  void updateUser(User user);

  User getUserById(Long uid);
}