package fr.istic.taa.metier.jpa;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
public class Kanban implements Serializable {
    private Long id;
    private String nom;
    /**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	private Collection<Section> listSection;

    public Kanban() {
    }

    public Kanban(Long id, Collection<Section> listSection) {
        this.id = id;
        this.listSection = listSection;
    }

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @OneToMany(mappedBy = "kanban", cascade = CascadeType.PERSIST)
    public Collection<Section> getListSection() {
        return listSection;
    }

    public void setListSection(Collection<Section> listSection) {
        this.listSection = listSection;
    }
}
