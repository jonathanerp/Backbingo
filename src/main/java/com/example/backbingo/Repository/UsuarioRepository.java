package com.example.backbingo.Repository;

import com.example.backbingo.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository

public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
}
