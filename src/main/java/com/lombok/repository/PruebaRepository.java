package com.lombok.repository;

import com.lombok.model.PruebaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PruebaRepository extends JpaRepository<PruebaModel, Long> {
}
