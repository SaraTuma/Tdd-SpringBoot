package ao.com.tddspring.api.config;

import ao.com.tddspring.api.domain.UserModel;
import ao.com.tddspring.api.repositories.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {
    @Autowired
    private UserRepository repository;

    @PostConstruct
    public void startDB(){
        UserModel u1 = new UserModel(null, "Valdir", "valdir@gmail.com", "123");
        UserModel u2 = new UserModel(null, "Sara", "sara@gmail.com", "123");
        repository.saveAll(List.of(u1,u2));
    }
}
