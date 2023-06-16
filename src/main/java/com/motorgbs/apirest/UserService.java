package com.motorgbs.apirest;

import com.motorgbs.apirest.model.User;
import com.motorgbs.apirest.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;




@Component
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createuser(User user){
        return userRepository.save(user);
    }

    
    

}
