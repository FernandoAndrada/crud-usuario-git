package br.com.senaifuturodev.crudusuario.controler;

import br.com.senaifuturodev.crudusuario.mode.entity.Usuario;
import br.com.senaifuturodev.crudusuario.model.entity.model.service.UsuarioService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuarios")

public class UsuarioControler {

    UsuarioService usuarioService = new UsuarioService();

    @GetMapping
    public List<Usuario> listarUsuarios(){
        Usuario usuario = new Usuario();
        usuario.setNome("Fernando");
        this.usuarioService.getUsuarios().add(usuario);
        return this.usuarioService.getUsuarios();
    }

}
