package com.rizwan.userapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rizwan.userapi.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
