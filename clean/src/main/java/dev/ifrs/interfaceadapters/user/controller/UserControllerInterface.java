package dev.ifrs.interfaceadapters.user.controller;

import dev.ifrs.model.User;

public interface UserControllerInterface {//chamada de caso de uso e persistencia, exportar um dado - repository
    public User save(String name, String password); //os casos de uso ira chamar esse metodo e salva o usuario
}
