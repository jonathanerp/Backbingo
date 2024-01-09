package com.example.backbingo.Service.impl;

import com.example.backbingo.Dto.UsuarioDTO;
import com.example.backbingo.Entity.Usuario;
import com.example.backbingo.Repository.UsuarioRepository;
import com.example.backbingo.Service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

public class UsuarioService implements IUsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public String addUsuario(UsuarioDTO usuarioDTO) {

        Usuario usuario = new Usuario(
                usuarioDTO.getUsuarioid(),
                usuarioDTO.getUsuarioname(),
                this.passwordEncoder.encode(usuarioDTO.getPassword())
        );
        usuarioRepository.save(usuario);
        return usuario.getUsuarioname();
    }
}
