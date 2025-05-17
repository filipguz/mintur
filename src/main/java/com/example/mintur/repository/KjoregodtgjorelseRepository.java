package com.example.mintur.repository;

import com.example.mintur.model.Kjoregodtgjorelse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KjoregodtgjorelseRepository extends JpaRepository<Kjoregodtgjorelse, Long> {
}