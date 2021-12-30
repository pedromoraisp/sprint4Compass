package sprint4api.api.compass.controller.formDto;

import java.util.Objects;

public class VinculaAssociadoNoPartidoForm {
	
	private long idPartido;
	private long idAssociado;
	public long getIdPartido() {
		return idPartido;
	}
	public void setIdPartido(long idPartido) {
		this.idPartido = idPartido;
	}
	public long getIdAssociado() {
		return idAssociado;
	}
	public void setIdAssociado(long idAssociado) {
		this.idAssociado = idAssociado;
	}
	@Override
	public int hashCode() {
		return Objects.hash(idAssociado, idPartido);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VinculaAssociadoNoPartidoForm other = (VinculaAssociadoNoPartidoForm) obj;
		return idAssociado == other.idAssociado && idPartido == other.idPartido;
	}
	@Override
	public String toString() {
		return "VinculaAssociadoNoPartidoForm [idPartido=" + idPartido + ", idAssociado=" + idAssociado
				+ ", getIdPartido()=" + getIdPartido() + ", getIdAssociado()=" + getIdAssociado() + ", hashCode()="
				+ hashCode() + ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}
	
	

}
