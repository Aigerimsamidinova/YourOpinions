package com.example.projectXX.repository;

import com.example.projectXX.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRep extends JpaRepository<Category,Long> {
}
