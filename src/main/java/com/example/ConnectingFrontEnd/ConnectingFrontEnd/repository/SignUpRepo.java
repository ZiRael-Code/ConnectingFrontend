package com.example.ConnectingFrontEnd.ConnectingFrontEnd.repository;

import com.example.ConnectingFrontEnd.ConnectingFrontEnd.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SignUpRepo extends JpaRepository<User, Long> {
}
