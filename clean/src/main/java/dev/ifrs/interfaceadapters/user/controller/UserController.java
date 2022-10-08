package dev.ifrs.interfaceadapters.user.controller;

import javax.enterprise.context.RequestScoped;

import dev.ifrs.model.User;
import dev.ifrs.usecase.user.UseCase;
import dev.ifrs.usecase.user.UseCaseInterface;

@RequestScoped  //criou um bean e pode ser injetado no webservice  -> viva s'o na requisiçao 
public class UserController implements UserControllerInterface {

    private UseCaseInterface useCase; //obriga o useCase estar dentro do contrato
    
    public UserController(){
        this.useCase= new UseCase();
    }

    @Override
    public User save(String name, String password) {
        return useCase.save(name, password);
    }
    //bean de requisiçao depende do garbage oollector


}
