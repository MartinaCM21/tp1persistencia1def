package com.utn.tp1persistencia1;

import com.utn.tp1persistencia1.repository.*;
import com.utn.tp1persistencia1.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.utn.tp1persistencia1.*;

import java.util.Date;

@SpringBootApplication
public class Tp1persistencia1Application {

	@Autowired
	ClienteRepository clienteRepository;
	@Autowired
	DetallePedidoRepository detallePedidoRepository;
	@Autowired
	DomicilioRepository domicilioRepository;
	@Autowired
	FacturaRepository facturaRepository;
	@Autowired
	PedidoRepository pedidoRepository;
	@Autowired
	ProductoRepository productoRepository;
	@Autowired
	RubroRepository rubroRepository;

	public static void main(String[] args) {
		SpringApplication.run(Tp1persistencia1Application.class, args);
	}

	@Bean
	CommandLineRunner init(ClienteRepository clienteRepo){
		return args -> {
			Domicilio domicilio = Domicilio.builder().calle("palma")
					.numero("1645")
					.localidad("Maipu")
					.build();

			Factura factura = Factura.builder().numero(130)
					.fecha(new Date())
					.descuento(500.00)
					.formaPago("efectivo")
					.total(500)
					.build();

			Producto producto = Producto.builder()
					.tipo("comida")
					.tiempoEstimadoCocina(50)
					.denominacion("ensalada")
					.precioVenta(1000.00)
					.precioCompra(1500.00)
					.stockActual(3)
					.stockMinimo(3)
					.unidadMedida("gramos")
					.receta("lechuga y tomate")
					.build();

			DetallePedido detallePedido = DetallePedido.builder()
					.cantidad(2)
					.subtotal(300.00)
					.build();



			Pedido pedido = Pedido.builder().estado("entregado")
					.fecha(new Date())
					.tipoEnvio("delivery")
					.total(1000.00)
					.build();



			Cliente cliente = Cliente.builder().nombre("Taylor")
							.apellido("Swift")
					.telefono("26155555")
					.email("fr@gmail.com")
					.build();

			Rubro rubro = Rubro.builder().denominacion("restaurante")
					.build();

			clienteRepository.save(cliente);
			domicilioRepository.save(domicilio);
			detallePedidoRepository.save(detallePedido);
			facturaRepository.save(factura);
			pedidoRepository.save(pedido);
			productoRepository.save(producto);
			rubroRepository.save(rubro);

		};

	}
}
