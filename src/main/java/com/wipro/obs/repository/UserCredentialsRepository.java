package com.wipro.obs.repository;

import com.wipro.obs.entity.UserCredentials;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserCredentialsRepository extends JpaRepository<UserCredentials,String> {
}
