package fr.istic.taa.metier.dao.generic;

import fr.istic.taa.metier.jpa.Fiche;

public class FicheDao extends AbstractJpaDao<Long, Fiche> {


    public FicheDao() {
        super(Fiche.class);
    }
    

}
