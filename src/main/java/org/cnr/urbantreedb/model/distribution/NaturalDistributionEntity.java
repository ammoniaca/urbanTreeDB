package org.cnr.urbantreedb.model.distribution;


import jakarta.persistence.*;
import org.cnr.urbantreedb.enums.distribution.OriginEnum;

@Entity
@Table(name = "distribution")
public class NaturalDistributionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long naturalDistributionId;

    // TODO: magari spostarla su TreeEntity
    @Column(name = "neophyte")
    private boolean neophyte; // True if introduced to Europe after 1492

    @Column(name = "origin")
    private OriginEnum origin;

}
