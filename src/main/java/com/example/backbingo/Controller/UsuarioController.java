package com.example.backbingo.Controller;

import com.example.backbingo.Dto.UsuarioDTO;
import com.example.backbingo.Service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/usuarios")

public class UsuarioController {

    @Autowired
    private IUsuarioService usuarioService;

    @PostMapping("registrar")
    public String registrarUsuario(@RequestBody UsuarioDTO usuarioDTO) {
        String id = usuarioService.addUsuario(usuarioDTO);
        return id;
    }

    /*@PostMapping(path = "/login")
    public ResponseEntity<?> loginUsuario(@RequestBody LoginDTO loginDTO)
    {
        LoginResponse loginResponse = usuarioService.loginUsuario(loginDTO);
        return ResponseEntity.ok(loginResponse);
    }*/
}
