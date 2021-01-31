package com.kar.hellorest.repository;

import com.kar.hellorest.entity.Name;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NameRepository extends JpaRepository<Name, Long> {
}
