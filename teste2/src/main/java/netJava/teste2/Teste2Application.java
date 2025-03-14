package netJava.teste2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import netJavamodel.Usuario;
import net_javarepositorio.UsuarioRepositorio;

@SpringBootApplication
public class Teste2Application  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Teste2Application.class, args);
	}
	@Autowired 
	private UsuarioRepositorio usuarioRepositorio;
	
	@Override
	public void run(String...args) throws Exception{
	
		this.usuarioRepositorio.save(new Usuario("wendel","wendel@gmail.com") );
		this.usuarioRepositorio.save(new Usuario("teste2","teste@gmail.com"));
		
	}

}
