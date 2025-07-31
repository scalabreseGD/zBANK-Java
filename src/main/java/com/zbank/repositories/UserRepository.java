package com.zbank.repositories;

import com.zbank.models.User;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class UserRepository {
    private final Map<Long, User> users = new HashMap<>();
    private Long nextId = 1L;

    public User save(User user) {
        if (user.getId() == null) {
            user.setId(nextId++);
        }
        users.put(user.getId(), user);
        return user;
    }

    public Optional<User> findById(Long id) {
        return Optional.ofNullable(users.get(id));
    }

    public Optional<User> findByUsername(String username) {
        return users.values().stream()
                .filter(user -> user.getUsername().equals(username))
                .findFirst();
    }

    public void deleteById(Long id) {
        users.remove(id);
    }

    public Map<Long, User> findAll() {
        return new HashMap<>(users);
    }
}
