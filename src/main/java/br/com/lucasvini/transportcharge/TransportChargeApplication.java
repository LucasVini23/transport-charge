package br.com.lucasvini.transportcharge;

import br.com.lucasvini.transportcharge.model.Carga;
import br.com.lucasvini.transportcharge.model.Cliente;
import br.com.lucasvini.transportcharge.model.Entregador;
import br.com.lucasvini.transportcharge.repository.CargaRepository;
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
	ClienteRepository clienteRepository;

	@Autowired
	EntregadorRepository entregadorRepository;

	@Autowired
	CargaRepository cargaRepository;

	public static void main(String[] args) {
		SpringApplication.run(TransportChargeApplication.class, args);
	}

	@Bean
	InitializingBean sendDatabase(){
		return () -> {



			clienteRepository.save(Cliente.builder()
					.cnpj("07.913.733/0001-66")
					.fantasyName("Omega Industries")
					.cep("05481-579")
					.segment("Tratores")
					.build());
			Cliente cliente = clienteRepository.save(Cliente.builder()
					.cnpj("44.956.640/0001-45")
					.fantasyName("Wolf Industries")
					.cep("03761-231")
					.segment("Madeireira")
					.build());

			Entregador entregador = entregadorRepository.save(Entregador.builder()
					.cpf("059.962.180-03")
					.nome("Andy Silva")
					.cep("05951-534")
					.veiculo("Caminhão")
					.build());

			Carga palete = Carga.builder()
					.peso(42l)
					.preco("500")
					.destino("Belo Horizonte")
					.descricao("Paletes de Madeira")
					.entregador(entregador)
					.cliente(cliente).build();

			cargaRepository.save(palete);

		};
	}

}
