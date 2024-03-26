package com.Flores.FloresPage.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Flores.FloresPage.Domain.Usuario;

public interface UsuarioDao extends  JpaRepository <Usuario,Long>{
    Usuario findByUsername(String username);
    
}
