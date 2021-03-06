package web;

import com.ps.base.UserType;
import com.ps.ents.User;
import com.ps.services.UserService;
import org.apache.commons.lang3.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by iuliana.cosmina on 8/15/16.
 */
public class StubUserService implements UserService {

    private List<User> users = new ArrayList<>();

    public StubUserService() {
        User user0 = new User();
        user0.setId(0L);
        users.add(user0);

        User user1 = new User();
        user1.setId(1L);
        users.add(user1);
    }


    @Override
    public User findById(Long id) {
        return users.get(id.intValue());
    }

    @Override
    public User findByEmail(String email) {
        return null;
    }

    @Override
    public User findByUsername(String username) {
        return null;
    }

    @Override
    public long countUsers() {
        return users.size();
    }

    @Override
    public void create(String email, String password, UserType userType) {
        throw new NotImplementedException("[CREATE] Not to be used at the moment.");
    }

    @Override
    public User create(User user) {
        return null;
    }

    @Override
    public void update(User user) {

    }

    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public List<User> findByType(UserType userType) {
        return null;
    }

    @Override
    public void deleteById(Long id) {
        throw new NotImplementedException("[DELETE] Not to be used at the moment.");
    }

    @Override
    public void deleteByEmail(String email) {

    }

    @Override
    public List<String> getEmailsByType(UserType userType) {
        return null;
    }
}
