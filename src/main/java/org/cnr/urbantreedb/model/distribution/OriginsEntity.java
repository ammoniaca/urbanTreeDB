package org.cnr.urbantreedb.model.distribution;


import jakarta.persistence.*;
import org.cnr.urbantreedb.enums.distribution.OriginEnum;
import org.cnr.urbantreedb.model.TreeEntity;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "distribution")
public class OriginsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "origin_id", updatable = false, nullable = false)
    private Long originId;

    @Column(name = "neophyte")
    private boolean neophyte; // True if introduced to Europe after 1492

    @ElementCollection(
            targetClass = String.class,
            fetch = FetchType.EAGER
    )
    @CollectionTable(
            name = "origins",
            joinColumns = @JoinColumn(name = "origin_id", nullable = false),
            uniqueConstraints = @UniqueConstraint(columnNames = {"origin_id"})
    )
    @Column(name = "origin")
    private List<OriginEnum> origins = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name="tree_id", nullable=false)
    private TreeEntity tree;

}
