package fr.istic.taa.metier.dao.generic;

import fr.istic.taa.metier.jpa.Kanban;

public class KanbanDao extends AbstractJpaDao<Long, Kanban>{

    public KanbanDao() {
        super(Kanban.class);
    }

    public void createKanban(Kanban kanban){
        this.save(kanban);
    }
}
