package queMePongo;

public class Prenda {

	ColorRopa colorPrimario;
	ColorRopa colorSecundario = ColorRopa.ACROMATICO;
	Tela tela;
	String tipo;
	Categoria categoria;

	public Prenda(ColorRopa colorPrimario, ColorRopa colorSecundario, Tela tela, String tipo, Categoria categoria) {
		this.colorPrimario = colorPrimario;
		this.colorSecundario = colorSecundario;
		this.tela = tela;
		this.tipo = tipo;
		this.categoria = categoria;
	}
	
	public Prenda(ColorRopa colorPrimario, Tela tela, String tipo, Categoria categoria) {
		this.colorPrimario = colorPrimario;
		this.tela = tela;
		this.tipo = tipo;
		this.categoria = categoria;
	}
	public ColorRopa getColorPrimario() {
		return colorPrimario;
	}

	public ColorRopa getColorSecundario() {
		return colorSecundario;
	}

	public Tela getTela() {
		return tela;
	}

	public String getTipo() {
		return tipo;
	}

	public Categoria getCategoria() {
		return categoria;
	}

}
