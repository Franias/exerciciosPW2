package dev.ifrs.usecase.user;

import dev.ifrs.model.User;

public class UseCase implements UseCaseInterface {

    @Override
    public User save(String name, String password) {
       //regras de negocio
       User user =null;
        if(password.length()>=5){

            user = new User();
            user.setName(name);
            user.setPassword(password);
        }
        else{
            throw new IllegalArgumentException();
        }

        return user;
    }

    
}
