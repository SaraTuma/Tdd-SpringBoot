package ao.com.tddspring.api.services;

import ao.com.tddspring.api.domain.User;

public interface UserService {
    
    User findById(Integer id);
    
}
