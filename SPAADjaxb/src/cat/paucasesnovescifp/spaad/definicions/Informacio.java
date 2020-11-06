package cat.paucasesnovescifp.spaad.definicions;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="eina")
@XmlType(propOrder = {"cod","nom","tamany"})
public class Informacio {
	private String codi;
	private String nom;
	private int tamany;
	
    @XmlAttribute
	public String getCodi() {
		return codi;
	}
	
	public void setCodi(String codi) {
		this.codi = codi;
	}
	
    @XmlAttribute
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
    @XmlAttribute
	public int getTamany() {
		return tamany;
	}
	
	public void setTamany(int tamany) {
		this.tamany = tamany;
	}
	
	@Override
	public String toString() {
		return "Eina [codi=" + codi + ", nom=" + nom + ", tamany=" + tamany + "]";
	}
	
}
