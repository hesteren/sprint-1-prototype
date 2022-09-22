package io.kalipo.prototype.presentation;

import io.kalipo.prototype.application.UserService;
import io.kalipo.prototype.domain.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
@CrossOrigin
public class UserController {

    private UserService userService;

    @PostMapping
    public ResponseEntity<User> create(@RequestBody UserDto userDto) {
        return ResponseEntity.ok(this.userService.create(userDto.getName()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> read(@PathVariable Long id) {
        return ResponseEntity.ok(this.userService.read(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> update(@PathVariable Long id, @RequestBody UserDto userDto) {
        return ResponseEntity.ok(this.userService.update(id, userDto.getName()));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        this.userService.delete(id);
        return ResponseEntity.ok("User with id: " + id + " deleted");
    }

    @PostMapping("/{userId}/nft/{nftId}")
    public ResponseEntity<User> addNft(@PathVariable Long userId, @PathVariable Long nftId) {
        return ResponseEntity.ok(this.userService.addNft(userId, nftId));
    }

    @GetMapping()
    public ResponseEntity<List<User>> index() {
        return ResponseEntity.ok(this.userService.index());
    }
}

@Data
class UserDto {
    private String name;
}
