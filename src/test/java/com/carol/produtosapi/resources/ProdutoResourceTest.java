package com.carol.produtosapi.resources;

import java.math.BigDecimal;

import static org.mockito.Mockito.when;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;
import static io.restassured.module.mockmvc.RestAssuredMockMvc.standaloneSetup;

import com.carol.produtosapi.domain.Estoque;
import com.carol.produtosapi.domain.Produto;
import com.carol.produtosapi.services.ProdutoService;

import io.restassured.http.ContentType;


@WebMvcTest
class ProdutoResourceTest {
	
	@Autowired
	private ProdutoResource resource;

	@MockBean
	private ProdutoService service; 
	
	@BeforeEach
    public void setUp() {
		standaloneSetup(this.resource);
    }
	
	@Test
	void fazOGetPeloId_devolveProduto() {
		
		Estoque estoque = new Estoque(2);
		Produto produto = new Produto();
		
		produto.setId(1L);
		produto.setDescricao("Notebook Dell");
		produto.setValor(new BigDecimal(6200.0));
		produto.setEstoque(estoque);
		
		when(this.service.find(1L))
			.thenReturn(produto);
		
		given()
			.accept(ContentType.JSON)
		.when()
			.get("/produtos/{id}", 1L)
		.then()
			.statusCode(HttpStatus.OK.value());
		
//		mock.perform(get("/produtos").contentType(MediaType.APPLICATION_JSON))
//		.andExpect(status().isOk())
//		.andExpect(jsonPath("$.id", is(1L)))
//		.andExpect(jsonPath("$.descricao", is("Notebook Dell")))
//		.andExpect(jsonPath("$.valor", is(new BigDecimal(6200.0))))
//		.andExpect(jsonPath("$.quantidade", is(2)));
//		
//		verify(service, times(1)).find(1L);
	}

}
