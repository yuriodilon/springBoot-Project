package anotacoes;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Entity // represetna essa classe como uma tabela no banco de dados
@Table(name ="tb_anotacoes") // Declara o nome da tabela no banco de dados

@RestController  // informa que a classe em questão será uma controladora
@RequestMapping("/anotacoes") // Define um path ou um caminho da requisição

public class anotacoes {

	@GetMapping("") // mapear todas as solicitações get
	public String listaAnotações() {
		return "Olá";
	}
	
	//@PostMapping("") // para lidar com os métodos post
	
	@Id // informa que será a chave primária da tabela
	private Long id;
	
	@GeneratedValue
	
	
	
}
