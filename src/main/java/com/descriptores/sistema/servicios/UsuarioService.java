package com.descriptores.sistema.servicios;



import com.descriptores.sistema.modelo.Usuario;
import com.descriptores.sistema.modelo.UsuarioRol;

import java.util.Set;
public interface UsuarioService {

    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception;

    public Usuario obtenerUsuario(String username);

    public void eliminarUsuario(Long usuarioId);
}
