package ao.com.tddspring.api.resources;

import ao.com.tddspring.api.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserResource {

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Integer id){
        return  ResponseEntity.ok().body(new User(1, "Sara Tuma", "sara@gmail.com", "1234"));
    }
}
