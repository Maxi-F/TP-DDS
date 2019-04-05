package queMePongo;

public class Prenda {

	ColorRopa colorPrimario;
	ColorRopa colorSecundario = ColorRopa.ACROMATICO;
	Tela tela;
	String tipo;
	Categoria categoria;
	
	public ColorRopa getColorPrimario() {
		return colorPrimario;
	}
	public void setColorPrimario(ColorRopa colorPrimario) {
		this.colorPrimario = colorPrimario;
	}
	public ColorRopa getColorSecundario() {
		return colorSecundario;
	}
	public void setColorSecundario(ColorRopa colorSecundario) {
		this.colorSecundario = colorSecundario;
	}
	public Tela getTela() {
		return tela;
	}
	public void setTela(Tela tela) {
		this.tela = tela;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	

}
