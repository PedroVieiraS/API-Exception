package com.exception.exception;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExceptionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExceptionApplication.class, args);

		LimpaWindows.limpa_windows();
		//Calculadora.Calcular();
		Menu.Menuinicial();
	}

}
