package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUser();
    void saveUser(User user);
    void deleteUser(Long id);
    User findById(Long id);
    void updateUser(User user);
}
