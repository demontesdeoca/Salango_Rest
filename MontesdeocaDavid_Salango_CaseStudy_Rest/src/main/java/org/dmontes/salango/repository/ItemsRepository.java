package org.dmontes.salango.repository;

import org.dmontes.salango.model.Items;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ItemsRepository extends JpaRepository<Items, Integer> {

}
