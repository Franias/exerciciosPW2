package dev.ifrs.interfaceadapters.user.repository.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class UserEntity {//extends PanacheEntity{ //panache cria com id
    //tabela do banco de dados, pode user USER para criar a tabela
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String password;

    
}
