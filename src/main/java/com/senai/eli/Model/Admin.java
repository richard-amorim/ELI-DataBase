package com.senai.eli.Model;

import java.time.LocalDateTime;

import com.senai.eli.Validator.Usuario.Usuario;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.Setter;

@Table(name = "admin")
@Entity
@Getter
@Setter
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "email", nullable = false)
    private Email email;   

    @Column(name = "senha", nullable = false)    
    private String senha;

    @Column(name = "usuario", nullable = false)
    @Usuario    
    private String usuario;

    @Column(name = "ultimo_acesso", nullable = false)    
    private LocalDateTime ultimo_acesso;
}
