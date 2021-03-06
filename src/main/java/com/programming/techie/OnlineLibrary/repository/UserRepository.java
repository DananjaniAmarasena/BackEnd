package com.programming.techie.OnlineLibrary.repository;

import com.programming.techie.OnlineLibrary.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	Optional<User> findByUserName(String userName);
	Optional<User> findByEmail(String email);
	List<User> findByRoleId(int roleId);

}
