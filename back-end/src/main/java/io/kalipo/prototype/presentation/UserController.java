package io.kalipo.prototype.presentation;

import io.kalipo.prototype.application.UserService;
import io.kalipo.prototype.domain.User;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    @PostMapping
    public ResponseEntity<User> create(String name) {
        return ResponseEntity.ok(this.userService.create(name));
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> read(@PathVariable Long id) {
        return ResponseEntity.ok(this.userService.read(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> update(@PathVariable Long id, @RequestBody String name) {
        return ResponseEntity.ok(this.userService.update(id, name));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        this.userService.delete(id);
        return ResponseEntity.ok("User with id: " + id + " deleted");
    }
}
