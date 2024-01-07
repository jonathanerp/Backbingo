package com.example.backbingo.Entity;


import jakarta.persistence.*;

@Entity
@Table(name="usuario")

public class Usuario {
    @Id
    @Column(name="usuario_id", length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int usuarioid;

    @Column(name="usuario_name", length = 255)
    private String usuarioname;

    @Column(name="password", length = 255)
    private String password;

    public Usuario() {
    }

    public Usuario(int usuarioid, String usuarioname, String password) {
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
