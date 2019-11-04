/**
 * @author RAPHAEL F.
 * OBJETIVO: UTILIZAR O SPRING BOOT (CRUD)
 * 
 * Sobre a API que desenvolveremos ao longo do curso e sobre as classes de domínio dela;
 * Que, para um método no controller não encaminhar a requisição a uma página JSP, ou Thymeleaf, devemos utilizar a anotação @ResponseBody;
 * Que o Spring, por padrão, converte os dados no formato JSON, utilizando a biblioteca Jackson;
 * Que, para não repetir a anotação @ResponseBody em todos os métodos do controller, devemos utilizar a anotação @RestController;
 * Que, para não precisar reiniciar manualmente o servidor a cada alteração feita no código, basta utilizar o módulo Spring Boot DevTools;
 * Que não é uma boa prática retornar entidades JPA nos métodos dos controllers, sendo mais indicado retornar classes que seguem o padrão DTO (Data Transfer Object);
 * Os principais conceitos sobre o modelo arquitetural REST, como recursos, URIs, verbos HTTP, Representações e comunicação stateless.
 * 
 */

package br.com.alura.forum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSpringDataWebSupport
@EnableCaching
@EnableSwagger2
public class ForumApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForumApplication.class, args);
	}

}
