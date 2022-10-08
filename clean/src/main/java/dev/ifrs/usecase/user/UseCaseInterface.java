package dev.ifrs.usecase.user;

import dev.ifrs.model.User;

public interface UseCaseInterface {
    public User save(String name, String password);
    
}
