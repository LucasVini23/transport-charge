package br.com.lucasvini.transportcharge;

import br.com.lucasvini.transportcharge.model.Cliente;
import br.com.lucasvini.transportcharge.model.Entregador;
import br.com.lucasvini.transportcharge.repository.ClienteRepository;
import br.com.lucasvini.transportcharge.repository.EntregadorRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TransportChargeApplication {

	@Autowired
	ClienteRepository repository;

	@Autowired
	EntregadorRepository entregadorRepository;

	public static void main(String[] args) {
		SpringApplication.run(TransportChargeApplication.class, args);
	}

	@Bean
	InitializingBean sendDatabase(){
		return () -> {
			repository.save(Cliente.builder()
					.cnpj("07.913.733/0001-66")
					.fantasyName("Omega Industries")
					.charge("782")
					.cep("05481-579")
					.segment("Tratores")
					.build());
			repository.save(Cliente.builder()
					.cnpj("44.956.640/0001-45")
					.fantasyName("Wolf Industries")
					.charge("42")
					.cep("03761-231")
					.segment("Madeireira")
					.build());

			entregadorRepository.save(Entregador.builder()
					.cpf("059.962.180-03")
					.nome("Lucas Vini")
					.cep("05951-534")
					.veiculo("caminhão")
					.carga("42").build());

		};
	}

}
