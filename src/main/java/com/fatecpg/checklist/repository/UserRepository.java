package com.fatecpg.checklist.repository;

import com.fatecpg.checklist.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

    @Query("select u from User u WHERE email = :email ")
    User findByEmail(@Param("email") String email);

}
