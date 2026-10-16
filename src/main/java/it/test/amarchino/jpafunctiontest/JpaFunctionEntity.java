package it.test.amarchino.jpafunctiontest;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

// Entity created only to enable JPA repository usage
@Entity
public class JpaFunctionEntity {

    @Id
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
