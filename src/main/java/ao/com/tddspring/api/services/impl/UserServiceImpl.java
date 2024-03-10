package ao.com.tddspring.api.services.impl;

import ao.com.tddspring.api.domain.UserModel;
import ao.com.tddspring.api.repositories.UserRepository;
import ao.com.tddspring.api.services.UserService;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository repository;

    @Override
    public UserModel findById(Integer id) {
        Optional<UserModel> obj = repository.findById(id);
        return obj.orElse( null);

    }

    @Override
    public String teste() {
        return "Teste";
    }


}
