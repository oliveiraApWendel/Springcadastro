package netJavacontrolador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net_javarepositorio.UsuarioRepositorio;

import netJavamodel.*;

@RestController
@RequestMapping("api/")
public class UsarioControloador {
	
	@Autowired
	private UsuarioRepositorio usuarioRepositorio;
	
	
	// TODO Auto-generated constructor stub
	@GetMapping("Usuario")
	public List<Usuario> getUsuarios(){
		return this.usuarioRepositorio.findAll();
			
	
	}

}
