package io.kalipo.prototype.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "USERS")
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToMany
    private List<Nft> nfts;

    protected User() {}

    public User(String name) {
        this.name = name;
        this.nfts = new ArrayList<>();
    }

    public void addNft(Nft nft) {
        this.nfts.add(nft);
    }
}
