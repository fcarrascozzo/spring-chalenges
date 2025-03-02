package com.springchalenges.injecaoDeDependencia;

import com.springchalenges.injecaoDeDependencia.entities.Order;
import com.springchalenges.injecaoDeDependencia.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class InjecaoDeDependenciaApplication implements CommandLineRunner {
	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(InjecaoDeDependenciaApplication.class, args);
	}

	@Override
	public void run(String... args) {
		Scanner scanner = new Scanner(System.in);

		boolean continuar = true;

		while (continuar) {
			System.out.print("Digite o código do pedido: ");
			int code = scanner.nextInt();

			System.out.print("Digite o valor do pedido: ");
			double value = scanner.nextDouble();

			System.out.print("Digite o percentual de desconto: ");
			double discount = scanner.nextDouble();

			Order order = new Order(code, value, discount);
			double total = orderService.total(order);

			System.out.printf("Pedido código %d%nValor total: R$ %.2f%n", order.getCode(), total);

			System.out.print("Deseja fazer outro pedido? (s/n): ");
			String resposta = scanner.next().trim().toLowerCase();

			continuar = resposta.equals("s");
		}

		System.out.println("Encerrando o programa...");
		scanner.close();
	}

}
