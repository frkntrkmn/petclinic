package com.furkan.petclinic.repository;

import com.furkan.petclinic.repository.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
