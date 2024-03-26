package com.Flores.FloresPage.Domain;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Entity
@Data
@Table(name = "usuarios")
public class Usuario implements Serializable{
    private static final long serialVersionUID =1L; 
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long iduser;
    @NotEmpty
    private String username;
    @NotEmpty
    private String passwords;
    @OneToMany
    @JoinColumn(name = "userid")
    private List<Rol> Roles;

}
