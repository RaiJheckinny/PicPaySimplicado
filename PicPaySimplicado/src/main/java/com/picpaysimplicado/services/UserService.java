package com.picpaysimplicado.services;

import com.picpaysimplicado.domain.User;
import com.picpaysimplicado.domain.UserType;
import com.picpaysimplicado.dtos.UserDTO;
import com.picpaysimplicado.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private IUserRepository repository;

    public void validationTransaction(User sender, BigDecimal amount) throws Exception {
        if(sender.getUserType() == UserType.MERCHANT){
            throw new Exception("Usuario do tipo Lojista nao esta autorizado a realizar tranzacao");
        }
        if (sender.getBalance().compareTo(amount)<0){
            throw new Exception("Saldo insuficiente");
        }
    }
    public User findUserById(Long id) throws Exception {
        return this.repository.findById(id).orElseThrow(() -> new Exception("Usuario nao encontrado"));
    }

    public void saveUser(User user){
        this.repository.save(user);
    }

    public User createUser(UserDTO data){
        User newUser = new User(data);
        this.repository.save(newUser);
        return newUser;
    }
    public List<User> getAllUsers(){
        return this.repository.findAll();
    }

}
