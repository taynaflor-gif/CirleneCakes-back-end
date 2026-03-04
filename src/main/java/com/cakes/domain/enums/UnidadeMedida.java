package com.cakes.domain.enums;

public enum UnidadeMedida {

	KG("kg"), UN("un");

	private String unidadeMedida;

	private UnidadeMedida(String unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

	public String getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida(String unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

}
