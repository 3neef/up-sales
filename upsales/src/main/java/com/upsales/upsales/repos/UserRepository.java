package com.upsales.upsales.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.upsales.upsales.models.User;

@Repository
@EnableJpaRepositories
public interface UserRepository extends JpaRepository<User, Long>{

}
