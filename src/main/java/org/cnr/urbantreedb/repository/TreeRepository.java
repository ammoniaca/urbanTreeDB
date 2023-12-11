package org.cnr.urbantreedb.repository;

import org.cnr.urbantreedb.entity.TreeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TreeRepository
        extends JpaRepository<TreeEntity, Long> {
}
