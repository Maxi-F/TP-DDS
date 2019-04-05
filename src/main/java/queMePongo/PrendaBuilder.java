package queMePongo;

public class PrendaBuilder {

	private Prenda prenda = new Prenda();

	public PrendaBuilder setColorPrimario(ColorRopa colorPrimario) {
		this.prenda.setColorPrimario(colorPrimario);
		return this;
	}

	public PrendaBuilder setColorSecundario(ColorRopa colorSecundario) {
		this.prenda.setColorSecundario(colorSecundario);
		return this;
	}

	public PrendaBuilder setTela(Tela tela) {
		this.prenda.setTela(tela);
		return this;
	}

	public PrendaBuilder setTipo(String tipo) {
		this.prenda.setTipo(tipo);
		return this;
	}

	public PrendaBuilder setCategoria(Categoria categoria) {
		this.prenda.setCategoria(categoria);
		return this;
	}
	
	public Prenda crear() {
		// validarEntrada();
		return this.prenda;
	}


}
