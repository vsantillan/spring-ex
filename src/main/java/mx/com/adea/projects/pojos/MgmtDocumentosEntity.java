package mx.com.adea.projects.pojos;

import javax.persistence.*;

/**
 * Crated by Victor Santillán on 17/01/2017.
 * visantillan@adeamexico.com.mx
 */
@Entity
@Table(name = "MGMT_DOCUMENTOS", schema = "VISANTILLAN", catalog = "")
public class MgmtDocumentosEntity {
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

		MgmtDocumentosEntity that = (MgmtDocumentosEntity) o;

		if (idDoc != that.idDoc) return false;
		if (documento != null ? !documento.equals(that.documento) : that.documento != null)
			return false;
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
