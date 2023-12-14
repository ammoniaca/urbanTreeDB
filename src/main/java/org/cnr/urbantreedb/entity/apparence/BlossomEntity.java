package org.cnr.urbantreedb.entity.apparence;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.cnr.urbantreedb.entity.TreeEntity;
import org.cnr.urbantreedb.enums.MonthEnum;
import org.cnr.urbantreedb.enums.apparence.blossom.BlossomColorEnum;
import org.cnr.urbantreedb.enums.apparence.blossom.BlossomInflorescenceEnum;

import java.util.List;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "blossoms")
public class BlossomEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "blossom_id", updatable = false, nullable = false)
    private Long blossomId;

    @Column(name = "odor")
    private boolean isBlossomOdor;

    @Column(name = "ornamental")
    private Boolean isBlossomOrnamental;

    @Column(name = "inflorescence")
    private Set<BlossomInflorescenceEnum> inflorescence;

    @Column(name = "color")
    private Set<BlossomColorEnum> blossomColor;

    @Column(name = "period")
    private Set<MonthEnum> blossomPeriod;

    @OneToOne(mappedBy = "blossom")
    private TreeEntity treeEntity;

}
