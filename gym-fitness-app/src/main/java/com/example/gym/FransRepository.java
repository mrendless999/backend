package com.example.gym;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FransRepository extends JpaRepository<Frans, Long> {

}