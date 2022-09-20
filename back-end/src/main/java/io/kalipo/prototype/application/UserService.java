package io.kalipo.prototype.application;

import io.kalipo.prototype.data.UserRepository;
import io.kalipo.prototype.domain.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private UserRepository userRepository;
    private NftService nftService;
    public User create(String name) {
        this.userRepository.save(new User(name));
        return this.userRepository.findTopByOrderByIdDesc();
    }

    public User read(Long id) {
        return this.userRepository.findById(id).orElseThrow();
    }

    public User update(Long id, String name) {
        User u = this.userRepository.findById(id).orElseThrow();
        u.setName(name);
        this.userRepository.save(u);
        return u;
    }

    public void delete(Long id) {
        this.userRepository.deleteById(id);
    }

    public User addNft(Long userId, Long nftId) {
        User u = this.userRepository.findById(userId).orElseThrow();
        u.addNft(this.nftService.read(nftId));
        this.userRepository.save(u);
        return u;
    }
}
