package ao.com.tddspring.api.services;

import ao.com.tddspring.api.domain.UserModel;

public interface UserService {
    
    UserModel findById(Integer id);
    String teste();
    
}
