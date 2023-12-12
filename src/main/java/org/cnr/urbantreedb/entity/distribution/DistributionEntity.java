package org.cnr.urbantreedb.entity.distribution;


import jakarta.persistence.*;
import lombok.*;
import org.cnr.urbantreedb.enums.distribution.ZoneEnum;
import org.cnr.urbantreedb.entity.TreeEntity;

import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "distributions")
public class DistributionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "distribution_id", updatable = false, nullable = false)
    private Long distribution_id;

    @Column(name = "neophyte")
    private Boolean isNeophyte; // True if introduced to Europe after 1492

    @Column(name = "zones")
    private Set<ZoneEnum> zones;

    @OneToOne(mappedBy = "distribution")
    private TreeEntity treeEntity;

}
