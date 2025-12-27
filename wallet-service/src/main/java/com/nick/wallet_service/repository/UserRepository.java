package com.nick.wallet_service.repository;

import com.nick.wallet_service.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, Long> {
}
