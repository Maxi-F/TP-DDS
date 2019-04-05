package queMePongo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PrendaTest {

	private Prenda remeraRoja;
	private Prenda camisetaBoca;

	@Before
	public void init() {

		remeraRoja = new Prenda(ColorRopa.ROJO, Tela.ALGODON, "remera", Categoria.SUPERIOR);

		camisetaBoca = new Prenda(ColorRopa.AZUL, ColorRopa.AMARILLO, Tela.NYLON, "camiseta", Categoria.SUPERIOR);

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
