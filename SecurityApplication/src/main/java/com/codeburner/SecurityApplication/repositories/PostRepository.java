package com.codeburner.SecurityApplication.repositories;

import com.codeburner.SecurityApplication.dto.PostDTO;
import com.codeburner.SecurityApplication.entities.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<PostEntity, Long> {
}
