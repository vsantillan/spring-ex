package mx.com.adea.projects.pojos;

import javax.persistence.*;

/**
 * Creado por visantillan on 25/01/2017.
 */
@Entity
@Table(name = "AP_DOCUMENTOS", schema = "VISANTILLAN", catalog = "")
public class ApDocumentosEntity {
	private int idDoc;
	private String documento;
	private String tipoDoc;

	@Id
	@Column(name = "ID_DOC")
	public int getIdDoc() {
		return idDoc;
	}

	public void setIdDoc(int idDoc) {
		this.idDoc = idDoc;
	}

	@Basic
	@Column(name = "DOCUMENTO")
	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	@Basic
	@Column(name = "TIPO_DOC")
	public String getTipoDoc() {
		return tipoDoc;
	}

	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		ApDocumentosEntity that = (ApDocumentosEntity) o;

		if (idDoc != that.idDoc) return false;
		if (documento != null ? !documento.equals(that.documento) : that.documento != null) return false;
		if (tipoDoc != null ? !tipoDoc.equals(that.tipoDoc) : that.tipoDoc != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = idDoc;
		result = 31 * result + (documento != null ? documento.hashCode() : 0);
		result = 31 * result + (tipoDoc != null ? tipoDoc.hashCode() : 0);
		return result;
	}
}
