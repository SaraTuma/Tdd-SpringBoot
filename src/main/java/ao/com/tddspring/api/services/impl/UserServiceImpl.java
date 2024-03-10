package ao.com.tddspring.api.services.impl;

import ao.com.tddspring.api.domain.User;
import ao.com.tddspring.api.repositories.UserRepository;
import ao.com.tddspring.api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository repository;

    @Override
    public User findById(Integer id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElse(null);
    }
}
