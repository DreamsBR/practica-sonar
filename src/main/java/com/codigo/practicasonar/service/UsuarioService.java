package com.codigo.practicasonar.service;

import com.codigo.practicasonar.entity.Usuario;
import com.codigo.practicasonar.repository.UsuarioRepository;
import org.springframework.http.ResponseEntity;

public interface UsuarioService {
    ResponseEntity<Usuario> crearUsuario(Usuario usuario);
    ResponseEntity<Usuario> obtenerUsuario(Long id);
}
