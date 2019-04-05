package queMePongo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PrendaTest {

	private Prenda remeraRoja;
	private Prenda camisetaBoca;
	
	@Before
	public void init(){
		
		PrendaBuilder constructorRemeraRoja = new PrendaBuilder();
		PrendaBuilder constructorCamisetaBoca= new PrendaBuilder();
		
		remeraRoja = constructorRemeraRoja
				.setTipo("remera")
				.setCategoria(Categoria.SUPERIOR)
				.setColorPrimario(ColorRopa.ROJO)
				.setTela(Tela.ALGODON)
				.crear();
		
		camisetaBoca = constructorCamisetaBoca
				.setTipo("camiseta")
				.setCategoria(Categoria.SUPERIOR)
				.setColorPrimario(ColorRopa.AZUL)
				.setColorSecundario(ColorRopa.AMARILLO)
				.setTela(Tela.ALGODON)
				.crear();
		
	}
	
	
	@Test
	public void remeraRojaEsRoja() {
		Assert.assertEquals(ColorRopa.ROJO, remeraRoja.getColorPrimario());
	}
	
	@Test
	public void camisetaBocaEsBoca() {
		Assert.assertEquals(ColorRopa.AZUL, camisetaBoca.getColorPrimario());
		Assert.assertEquals(ColorRopa.AMARILLO, camisetaBoca.getColorSecundario());
	}

}
