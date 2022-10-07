package br.com.senaifuturodev.crudusuario.model.entity.model.service;

import br.com.senaifuturodev.crudusuario.mode.entity.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioService {

    private List<Usuario> usuarios = new ArrayList<>();

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public void salvar(Usuario usuario){
        this.usuarios.add(usuario);

    }
}
