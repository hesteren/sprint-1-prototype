package io.kalipo.prototype.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "USERS")
public class User {

    @Id
    @GeneratedValue
    public Long id;

    private String name;

    protected User() {}

    public User(String name) {
        this.name = name;
    }
}
