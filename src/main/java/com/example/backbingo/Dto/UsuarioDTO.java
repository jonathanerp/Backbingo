package com.example.backbingo.Dto;

public class UsuarioDTO {

    private int usuarioid;
    private String usuarioname;
    private String password;

    public UsuarioDTO() {
    }

    public UsuarioDTO(int usuarioid, String usuarioname, String password) {
        this.usuarioid = usuarioid;
        this.usuarioname = usuarioname;
        this.password = password;
    }

    public int getUsuarioid() {
        return usuarioid;
    }

    public void setUsuarioid(int usuarioid) {
        this.usuarioid = usuarioid;
    }

    public String getUsuarioname() {
        return usuarioname;
    }

    public void setUsuarioname(String usuarioname) {
        this.usuarioname = usuarioname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Id: " + usuarioid + " - Nombre: " + usuarioname + " - Password: " + password;
    }
}
