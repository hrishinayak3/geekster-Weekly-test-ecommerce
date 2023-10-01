package com.geekster.Ecommerce.API.Creation.repo;

import com.geekster.Ecommerce.API.Creation.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
}
