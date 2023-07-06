package com.descriptores.sistema;


import com.descriptores.sistema.excepciones.UsuarioFoundException;
import com.descriptores.sistema.modelo.Rol;
import com.descriptores.sistema.modelo.Usuario;
import com.descriptores.sistema.modelo.UsuarioRol;
import com.descriptores.sistema.servicios.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.HashSet;
import java.util.Set;


@SpringBootApplication
public class SysDescriptoresBackendApplication implements CommandLineRunner{


    @Autowired
    private UsuarioService usuarioService;


    public static void main(String[] args) {
        SpringApplication.run(SysDescriptoresBackendApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
			/*try{
			Usuario usuario = new Usuario();
			usuario.setNombre("Mitzy");
			usuario.setApellido("Leon");
			usuario.setUsername("Mitz");
			usuario.setPassword("12345");
			usuario.setEmail("mitlen@gmail.com");
			usuario.setTelefono("890345789");
			usuario.setPerfil("foto.png");
			Rol rol = new Rol();
			rol.setRolId(1L);
			rol.setRolNombre("ADMIN");

			Set<UsuarioRol> usuariosRoles = new HashSet<>();
			UsuarioRol usuarioRol = new UsuarioRol();
			usuarioRol.setRol(rol);
			usuarioRol.setUsuario(usuario);
			usuariosRoles.add(usuarioRol);
			Usuario usuarioGuardado = usuarioService.guardarUsuario(usuario,usuariosRoles);
			System.out.println(usuarioGuardado.getUsername());
		}catch (UsuarioFoundException exception){
			exception.printStackTrace();
		}*/
    }
}



