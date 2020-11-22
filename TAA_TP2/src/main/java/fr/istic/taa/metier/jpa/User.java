package fr.istic.taa.metier.jpa;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User implements Serializable {
    private Long id;
    private String name;
    private Collection<Fiche> fiche;

    public User() {
    }

    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public User(Long id, String name, Collection<Fiche> fiche) {
        this.id = id;
        this.name = name;
        this.fiche = fiche;
    }

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "user", cascade = CascadeType.PERSIST)
    public Collection<Fiche> getListFiche() {
        return fiche;
    }

    public void setListFiche(Collection<Fiche> fiche) {
        this.fiche = fiche;
    }
}
