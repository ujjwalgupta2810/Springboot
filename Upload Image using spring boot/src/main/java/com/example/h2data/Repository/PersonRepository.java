package com.example.h2data.Repository;
import com.example.h2data.Entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
    // You can add custom queries here if needed
}
